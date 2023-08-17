package com.ruoyi.ruoyi_yiliao.service;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoeBed;

/**
 * 床位记录表Service接口
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
public interface ITMedicalCpoeBedService 
{
    /**
     * 查询床位记录表
     * 
     * @param id 床位记录表主键
     * @return 床位记录表
     */
    public TMedicalCpoeBed selectTMedicalCpoeBedById(String id);

    /**
     * 查询床位记录表列表
     * 
     * @param tMedicalCpoeBed 床位记录表
     * @return 床位记录表集合
     */
    public List<TMedicalCpoeBed> selectTMedicalCpoeBedList(TMedicalCpoeBed tMedicalCpoeBed);

    /**
     * 新增床位记录表
     * 
     * @param tMedicalCpoeBed 床位记录表
     * @return 结果
     */
    public int insertTMedicalCpoeBed(TMedicalCpoeBed tMedicalCpoeBed);

    /**
     * 修改床位记录表
     * 
     * @param tMedicalCpoeBed 床位记录表
     * @return 结果
     */
    public int updateTMedicalCpoeBed(TMedicalCpoeBed tMedicalCpoeBed);

    /**
     * 批量删除床位记录表
     * 
     * @param ids 需要删除的床位记录表主键集合
     * @return 结果
     */
    public int deleteTMedicalCpoeBedByIds(String[] ids);

    /**
     * 删除床位记录表信息
     * 
     * @param id 床位记录表主键
     * @return 结果
     */
    public int deleteTMedicalCpoeBedById(String id);
}
