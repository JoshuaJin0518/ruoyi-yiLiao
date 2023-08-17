package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalCpoeBedMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoeBed;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCpoeBedService;

/**
 * 床位记录表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@Service
public class TMedicalCpoeBedServiceImpl implements ITMedicalCpoeBedService 
{
    @Autowired
    private TMedicalCpoeBedMapper tMedicalCpoeBedMapper;

    /**
     * 查询床位记录表
     * 
     * @param id 床位记录表主键
     * @return 床位记录表
     */
    @Override
    public TMedicalCpoeBed selectTMedicalCpoeBedById(String id)
    {
        return tMedicalCpoeBedMapper.selectTMedicalCpoeBedById(id);
    }

    /**
     * 查询床位记录表列表
     * 
     * @param tMedicalCpoeBed 床位记录表
     * @return 床位记录表
     */
    @Override
    public List<TMedicalCpoeBed> selectTMedicalCpoeBedList(TMedicalCpoeBed tMedicalCpoeBed)
    {
        return tMedicalCpoeBedMapper.selectTMedicalCpoeBedList(tMedicalCpoeBed);
    }

    /**
     * 新增床位记录表
     * 
     * @param tMedicalCpoeBed 床位记录表
     * @return 结果
     */
    @Override
    public int insertTMedicalCpoeBed(TMedicalCpoeBed tMedicalCpoeBed)
    {
        return tMedicalCpoeBedMapper.insertTMedicalCpoeBed(tMedicalCpoeBed);
    }

    /**
     * 修改床位记录表
     * 
     * @param tMedicalCpoeBed 床位记录表
     * @return 结果
     */
    @Override
    public int updateTMedicalCpoeBed(TMedicalCpoeBed tMedicalCpoeBed)
    {
        return tMedicalCpoeBedMapper.updateTMedicalCpoeBed(tMedicalCpoeBed);
    }

    /**
     * 批量删除床位记录表
     * 
     * @param ids 需要删除的床位记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCpoeBedByIds(String[] ids)
    {
        return tMedicalCpoeBedMapper.deleteTMedicalCpoeBedByIds(ids);
    }

    /**
     * 删除床位记录表信息
     * 
     * @param id 床位记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCpoeBedById(String id)
    {
        return tMedicalCpoeBedMapper.deleteTMedicalCpoeBedById(id);
    }
}
