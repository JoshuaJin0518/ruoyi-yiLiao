package com.ruoyi.ruoyi_yiliao.mapper;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoePrescription;

/**
 * 住院治疗处方表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
public interface TMedicalCpoePrescriptionMapper 
{
    /**
     * 查询住院治疗处方表
     * 
     * @param id 住院治疗处方表主键
     * @return 住院治疗处方表
     */
    public TMedicalCpoePrescription selectTMedicalCpoePrescriptionById(String id);

    /**
     * 查询住院治疗处方表列表
     * 
     * @param tMedicalCpoePrescription 住院治疗处方表
     * @return 住院治疗处方表集合
     */
    public List<TMedicalCpoePrescription> selectTMedicalCpoePrescriptionList(TMedicalCpoePrescription tMedicalCpoePrescription);

    /**
     * 新增住院治疗处方表
     * 
     * @param tMedicalCpoePrescription 住院治疗处方表
     * @return 结果
     */
    public int insertTMedicalCpoePrescription(TMedicalCpoePrescription tMedicalCpoePrescription);

    /**
     * 修改住院治疗处方表
     * 
     * @param tMedicalCpoePrescription 住院治疗处方表
     * @return 结果
     */
    public int updateTMedicalCpoePrescription(TMedicalCpoePrescription tMedicalCpoePrescription);

    /**
     * 删除住院治疗处方表
     * 
     * @param id 住院治疗处方表主键
     * @return 结果
     */
    public int deleteTMedicalCpoePrescriptionById(String id);

    /**
     * 批量删除住院治疗处方表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalCpoePrescriptionByIds(String[] ids);
}
