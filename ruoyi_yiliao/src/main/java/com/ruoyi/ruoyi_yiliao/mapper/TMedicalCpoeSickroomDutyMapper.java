package com.ruoyi.ruoyi_yiliao.mapper;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoeSickroomDuty;

/**
 * 病房值班记录表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
public interface TMedicalCpoeSickroomDutyMapper 
{
    /**
     * 查询病房值班记录表
     * 
     * @param id 病房值班记录表主键
     * @return 病房值班记录表
     */
    public TMedicalCpoeSickroomDuty selectTMedicalCpoeSickroomDutyById(String id);

    /**
     * 查询病房值班记录表列表
     * 
     * @param tMedicalCpoeSickroomDuty 病房值班记录表
     * @return 病房值班记录表集合
     */
    public List<TMedicalCpoeSickroomDuty> selectTMedicalCpoeSickroomDutyList(TMedicalCpoeSickroomDuty tMedicalCpoeSickroomDuty);

    /**
     * 新增病房值班记录表
     * 
     * @param tMedicalCpoeSickroomDuty 病房值班记录表
     * @return 结果
     */
    public int insertTMedicalCpoeSickroomDuty(TMedicalCpoeSickroomDuty tMedicalCpoeSickroomDuty);

    /**
     * 修改病房值班记录表
     * 
     * @param tMedicalCpoeSickroomDuty 病房值班记录表
     * @return 结果
     */
    public int updateTMedicalCpoeSickroomDuty(TMedicalCpoeSickroomDuty tMedicalCpoeSickroomDuty);

    /**
     * 删除病房值班记录表
     * 
     * @param id 病房值班记录表主键
     * @return 结果
     */
    public int deleteTMedicalCpoeSickroomDutyById(String id);

    /**
     * 批量删除病房值班记录表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalCpoeSickroomDutyByIds(String[] ids);
}
