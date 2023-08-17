package com.ruoyi.ruoyi_yiliao.mapper;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoeSplitbed;

/**
 * 分床记录表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
public interface TMedicalCpoeSplitbedMapper 
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
     * 删除分床记录表
     * 
     * @param id 分床记录表主键
     * @return 结果
     */
    public int deleteTMedicalCpoeSplitbedById(String id);

    /**
     * 批量删除分床记录表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalCpoeSplitbedByIds(String[] ids);
}
