package com.ruoyi.ruoyi_yiliao.service;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoeDoctorsorderhandle;

/**
 * 医嘱执行记录表Service接口
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
public interface ITMedicalCpoeDoctorsorderhandleService 
{
    /**
     * 查询医嘱执行记录表
     * 
     * @param id 医嘱执行记录表主键
     * @return 医嘱执行记录表
     */
    public TMedicalCpoeDoctorsorderhandle selectTMedicalCpoeDoctorsorderhandleById(String id);

    /**
     * 查询医嘱执行记录表列表
     * 
     * @param tMedicalCpoeDoctorsorderhandle 医嘱执行记录表
     * @return 医嘱执行记录表集合
     */
    public List<TMedicalCpoeDoctorsorderhandle> selectTMedicalCpoeDoctorsorderhandleList(TMedicalCpoeDoctorsorderhandle tMedicalCpoeDoctorsorderhandle);

    /**
     * 新增医嘱执行记录表
     * 
     * @param tMedicalCpoeDoctorsorderhandle 医嘱执行记录表
     * @return 结果
     */
    public int insertTMedicalCpoeDoctorsorderhandle(TMedicalCpoeDoctorsorderhandle tMedicalCpoeDoctorsorderhandle);

    /**
     * 修改医嘱执行记录表
     * 
     * @param tMedicalCpoeDoctorsorderhandle 医嘱执行记录表
     * @return 结果
     */
    public int updateTMedicalCpoeDoctorsorderhandle(TMedicalCpoeDoctorsorderhandle tMedicalCpoeDoctorsorderhandle);

    /**
     * 批量删除医嘱执行记录表
     * 
     * @param ids 需要删除的医嘱执行记录表主键集合
     * @return 结果
     */
    public int deleteTMedicalCpoeDoctorsorderhandleByIds(String[] ids);

    /**
     * 删除医嘱执行记录表信息
     * 
     * @param id 医嘱执行记录表主键
     * @return 结果
     */
    public int deleteTMedicalCpoeDoctorsorderhandleById(String id);
}
