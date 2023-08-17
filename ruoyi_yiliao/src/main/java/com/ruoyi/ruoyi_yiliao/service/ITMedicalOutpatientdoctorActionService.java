package com.ruoyi.ruoyi_yiliao.service;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalOutpatientdoctorAction;

/**
 * 医生看病流程表Service接口
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
public interface ITMedicalOutpatientdoctorActionService 
{
    /**
     * 查询医生看病流程表
     * 
     * @param id 医生看病流程表主键
     * @return 医生看病流程表
     */
    public TMedicalOutpatientdoctorAction selectTMedicalOutpatientdoctorActionById(String id);

    /**
     * 查询医生看病流程表列表
     * 
     * @param tMedicalOutpatientdoctorAction 医生看病流程表
     * @return 医生看病流程表集合
     */
    public List<TMedicalOutpatientdoctorAction> selectTMedicalOutpatientdoctorActionList(TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction);

    /**
     * 新增医生看病流程表
     * 
     * @param tMedicalOutpatientdoctorAction 医生看病流程表
     * @return 结果
     */
    public int insertTMedicalOutpatientdoctorAction(TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction);

    /**
     * 修改医生看病流程表
     * 
     * @param tMedicalOutpatientdoctorAction 医生看病流程表
     * @return 结果
     */
    public int updateTMedicalOutpatientdoctorAction(TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction);

    /**
     * 批量删除医生看病流程表
     * 
     * @param ids 需要删除的医生看病流程表主键集合
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorActionByIds(String[] ids);

    /**
     * 删除医生看病流程表信息
     * 
     * @param id 医生看病流程表主键
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorActionById(String id);
}
