package com.ruoyi.ruoyi_yiliao.interceptor;

import com.ruoyi.common.utils.DataBus;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.ruoyi_yiliao.annotion.Add;
import com.ruoyi.ruoyi_yiliao.domain.*;
import com.ruoyi.ruoyi_yiliao.service.*;
import com.ruoyi.ruoyi_yiliao.service.impl.TMedicalCostBillDetailServiceImpl;
import com.ruoyi.ruoyi_yiliao.uitl.StringUitl;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

//@Intercepts(@Signature(type = Exception.class,method=))
@Aspect
@Component
@Slf4j
public class MethodIntercepor {
    @Autowired
    private ITMedicalPacsInfoService itMedicalPacsInfoService;
    @Autowired
    private ITMedicalLisInfoService itMedicalLisInfoService;
    @Autowired
    private ITMedicalOutpatientdoctorActionService itMedicalOutpatientdoctorActionService;
    @Autowired
    private ITMedicalCostBillDetailService itMedicalCostBillDetailService;
    @Autowired
    private ITMedicalCostBillService itMedicalCostBillService;


    @Pointcut("execution(* com.ruoyi.ruoyi_yiliao.controller.*.edit(..) )")
    public void p() {
    }

    @After("p()")
    @Transactional
    public void add(JoinPoint proceedingJoinPoint) throws Throwable {
        log.info("进入");
        Object[] args = proceedingJoinPoint.getArgs();//参数
        Object id = null;//id
        Object status = null;//id
        for (Object arg : args) {
            //获得数据
            Class<?> aClass = arg.getClass();
            //获得id 和状态
            for (Field declaredField : aClass.getDeclaredFields()) {
                if (declaredField.getName().equals("id")) {
                    declaredField.setAccessible(true);
                    id = declaredField.get(arg);
                    System.out.println(id);

                } else if (declaredField.getName().equals("status")) {
                    declaredField.setAccessible(true);
                    status = declaredField.get(arg);
                    System.out.println(status);
                }
            }
            //进行判断是哪一个
            if (aClass.getSimpleName().equals("TMedicalPacsInfo")) {
                TMedicalPacsInfo tMedicalPacsInfo =
                        itMedicalPacsInfoService.selectTMedicalPacsInfoById((String) id);
                //当数据为已做时进行添加
                if (tMedicalPacsInfo.getStatus() == 1) {
                    add(tMedicalPacsInfo.getReceiveRecordId(), "TMedicalLisInfo");
                }
            } else if (aClass.getSimpleName().equals("TMedicalLisInfo")) {
                TMedicalLisInfo lisInfo = itMedicalLisInfoService.selectTMedicalLisInfoById((String) id);
                if (lisInfo.getStatus() == 1) {
                    add(lisInfo.getReceiveRecordId(), "TMedicalPacsInfo");
                }
            }
        }
    }

    //创建
    public void add(String receiveRecordId, String s) {
        TMedicalOutpatientdoctorAction action = new TMedicalOutpatientdoctorAction();
        //根据门诊id查询另一个缴费
        action.setOpDoctorReceiveRecordId(receiveRecordId);
        TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction =
                itMedicalOutpatientdoctorActionService.selectTMedicalOutpatientdoctorActionList(action).get(0);
        if (tMedicalOutpatientdoctorAction.getPartNumber().equals("1")) {
            aVoid(receiveRecordId, tMedicalOutpatientdoctorAction, 1);
        } else {
            //有多个缴费单
            if (eq(s, receiveRecordId, tMedicalOutpatientdoctorAction)) {
                String[] split = tMedicalOutpatientdoctorAction.getPartName().split(",");
                aVoid(receiveRecordId, tMedicalOutpatientdoctorAction, split.length);
                bill(receiveRecordId, tMedicalOutpatientdoctorAction, split.length);
            }
        }
    }

