package com.ruoyi.ruoyi_yiliao.mapper;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostPersonArchives;

/**
 * 患者信息Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-12
 */
public interface TMedicalCostPersonArchivesMapper 
{
    /**
     * 查询患者信息
     * 
     * @param id 患者信息主键
     * @return 患者信息
     */
    public TMedicalCostPersonArchives selectTMedicalCostPersonArchivesById(String id);

    /**
     * 查询患者信息列表
     * 
     * @param tMedicalCostPersonArchives 患者信息
     * @return 患者信息集合
     */
    public List<TMedicalCostPersonArchives> selectTMedicalCostPersonArchivesList(TMedicalCostPersonArchives tMedicalCostPersonArchives);

    /**
     * 新增患者信息
     * 
     * @param tMedicalCostPersonArchives 患者信息
     * @return 结果
     */
    public int insertTMedicalCostPersonArchives(TMedicalCostPersonArchives tMedicalCostPersonArchives);

    /**
     * 修改患者信息
     * 
     * @param tMedicalCostPersonArchives 患者信息
     * @return 结果
     */
    public int updateTMedicalCostPersonArchives(TMedicalCostPersonArchives tMedicalCostPersonArchives);

    /**
     * 删除患者信息
     * 
     * @param id 患者信息主键
     * @return 结果
     */
    public int deleteTMedicalCostPersonArchivesById(String id);

    /**
     * 批量删除患者信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalCostPersonArchivesByIds(String[] ids);
}
