package com.ruoyi.ruoyi_yiliao.service;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalDrugsInfo;

/**
 * 药品Service接口
 * 
 * @author ruoyi
 * @date 2023-08-12
 */
public interface ITMedicalDrugsInfoService 
{
    /**
     * 查询药品
     * 
     * @param id 药品主键
     * @return 药品
     */
    public TMedicalDrugsInfo selectTMedicalDrugsInfoById(String id);

    /**
     * 查询药品列表
     * 
     * @param tMedicalDrugsInfo 药品
     * @return 药品集合
     */
    public List<TMedicalDrugsInfo> selectTMedicalDrugsInfoList(TMedicalDrugsInfo tMedicalDrugsInfo);

    /**
     * 新增药品
     * 
     * @param tMedicalDrugsInfo 药品
     * @return 结果
     */
    public int insertTMedicalDrugsInfo(TMedicalDrugsInfo tMedicalDrugsInfo);

    /**
     * 修改药品
     * 
     * @param tMedicalDrugsInfo 药品
     * @return 结果
     */
    public int updateTMedicalDrugsInfo(TMedicalDrugsInfo tMedicalDrugsInfo);

    /**
     * 批量删除药品
     * 
     * @param ids 需要删除的药品主键集合
     * @return 结果
     */
    public int deleteTMedicalDrugsInfoByIds(String[] ids);

    /**
     * 删除药品信息
     * 
     * @param id 药品主键
     * @return 结果
     */
    public int deleteTMedicalDrugsInfoById(String id);
}
