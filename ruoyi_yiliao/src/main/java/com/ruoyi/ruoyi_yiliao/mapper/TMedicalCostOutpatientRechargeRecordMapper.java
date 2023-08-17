package com.ruoyi.ruoyi_yiliao.mapper;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostOutpatientRechargeRecord;

/**
 * 门诊卡充值记录表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
public interface TMedicalCostOutpatientRechargeRecordMapper 
{
    /**
     * 查询门诊卡充值记录表
     * 
     * @param id 门诊卡充值记录表主键
     * @return 门诊卡充值记录表
     */
    public TMedicalCostOutpatientRechargeRecord selectTMedicalCostOutpatientRechargeRecordById(String id);

    /**
     * 查询门诊卡充值记录表列表
     * 
     * @param tMedicalCostOutpatientRechargeRecord 门诊卡充值记录表
     * @return 门诊卡充值记录表集合
     */
    public List<TMedicalCostOutpatientRechargeRecord> selectTMedicalCostOutpatientRechargeRecordList(TMedicalCostOutpatientRechargeRecord tMedicalCostOutpatientRechargeRecord);

    /**
     * 新增门诊卡充值记录表
     * 
     * @param tMedicalCostOutpatientRechargeRecord 门诊卡充值记录表
     * @return 结果
     */
    public int insertTMedicalCostOutpatientRechargeRecord(TMedicalCostOutpatientRechargeRecord tMedicalCostOutpatientRechargeRecord);

    /**
     * 修改门诊卡充值记录表
     * 
     * @param tMedicalCostOutpatientRechargeRecord 门诊卡充值记录表
     * @return 结果
     */
    public int updateTMedicalCostOutpatientRechargeRecord(TMedicalCostOutpatientRechargeRecord tMedicalCostOutpatientRechargeRecord);

    /**
     * 删除门诊卡充值记录表
     * 
     * @param id 门诊卡充值记录表主键
     * @return 结果
     */
    public int deleteTMedicalCostOutpatientRechargeRecordById(String id);

    /**
     * 批量删除门诊卡充值记录表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalCostOutpatientRechargeRecordByIds(String[] ids);
}
