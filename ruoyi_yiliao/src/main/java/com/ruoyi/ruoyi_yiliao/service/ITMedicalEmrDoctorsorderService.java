package com.ruoyi.ruoyi_yiliao.service;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalEmrDoctorsorder;

/**
 * 医嘱记录表Service接口
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
public interface ITMedicalEmrDoctorsorderService 
{
    /**
     * 查询医嘱记录表
     * 
     * @param id 医嘱记录表主键
     * @return 医嘱记录表
     */
    public TMedicalEmrDoctorsorder selectTMedicalEmrDoctorsorderById(String id);

    /**
     * 查询医嘱记录表列表
     * 
     * @param tMedicalEmrDoctorsorder 医嘱记录表
     * @return 医嘱记录表集合
     */
    public List<TMedicalEmrDoctorsorder> selectTMedicalEmrDoctorsorderList(TMedicalEmrDoctorsorder tMedicalEmrDoctorsorder);

    /**
     * 新增医嘱记录表
     * 
     * @param tMedicalEmrDoctorsorder 医嘱记录表
     * @return 结果
     */
    public int insertTMedicalEmrDoctorsorder(TMedicalEmrDoctorsorder tMedicalEmrDoctorsorder);

    /**
     * 修改医嘱记录表
     * 
     * @param tMedicalEmrDoctorsorder 医嘱记录表
     * @return 结果
     */
    public int updateTMedicalEmrDoctorsorder(TMedicalEmrDoctorsorder tMedicalEmrDoctorsorder);

    /**
     * 批量删除医嘱记录表
     * 
     * @param ids 需要删除的医嘱记录表主键集合
     * @return 结果
     */
    public int deleteTMedicalEmrDoctorsorderByIds(String[] ids);

    /**
     * 删除医嘱记录表信息
     * 
     * @param id 医嘱记录表主键
     * @return 结果
     */
    public int deleteTMedicalEmrDoctorsorderById(String id);
}
