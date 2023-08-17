package com.ruoyi.ruoyi_yiliao.mapper;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalDrugsStorage;

/**
 * 药库库存表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-17
 */
public interface TMedicalDrugsStorageMapper 
{
    /**
     * 查询药库库存表
     * 
     * @param id 药库库存表主键
     * @return 药库库存表
     */
    public TMedicalDrugsStorage selectTMedicalDrugsStorageById(String id);

    /**
     * 查询药库库存表列表
     * 
     * @param tMedicalDrugsStorage 药库库存表
     * @return 药库库存表集合
     */
    public List<TMedicalDrugsStorage> selectTMedicalDrugsStorageList(TMedicalDrugsStorage tMedicalDrugsStorage);

    /**
     * 新增药库库存表
     * 
     * @param tMedicalDrugsStorage 药库库存表
     * @return 结果
     */
    public int insertTMedicalDrugsStorage(TMedicalDrugsStorage tMedicalDrugsStorage);

    /**
     * 修改药库库存表
     * 
     * @param tMedicalDrugsStorage 药库库存表
     * @return 结果
     */
    public int updateTMedicalDrugsStorage(TMedicalDrugsStorage tMedicalDrugsStorage);

    /**
     * 删除药库库存表
     * 
     * @param id 药库库存表主键
     * @return 结果
     */
    public int deleteTMedicalDrugsStorageById(String id);

    /**
     * 批量删除药库库存表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalDrugsStorageByIds(String[] ids);
}
