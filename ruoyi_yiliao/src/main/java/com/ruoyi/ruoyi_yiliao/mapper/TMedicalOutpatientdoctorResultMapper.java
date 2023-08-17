package com.ruoyi.ruoyi_yiliao.mapper;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalOutpatientdoctorResult;

/**
 * 医生看病结果Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
public interface TMedicalOutpatientdoctorResultMapper 
{
    /**
     * 查询医生看病结果
     * 
     * @param id 医生看病结果主键
     * @return 医生看病结果
     */
    public TMedicalOutpatientdoctorResult selectTMedicalOutpatientdoctorResultById(String id);

    /**
     * 查询医生看病结果列表
     * 
     * @param tMedicalOutpatientdoctorResult 医生看病结果
     * @return 医生看病结果集合
     */
    public List<TMedicalOutpatientdoctorResult> selectTMedicalOutpatientdoctorResultList(TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult);

    /**
     * 新增医生看病结果
     * 
     * @param tMedicalOutpatientdoctorResult 医生看病结果
     * @return 结果
     */
    public int insertTMedicalOutpatientdoctorResult(TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult);

    /**
     * 修改医生看病结果
     * 
     * @param tMedicalOutpatientdoctorResult 医生看病结果
     * @return 结果
     */
    public int updateTMedicalOutpatientdoctorResult(TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult);

    /**
     * 删除医生看病结果
     * 
     * @param id 医生看病结果主键
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorResultById(String id);

    /**
     * 批量删除医生看病结果
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorResultByIds(String[] ids);
}
