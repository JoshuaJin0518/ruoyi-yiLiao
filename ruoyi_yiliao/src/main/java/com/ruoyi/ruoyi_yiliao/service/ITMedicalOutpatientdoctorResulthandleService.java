package com.ruoyi.ruoyi_yiliao.service;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalOutpatientdoctorResulthandle;

/**
 * 医生看病治疗方案Service接口
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
public interface ITMedicalOutpatientdoctorResulthandleService 
{
    /**
     * 查询医生看病治疗方案
     * 
     * @param id 医生看病治疗方案主键
     * @return 医生看病治疗方案
     */
    public TMedicalOutpatientdoctorResulthandle selectTMedicalOutpatientdoctorResulthandleById(String id);

    /**
     * 查询医生看病治疗方案列表
     * 
     * @param tMedicalOutpatientdoctorResulthandle 医生看病治疗方案
     * @return 医生看病治疗方案集合
     */
    public List<TMedicalOutpatientdoctorResulthandle> selectTMedicalOutpatientdoctorResulthandleList(TMedicalOutpatientdoctorResulthandle tMedicalOutpatientdoctorResulthandle);

    /**
     * 新增医生看病治疗方案
     * 
     * @param tMedicalOutpatientdoctorResulthandle 医生看病治疗方案
     * @return 结果
     */
    public int insertTMedicalOutpatientdoctorResulthandle(TMedicalOutpatientdoctorResulthandle tMedicalOutpatientdoctorResulthandle);

    /**
     * 修改医生看病治疗方案
     * 
     * @param tMedicalOutpatientdoctorResulthandle 医生看病治疗方案
     * @return 结果
     */
    public int updateTMedicalOutpatientdoctorResulthandle(TMedicalOutpatientdoctorResulthandle tMedicalOutpatientdoctorResulthandle);

    /**
     * 批量删除医生看病治疗方案
     * 
     * @param ids 需要删除的医生看病治疗方案主键集合
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorResulthandleByIds(String[] ids);

    /**
     * 删除医生看病治疗方案信息
     * 
     * @param id 医生看病治疗方案主键
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorResulthandleById(String id);
}
