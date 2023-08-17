package com.ruoyi.ruoyi_yiliao.mapper;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoeSickroom;

/**
 * 病房记录表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
public interface TMedicalCpoeSickroomMapper 
{
    /**
     * 查询病房记录表
     * 
     * @param id 病房记录表主键
     * @return 病房记录表
     */
    public TMedicalCpoeSickroom selectTMedicalCpoeSickroomById(String id);

    /**
     * 查询病房记录表列表
     * 
     * @param tMedicalCpoeSickroom 病房记录表
     * @return 病房记录表集合
     */
    public List<TMedicalCpoeSickroom> selectTMedicalCpoeSickroomList(TMedicalCpoeSickroom tMedicalCpoeSickroom);

    /**
     * 新增病房记录表
     * 
     * @param tMedicalCpoeSickroom 病房记录表
     * @return 结果
     */
    public int insertTMedicalCpoeSickroom(TMedicalCpoeSickroom tMedicalCpoeSickroom);

    /**
     * 修改病房记录表
     * 
     * @param tMedicalCpoeSickroom 病房记录表
     * @return 结果
     */
    public int updateTMedicalCpoeSickroom(TMedicalCpoeSickroom tMedicalCpoeSickroom);

    /**
     * 删除病房记录表
     * 
     * @param id 病房记录表主键
     * @return 结果
     */
    public int deleteTMedicalCpoeSickroomById(String id);

    /**
     * 批量删除病房记录表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalCpoeSickroomByIds(String[] ids);
}
