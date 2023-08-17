package com.ruoyi.ruoyi_yiliao.service;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalOutpatientdoctorReceiverecord;

/**
 * 接诊记录表Service接口
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
public interface ITMedicalOutpatientdoctorReceiverecordService 
{
    /**
     * 查询接诊记录表
     * 
     * @param id 接诊记录表主键
     * @return 接诊记录表
     */
    public TMedicalOutpatientdoctorReceiverecord selectTMedicalOutpatientdoctorReceiverecordById(String id);

    /**
     * 查询接诊记录表列表
     * 
     * @param tMedicalOutpatientdoctorReceiverecord 接诊记录表
     * @return 接诊记录表集合
     */
    public List<TMedicalOutpatientdoctorReceiverecord> selectTMedicalOutpatientdoctorReceiverecordList(TMedicalOutpatientdoctorReceiverecord tMedicalOutpatientdoctorReceiverecord);

    /**
     * 新增接诊记录表
     * 
     * @param tMedicalOutpatientdoctorReceiverecord 接诊记录表
     * @return 结果
     */
    public int insertTMedicalOutpatientdoctorReceiverecord(TMedicalOutpatientdoctorReceiverecord tMedicalOutpatientdoctorReceiverecord);

    /**
     * 修改接诊记录表
     * 
     * @param tMedicalOutpatientdoctorReceiverecord 接诊记录表
     * @return 结果
     */
    public int updateTMedicalOutpatientdoctorReceiverecord(TMedicalOutpatientdoctorReceiverecord tMedicalOutpatientdoctorReceiverecord);

    /**
     * 批量删除接诊记录表
     * 
     * @param ids 需要删除的接诊记录表主键集合
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorReceiverecordByIds(String[] ids);

    /**
     * 删除接诊记录表信息
     * 
     * @param id 接诊记录表主键
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorReceiverecordById(String id);
}
