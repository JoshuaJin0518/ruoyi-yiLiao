package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostOutpatientInfo;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCostOutpatientInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalCostOutpatientRechargeRecordMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostOutpatientRechargeRecord;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCostOutpatientRechargeRecordService;

/**
 * 门诊卡充值记录表Service业务层处理
 *
 * @author ruoyi
 * @date 2023-08-14
 */
@Service
public class TMedicalCostOutpatientRechargeRecordServiceImpl implements ITMedicalCostOutpatientRechargeRecordService {
    @Autowired
    private TMedicalCostOutpatientRechargeRecordMapper tMedicalCostOutpatientRechargeRecordMapper;

    @Autowired
    private ITMedicalCostOutpatientInfoService tMedicalCostOutpatientInfoService;


    /**
     * 查询门诊卡充值记录表
     *
     * @param id 门诊卡充值记录表主键
     * @return 门诊卡充值记录表
     */
    @Override
    public TMedicalCostOutpatientRechargeRecord selectTMedicalCostOutpatientRechargeRecordById(String id) {
        return tMedicalCostOutpatientRechargeRecordMapper.selectTMedicalCostOutpatientRechargeRecordById(id);
    }

    /**
     * 查询门诊卡充值记录表列表
     *
     * @param tMedicalCostOutpatientRechargeRecord 门诊卡充值记录表
     * @return 门诊卡充值记录表
     */
    @Override
    public List<TMedicalCostOutpatientRechargeRecord> selectTMedicalCostOutpatientRechargeRecordList(TMedicalCostOutpatientRechargeRecord tMedicalCostOutpatientRechargeRecord) {
        return tMedicalCostOutpatientRechargeRecordMapper.selectTMedicalCostOutpatientRechargeRecordList(tMedicalCostOutpatientRechargeRecord);
    }

    /**
     * 新增门诊卡充值记录表
     *
     * @param tMedicalCostOutpatientRechargeRecord 门诊卡充值记录表
     * @return 结果
     */
    ///可以开启事务
    @Override
    public int insertTMedicalCostOutpatientRechargeRecord(TMedicalCostOutpatientRechargeRecord tMedicalCostOutpatientRechargeRecord) {
        //查询到门诊卡信息
        TMedicalCostOutpatientInfo tMedicalCostOutpatientInfo
                = tMedicalCostOutpatientInfoService.selectTMedicalCostOutpatientInfoById
                (tMedicalCostOutpatientRechargeRecord.getOutpatientId());
       if (tMedicalCostOutpatientRechargeRecord.getType()==2){
           if (tMedicalCostOutpatientInfo.getMoney() == 0) {
               return 0;
           } else if (tMedicalCostOutpatientInfo.getMoney() < tMedicalCostOutpatientRechargeRecord.getMoney()) {
               return 0;
           }
       }
        tMedicalCostOutpatientRechargeRecord.setCreateTime(DateUtils.getNowDate());
        int i = tMedicalCostOutpatientRechargeRecordMapper.insertTMedicalCostOutpatientRechargeRecord(tMedicalCostOutpatientRechargeRecord);
        if (i > 0) {
            //充值
            if (tMedicalCostOutpatientRechargeRecord.getType() == 1) {
                //修改门诊卡id金额
                tMedicalCostOutpatientRechargeRecord.getOutpatientId();
                tMedicalCostOutpatientInfo.setMoney
                        (tMedicalCostOutpatientInfo.getMoney() + tMedicalCostOutpatientRechargeRecord.getMoney());
                tMedicalCostOutpatientInfoService
                        .updateTMedicalCostOutpatientInfo(tMedicalCostOutpatientInfo);
            } else {
                //取现
                //修改门诊卡id金额
                tMedicalCostOutpatientRechargeRecord.getOutpatientId();
                tMedicalCostOutpatientInfo.setMoney
                        (tMedicalCostOutpatientInfo.getMoney() - tMedicalCostOutpatientRechargeRecord.getMoney());
                tMedicalCostOutpatientInfoService
                        .updateTMedicalCostOutpatientInfo(tMedicalCostOutpatientInfo);
            }
        }
        return i;
    }

    /**
     * 修改门诊卡充值记录表
     *
     * @param tMedicalCostOutpatientRechargeRecord 门诊卡充值记录表
     * @return 结果
     */
    @Override
    public int updateTMedicalCostOutpatientRechargeRecord(TMedicalCostOutpatientRechargeRecord tMedicalCostOutpatientRechargeRecord) {
        //查询原始数据
        TMedicalCostOutpatientRechargeRecord tMedicalCostOutpatientRechargeRecord1 =
                selectTMedicalCostOutpatientRechargeRecordById(tMedicalCostOutpatientRechargeRecord.getId());
        int i = 0;
        //查询到门诊卡信息
        TMedicalCostOutpatientInfo tMedicalCostOutpatientInfo
                = tMedicalCostOutpatientInfoService.selectTMedicalCostOutpatientInfoById
                (tMedicalCostOutpatientRechargeRecord.getOutpatientId());
        if (tMedicalCostOutpatientInfo.getMoney() == 0) {
            return 0;
        } else if (tMedicalCostOutpatientInfo.getMoney() < tMedicalCostOutpatientRechargeRecord.getMoney()) {
            return 0;
        }
        tMedicalCostOutpatientRechargeRecord.setCreateTime(DateUtils.getNowDate());
        if (i > 0) {
            //充值
            if (tMedicalCostOutpatientRechargeRecord.getType() == 1) {
                //修改门诊卡id金额
                tMedicalCostOutpatientRechargeRecord.getOutpatientId();
                tMedicalCostOutpatientInfo.setMoney
                        (tMedicalCostOutpatientInfo.getMoney() + tMedicalCostOutpatientRechargeRecord.getMoney());
                tMedicalCostOutpatientInfoService
                        .updateTMedicalCostOutpatientInfo(tMedicalCostOutpatientInfo);
            } else {
                //取现
                //修改门诊卡id金额
                tMedicalCostOutpatientRechargeRecord.getOutpatientId();
                tMedicalCostOutpatientInfo.setMoney
                        (tMedicalCostOutpatientInfo.getMoney() - tMedicalCostOutpatientRechargeRecord.getMoney());
                tMedicalCostOutpatientInfoService
                        .updateTMedicalCostOutpatientInfo(tMedicalCostOutpatientInfo);
            }
        }
        return i;
    }

    /**
     * 批量删除门诊卡充值记录表
     *
     * @param ids 需要删除的门诊卡充值记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCostOutpatientRechargeRecordByIds(String[] ids) {
        return tMedicalCostOutpatientRechargeRecordMapper.deleteTMedicalCostOutpatientRechargeRecordByIds(ids);
    }

    /**
     * 删除门诊卡充值记录表信息
     *
     * @param id 门诊卡充值记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCostOutpatientRechargeRecordById(String id) {
        return tMedicalCostOutpatientRechargeRecordMapper.deleteTMedicalCostOutpatientRechargeRecordById(id);
    }
}
