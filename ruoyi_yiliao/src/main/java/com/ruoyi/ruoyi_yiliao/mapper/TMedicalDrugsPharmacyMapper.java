package com.ruoyi.ruoyi_yiliao.mapper;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalDrugsPharmacy;

/**
 * 药房库存表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
public interface TMedicalDrugsPharmacyMapper 
{
    /**
     * 查询药房库存表
     * 
     * @param id 药房库存表主键
     * @return 药房库存表
     */
    public TMedicalDrugsPharmacy selectTMedicalDrugsPharmacyById(String id);

    /**
     * 查询药房库存表列表
     * 
     * @param tMedicalDrugsPharmacy 药房库存表
     * @return 药房库存表集合
     */
    public List<TMedicalDrugsPharmacy> selectTMedicalDrugsPharmacyList(TMedicalDrugsPharmacy tMedicalDrugsPharmacy);

    /**
     * 新增药房库存表
     * 
     * @param tMedicalDrugsPharmacy 药房库存表
     * @return 结果
     */
    public int insertTMedicalDrugsPharmacy(TMedicalDrugsPharmacy tMedicalDrugsPharmacy);

    /**
     * 修改药房库存表
     * 
     * @param tMedicalDrugsPharmacy 药房库存表
     * @return 结果
     */
    public int updateTMedicalDrugsPharmacy(TMedicalDrugsPharmacy tMedicalDrugsPharmacy);

    /**
     * 删除药房库存表
     * 
     * @param id 药房库存表主键
     * @return 结果
     */
    public int deleteTMedicalDrugsPharmacyById(String id);

    /**
     * 批量删除药房库存表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalDrugsPharmacyByIds(String[] ids);
}
