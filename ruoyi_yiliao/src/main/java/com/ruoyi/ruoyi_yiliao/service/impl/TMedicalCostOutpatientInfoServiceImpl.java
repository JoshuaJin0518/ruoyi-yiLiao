package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.Date;
import java.util.List;

import com.ruoyi.ruoyi_yiliao.controller.TMedicalCostOutpatientRechargeRecordController;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostOutpatientRechargeRecord;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCostOutpatientRechargeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalCostOutpatientInfoMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostOutpatientInfo;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCostOutpatientInfoService;

/**
 * 门诊卡信息表Service业务层处理
 *
 * @author ruoyi
 * @date 2023-08-14
 */
@Service
public class TMedicalCostOutpatientInfoServiceImpl implements ITMedicalCostOutpatientInfoService {
    @Autowired
    private TMedicalCostOutpatientInfoMapper tMedicalCostOutpatientInfoMapper;
    @Autowired
    private ITMedicalCostOutpatientRechargeRecordService itMedicalCostOutpatientRechargeRecordService;

    /**
     * 查询门诊卡信息表
     *
     * @param id 门诊卡信息表主键
     * @return 门诊卡信息表
     */
    @Override
    public TMedicalCostOutpatientInfo selectTMedicalCostOutpatientInfoById(String id) {
        return tMedicalCostOutpatientInfoMapper.selectTMedicalCostOutpatientInfoById(id);
    }

    /**
     * 查询门诊卡信息表列表
     *
     * @param tMedicalCostOutpatientInfo 门诊卡信息表
     * @return 门诊卡信息表
     */
    @Override
    public List<TMedicalCostOutpatientInfo> selectTMedicalCostOutpatientInfoList(TMedicalCostOutpatientInfo tMedicalCostOutpatientInfo) {
        return tMedicalCostOutpatientInfoMapper.selectTMedicalCostOutpatientInfoList(tMedicalCostOutpatientInfo);
    }

    /**
     * 新增门诊卡信息表
     *
     * @param tMedicalCostOutpatientInfo 门诊卡信息表
     * @return 结果
     */
    @Override
    public int insertTMedicalCostOutpatientInfo(TMedicalCostOutpatientInfo tMedicalCostOutpatientInfo) {
        tMedicalCostOutpatientInfo.setEnableTime(new Date());
        int i = tMedicalCostOutpatientInfoMapper.insertTMedicalCostOutpatientInfo(tMedicalCostOutpatientInfo);
            //如果有金额进行充值表的插入
            if(tMedicalCostOutpatientInfo.getMoney()!=null&&tMedicalCostOutpatientInfo.getMoney()>0){
                TMedicalCostOutpatientRechargeRecord tMedicalCostOutpatientRechargeRecord =
                        new TMedicalCostOutpatientRechargeRecord();
                //门诊卡id
                tMedicalCostOutpatientRechargeRecord.setOutpatientId(tMedicalCostOutpatientInfo.getId());
                //金额
                tMedicalCostOutpatientRechargeRecord.setMoney(tMedicalCostOutpatientInfo.getMoney());
                //状态
                tMedicalCostOutpatientRechargeRecord.setType(1);
                itMedicalCostOutpatientRechargeRecordService
                        .insertTMedicalCostOutpatientRechargeRecord(tMedicalCostOutpatientRechargeRecord);
        }
        return i;
    }

    /**
     * 修改门诊卡信息表
     *
     * @param tMedicalCostOutpatientInfo 门诊卡信息表
     * @return 结果
     */
    @Override
    public int updateTMedicalCostOutpatientInfo(TMedicalCostOutpatientInfo tMedicalCostOutpatientInfo) {
        return tMedicalCostOutpatientInfoMapper.updateTMedicalCostOutpatientInfo(tMedicalCostOutpatientInfo);
    }

    /**
     * 批量删除门诊卡信息表
     *
     * @param ids 需要删除的门诊卡信息表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCostOutpatientInfoByIds(String[] ids) {
        return tMedicalCostOutpatientInfoMapper.deleteTMedicalCostOutpatientInfoByIds(ids);
    }

    /**
     * 删除门诊卡信息表信息
     *
     * @param id 门诊卡信息表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCostOutpatientInfoById(String id) {
        return tMedicalCostOutpatientInfoMapper.deleteTMedicalCostOutpatientInfoById(id);
    }
}
