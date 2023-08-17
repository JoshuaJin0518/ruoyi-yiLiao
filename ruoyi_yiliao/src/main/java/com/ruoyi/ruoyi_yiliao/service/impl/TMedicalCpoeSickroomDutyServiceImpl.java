package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalCpoeSickroomDutyMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoeSickroomDuty;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCpoeSickroomDutyService;

/**
 * 病房值班记录表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@Service
public class TMedicalCpoeSickroomDutyServiceImpl implements ITMedicalCpoeSickroomDutyService 
{
    @Autowired
    private TMedicalCpoeSickroomDutyMapper tMedicalCpoeSickroomDutyMapper;

    /**
     * 查询病房值班记录表
     * 
     * @param id 病房值班记录表主键
     * @return 病房值班记录表
     */
    @Override
    public TMedicalCpoeSickroomDuty selectTMedicalCpoeSickroomDutyById(String id)
    {
        return tMedicalCpoeSickroomDutyMapper.selectTMedicalCpoeSickroomDutyById(id);
    }

    /**
     * 查询病房值班记录表列表
     * 
     * @param tMedicalCpoeSickroomDuty 病房值班记录表
     * @return 病房值班记录表
     */
    @Override
    public List<TMedicalCpoeSickroomDuty> selectTMedicalCpoeSickroomDutyList(TMedicalCpoeSickroomDuty tMedicalCpoeSickroomDuty)
    {
        return tMedicalCpoeSickroomDutyMapper.selectTMedicalCpoeSickroomDutyList(tMedicalCpoeSickroomDuty);
    }

    /**
     * 新增病房值班记录表
     * 
     * @param tMedicalCpoeSickroomDuty 病房值班记录表
     * @return 结果
     */
    @Override
    public int insertTMedicalCpoeSickroomDuty(TMedicalCpoeSickroomDuty tMedicalCpoeSickroomDuty)
    {
        return tMedicalCpoeSickroomDutyMapper.insertTMedicalCpoeSickroomDuty(tMedicalCpoeSickroomDuty);
    }

    /**
     * 修改病房值班记录表
     * 
     * @param tMedicalCpoeSickroomDuty 病房值班记录表
     * @return 结果
     */
    @Override
    public int updateTMedicalCpoeSickroomDuty(TMedicalCpoeSickroomDuty tMedicalCpoeSickroomDuty)
    {
        return tMedicalCpoeSickroomDutyMapper.updateTMedicalCpoeSickroomDuty(tMedicalCpoeSickroomDuty);
    }

    /**
     * 批量删除病房值班记录表
     * 
     * @param ids 需要删除的病房值班记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCpoeSickroomDutyByIds(String[] ids)
    {
        return tMedicalCpoeSickroomDutyMapper.deleteTMedicalCpoeSickroomDutyByIds(ids);
    }

    /**
     * 删除病房值班记录表信息
     * 
     * @param id 病房值班记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCpoeSickroomDutyById(String id)
    {
        return tMedicalCpoeSickroomDutyMapper.deleteTMedicalCpoeSickroomDutyById(id);
    }
}
