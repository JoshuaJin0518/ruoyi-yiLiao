package com.ruoyi.ruoyi_yiliao.mapper;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalDrugsInfo;

/**
 * 药品Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-12
 */
public interface TMedicalDrugsInfoMapper 
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
     * 删除药品
     * 
     * @param id 药品主键
     * @return 结果
     */
    public int deleteTMedicalDrugsInfoById(String id);

    /**
     * 批量删除药品
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalDrugsInfoByIds(String[] ids);
}
