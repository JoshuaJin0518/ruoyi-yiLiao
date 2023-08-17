package com.ruoyi.ruoyi_yiliao.mapper;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalOutpatientdoctorMedicalrecord;

/**
 * 门诊病历表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
public interface TMedicalOutpatientdoctorMedicalrecordMapper 
{
    /**
     * 查询门诊病历表
     * 
     * @param id 门诊病历表主键
     * @return 门诊病历表
     */
    public TMedicalOutpatientdoctorMedicalrecord selectTMedicalOutpatientdoctorMedicalrecordById(String id);

    /**
     * 查询门诊病历表列表
     * 
     * @param tMedicalOutpatientdoctorMedicalrecord 门诊病历表
     * @return 门诊病历表集合
     */
    public List<TMedicalOutpatientdoctorMedicalrecord> selectTMedicalOutpatientdoctorMedicalrecordList(TMedicalOutpatientdoctorMedicalrecord tMedicalOutpatientdoctorMedicalrecord);

    /**
     * 新增门诊病历表
     * 
     * @param tMedicalOutpatientdoctorMedicalrecord 门诊病历表
     * @return 结果
     */
    public int insertTMedicalOutpatientdoctorMedicalrecord(TMedicalOutpatientdoctorMedicalrecord tMedicalOutpatientdoctorMedicalrecord);

    /**
     * 修改门诊病历表
     * 
     * @param tMedicalOutpatientdoctorMedicalrecord 门诊病历表
     * @return 结果
     */
    public int updateTMedicalOutpatientdoctorMedicalrecord(TMedicalOutpatientdoctorMedicalrecord tMedicalOutpatientdoctorMedicalrecord);

    /**
     * 删除门诊病历表
     * 
     * @param id 门诊病历表主键
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorMedicalrecordById(String id);

    /**
     * 批量删除门诊病历表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorMedicalrecordByIds(String[] ids);
}
