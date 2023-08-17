package com.ruoyi.ruoyi_yiliao.mapper;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoePrescriptiontotal;

/**
 * 住院治疗处方总表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
public interface TMedicalCpoePrescriptiontotalMapper 
{
    /**
     * 查询住院治疗处方总表
     * 
     * @param id 住院治疗处方总表主键
     * @return 住院治疗处方总表
     */
    public TMedicalCpoePrescriptiontotal selectTMedicalCpoePrescriptiontotalById(String id);

    /**
     * 查询住院治疗处方总表列表
     * 
     * @param tMedicalCpoePrescriptiontotal 住院治疗处方总表
     * @return 住院治疗处方总表集合
     */
    public List<TMedicalCpoePrescriptiontotal> selectTMedicalCpoePrescriptiontotalList(TMedicalCpoePrescriptiontotal tMedicalCpoePrescriptiontotal);

    /**
     * 新增住院治疗处方总表
     * 
     * @param tMedicalCpoePrescriptiontotal 住院治疗处方总表
     * @return 结果
     */
    public int insertTMedicalCpoePrescriptiontotal(TMedicalCpoePrescriptiontotal tMedicalCpoePrescriptiontotal);

    /**
     * 修改住院治疗处方总表
     * 
     * @param tMedicalCpoePrescriptiontotal 住院治疗处方总表
     * @return 结果
     */
    public int updateTMedicalCpoePrescriptiontotal(TMedicalCpoePrescriptiontotal tMedicalCpoePrescriptiontotal);

    /**
     * 删除住院治疗处方总表
     * 
     * @param id 住院治疗处方总表主键
     * @return 结果
     */
    public int deleteTMedicalCpoePrescriptiontotalById(String id);

    /**
     * 批量删除住院治疗处方总表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalCpoePrescriptiontotalByIds(String[] ids);
}
