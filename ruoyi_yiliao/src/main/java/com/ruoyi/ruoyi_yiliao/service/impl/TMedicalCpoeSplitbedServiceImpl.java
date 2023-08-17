package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalCpoeSplitbedMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoeSplitbed;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCpoeSplitbedService;

/**
 * 分床记录表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@Service
public class TMedicalCpoeSplitbedServiceImpl implements ITMedicalCpoeSplitbedService 
{
    @Autowired
    private TMedicalCpoeSplitbedMapper tMedicalCpoeSplitbedMapper;

    /**
     * 查询分床记录表
     * 
     * @param id 分床记录表主键
     * @return 分床记录表
     */
    @Override
    public TMedicalCpoeSplitbed selectTMedicalCpoeSplitbedById(String id)
    {
        return tMedicalCpoeSplitbedMapper.selectTMedicalCpoeSplitbedById(id);
    }

    /**
     * 查询分床记录表列表
     * 
     * @param tMedicalCpoeSplitbed 分床记录表
     * @return 分床记录表
     */
    @Override
    public List<TMedicalCpoeSplitbed> selectTMedicalCpoeSplitbedList(TMedicalCpoeSplitbed tMedicalCpoeSplitbed)
    {
        return tMedicalCpoeSplitbedMapper.selectTMedicalCpoeSplitbedList(tMedicalCpoeSplitbed);
    }

    /**
     * 新增分床记录表
     * 
     * @param tMedicalCpoeSplitbed 分床记录表
     * @return 结果
     */
    @Override
    public int insertTMedicalCpoeSplitbed(TMedicalCpoeSplitbed tMedicalCpoeSplitbed)
    {
        tMedicalCpoeSplitbed.setCreateTime(DateUtils.getNowDate());
        return tMedicalCpoeSplitbedMapper.insertTMedicalCpoeSplitbed(tMedicalCpoeSplitbed);
    }

    /**
     * 修改分床记录表
     * 
     * @param tMedicalCpoeSplitbed 分床记录表
     * @return 结果
     */
    @Override
    public int updateTMedicalCpoeSplitbed(TMedicalCpoeSplitbed tMedicalCpoeSplitbed)
    {
        return tMedicalCpoeSplitbedMapper.updateTMedicalCpoeSplitbed(tMedicalCpoeSplitbed);
    }

    /**
     * 批量删除分床记录表
     * 
     * @param ids 需要删除的分床记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCpoeSplitbedByIds(String[] ids)
    {
        return tMedicalCpoeSplitbedMapper.deleteTMedicalCpoeSplitbedByIds(ids);
    }

    /**
     * 删除分床记录表信息
     * 
     * @param id 分床记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCpoeSplitbedById(String id)
    {
        return tMedicalCpoeSplitbedMapper.deleteTMedicalCpoeSplitbedById(id);
    }
}
