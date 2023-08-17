package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalCpoeSickroomMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoeSickroom;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCpoeSickroomService;

/**
 * 病房记录表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@Service
public class TMedicalCpoeSickroomServiceImpl implements ITMedicalCpoeSickroomService 
{
    @Autowired
    private TMedicalCpoeSickroomMapper tMedicalCpoeSickroomMapper;

    /**
     * 查询病房记录表
     * 
     * @param id 病房记录表主键
     * @return 病房记录表
     */
    @Override
    public TMedicalCpoeSickroom selectTMedicalCpoeSickroomById(String id)
    {
        return tMedicalCpoeSickroomMapper.selectTMedicalCpoeSickroomById(id);
    }

    /**
     * 查询病房记录表列表
     * 
     * @param tMedicalCpoeSickroom 病房记录表
     * @return 病房记录表
     */
    @Override
    public List<TMedicalCpoeSickroom> selectTMedicalCpoeSickroomList(TMedicalCpoeSickroom tMedicalCpoeSickroom)
    {
        return tMedicalCpoeSickroomMapper.selectTMedicalCpoeSickroomList(tMedicalCpoeSickroom);
    }

    /**
     * 新增病房记录表
     * 
     * @param tMedicalCpoeSickroom 病房记录表
     * @return 结果
     */
    @Override
    public int insertTMedicalCpoeSickroom(TMedicalCpoeSickroom tMedicalCpoeSickroom)
    {
        return tMedicalCpoeSickroomMapper.insertTMedicalCpoeSickroom(tMedicalCpoeSickroom);
    }

    /**
     * 修改病房记录表
     * 
     * @param tMedicalCpoeSickroom 病房记录表
     * @return 结果
     */
    @Override
    public int updateTMedicalCpoeSickroom(TMedicalCpoeSickroom tMedicalCpoeSickroom)
    {
        return tMedicalCpoeSickroomMapper.updateTMedicalCpoeSickroom(tMedicalCpoeSickroom);
    }

    /**
     * 批量删除病房记录表
     * 
     * @param ids 需要删除的病房记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCpoeSickroomByIds(String[] ids)
    {
        return tMedicalCpoeSickroomMapper.deleteTMedicalCpoeSickroomByIds(ids);
    }

    /**
     * 删除病房记录表信息
     * 
     * @param id 病房记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCpoeSickroomById(String id)
    {
        return tMedicalCpoeSickroomMapper.deleteTMedicalCpoeSickroomById(id);
    }
}
