package com.ruoyi.ruoyi_yiliao.mapper;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostOutpatientInfo;

/**
 * 门诊卡信息表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
public interface TMedicalCostOutpatientInfoMapper 
{
    /**
     * 查询门诊卡信息表
     * 
     * @param id 门诊卡信息表主键
     * @return 门诊卡信息表
     */
    public TMedicalCostOutpatientInfo selectTMedicalCostOutpatientInfoById(String id);

    /**
     * 查询门诊卡信息表列表
     * 
     * @param tMedicalCostOutpatientInfo 门诊卡信息表
     * @return 门诊卡信息表集合
     */
    public List<TMedicalCostOutpatientInfo> selectTMedicalCostOutpatientInfoList(TMedicalCostOutpatientInfo tMedicalCostOutpatientInfo);

    /**
     * 新增门诊卡信息表
     * 
     * @param tMedicalCostOutpatientInfo 门诊卡信息表
     * @return 结果
     */
    public int insertTMedicalCostOutpatientInfo(TMedicalCostOutpatientInfo tMedicalCostOutpatientInfo);

    /**
     * 修改门诊卡信息表
     * 
     * @param tMedicalCostOutpatientInfo 门诊卡信息表
     * @return 结果
     */
    public int updateTMedicalCostOutpatientInfo(TMedicalCostOutpatientInfo tMedicalCostOutpatientInfo);

    /**
     * 删除门诊卡信息表
     * 
     * @param id 门诊卡信息表主键
     * @return 结果
     */
    public int deleteTMedicalCostOutpatientInfoById(String id);

    /**
     * 批量删除门诊卡信息表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalCostOutpatientInfoByIds(String[] ids);
}