    public boolean eq(String s, String receiveRecordId, TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction) {
        boolean flag = true;
        if (s.equals("TMedicalLisInfo")) {
            //lis
            TMedicalLisInfo lisInfo = new TMedicalLisInfo();
            lisInfo.setReceiveRecordId(receiveRecordId);
            List<TMedicalLisInfo> tMedicalLisInfos = itMedicalLisInfoService.selectTMedicalLisInfoList(lisInfo);
            for (TMedicalLisInfo tMedicalLisInfo : tMedicalLisInfos) {
                //进行判断
                if (tMedicalLisInfo.getStatus() != 1) {
                    flag = false;
                }
            }
        } else if (s.equals("TMedicalPacsInfo")) {
            //pacs
            TMedicalPacsInfo pacsInfo = new TMedicalPacsInfo();
            pacsInfo.setReceiveRecordId(receiveRecordId);
            List<TMedicalPacsInfo> tMedicalPacsInfos = itMedicalPacsInfoService.selectTMedicalPacsInfoList(pacsInfo);
            for (TMedicalPacsInfo tMedicalPacsInfo : tMedicalPacsInfos) {
                if (tMedicalPacsInfo.getStatus() != 1) {
                    flag = false;
                }
            }
        }
        return flag;
    }

    public void aVoid(String receiveRecordId, TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction, int i) {
        String s = SecurityUtils.getUsername() + System.currentTimeMillis();
        //id
        //判断是否生成
        TMedicalCostBill tMedicalCostBill = new TMedicalCostBill();
        tMedicalCostBill.setOutpatientId(receiveRecordId);
        List<TMedicalCostBill> tMedicalCostBills = itMedicalCostBillService.selectTMedicalCostBillList(tMedicalCostBill);
        if (tMedicalCostBills.size() < 0) {
            //生成费用表
            TMedicalCostBill bill = new TMedicalCostBill();
            bill.setId(s);
            bill.setOutpatientId(receiveRecordId);
            bill.setMoney(tMedicalOutpatientdoctorAction.getPartMoney() * i);
            bill.setCreateTime(new Date());
            itMedicalCostBillService.insertTMedicalCostBill(bill);
        } else {


            for (TMedicalCostBill medicalCostBill : tMedicalCostBills) {
                Date createTime = medicalCostBill.getCreateTime();
                Date date = new Date();
                if (createTime.getMonth() == date.getMonth()) {
                    if (createTime.getDay() == date.getDay()) {
                        //进行添加
                        medicalCostBill.setMoney(medicalCostBill.getMoney() +( tMedicalOutpatientdoctorAction.getPartMoney() * i));
                        System.out.println(medicalCostBill.getMoney());
                        itMedicalCostBillService.updateTMedicalCostBill(medicalCostBill);
                        return;
                    }
                }
            }
            //并不是第一次
            //生成当天的费用表
            TMedicalCostBill bill = new TMedicalCostBill();
            bill.setId(s);
            bill.setOutpatientId(receiveRecordId);
            bill.setMoney(tMedicalOutpatientdoctorAction.getPartMoney() * i);
            bill.setCreateTime(new Date());
            itMedicalCostBillService.insertTMedicalCostBill(bill);
        }
    }

    public void bill(String receiveRecordId, TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction, int i) {
        //生成费用明细表
        String s = SecurityUtils.getUsername() + System.currentTimeMillis();
        TMedicalCostBillDetail tMedicalCostBillDetail = new TMedicalCostBillDetail();
        tMedicalCostBillDetail.setId(s);
        tMedicalCostBillDetail.setReceiveRecordId(receiveRecordId);
        tMedicalCostBillDetail.setPartName(tMedicalOutpatientdoctorAction.getPartName());
        tMedicalCostBillDetail.setPartNumber(Long.getLong(tMedicalOutpatientdoctorAction.getPartNumber()));
        tMedicalCostBillDetail.setPartMoney(tMedicalOutpatientdoctorAction.getPartMoney() * i);
        tMedicalCostBillDetail.setCreateTime(new Date());
        itMedicalCostBillDetailService.insertTMedicalCostBillDetail(tMedicalCostBillDetail);
    }
}
