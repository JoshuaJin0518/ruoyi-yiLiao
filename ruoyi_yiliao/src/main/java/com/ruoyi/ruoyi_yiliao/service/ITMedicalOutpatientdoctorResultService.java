package com.ruoyi.ruoyi_yiliao.service;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalOutpatientdoctorResult;

/**
 * 医生看病结果Service接口
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
public interface ITMedicalOutpatientdoctorResultService 
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
     * 批量删除医生看病结果
     * 
     * @param ids 需要删除的医生看病结果主键集合
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorResultByIds(String[] ids);

    /**
     * 删除医生看病结果信息
     * 
     * @param id 医生看病结果主键
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorResultById(String id);
}
