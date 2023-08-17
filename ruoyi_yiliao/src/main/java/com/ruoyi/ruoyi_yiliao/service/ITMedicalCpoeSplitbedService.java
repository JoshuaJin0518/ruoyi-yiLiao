package com.ruoyi.ruoyi_yiliao.service;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoeSplitbed;

/**
 * 分床记录表Service接口
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
public interface ITMedicalCpoeSplitbedService 
{
    /**
     * 查询分床记录表
     * 
     * @param id 分床记录表主键
     * @return 分床记录表
     */
    public TMedicalCpoeSplitbed selectTMedicalCpoeSplitbedById(String id);

    /**
     * 查询分床记录表列表
     * 
     * @param tMedicalCpoeSplitbed 分床记录表
     * @return 分床记录表集合
     */
    public List<TMedicalCpoeSplitbed> selectTMedicalCpoeSplitbedList(TMedicalCpoeSplitbed tMedicalCpoeSplitbed);

    /**
     * 新增分床记录表
     * 
     * @param tMedicalCpoeSplitbed 分床记录表
     * @return 结果
     */
    public int insertTMedicalCpoeSplitbed(TMedicalCpoeSplitbed tMedicalCpoeSplitbed);

    /**
     * 修改分床记录表
     * 
     * @param tMedicalCpoeSplitbed 分床记录表
     * @return 结果
     */
    public int updateTMedicalCpoeSplitbed(TMedicalCpoeSplitbed tMedicalCpoeSplitbed);

    /**
     * 批量删除分床记录表
     * 
     * @param ids 需要删除的分床记录表主键集合
     * @return 结果
     */
    public int deleteTMedicalCpoeSplitbedByIds(String[] ids);

    /**
     * 删除分床记录表信息
     * 
     * @param id 分床记录表主键
     * @return 结果
     */
    public int deleteTMedicalCpoeSplitbedById(String id);
}
