package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalCpoeDoctorsorderhandleMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoeDoctorsorderhandle;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCpoeDoctorsorderhandleService;

/**
 * 医嘱执行记录表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@Service
public class TMedicalCpoeDoctorsorderhandleServiceImpl implements ITMedicalCpoeDoctorsorderhandleService 
{
    @Autowired
    private TMedicalCpoeDoctorsorderhandleMapper tMedicalCpoeDoctorsorderhandleMapper;

    /**
     * 查询医嘱执行记录表
     * 
     * @param id 医嘱执行记录表主键
     * @return 医嘱执行记录表
     */
    @Override
    public TMedicalCpoeDoctorsorderhandle selectTMedicalCpoeDoctorsorderhandleById(String id)
    {
        return tMedicalCpoeDoctorsorderhandleMapper.selectTMedicalCpoeDoctorsorderhandleById(id);
    }

    /**
     * 查询医嘱执行记录表列表
     * 
     * @param tMedicalCpoeDoctorsorderhandle 医嘱执行记录表
     * @return 医嘱执行记录表
     */
    @Override
    public List<TMedicalCpoeDoctorsorderhandle> selectTMedicalCpoeDoctorsorderhandleList(TMedicalCpoeDoctorsorderhandle tMedicalCpoeDoctorsorderhandle)
    {
        return tMedicalCpoeDoctorsorderhandleMapper.selectTMedicalCpoeDoctorsorderhandleList(tMedicalCpoeDoctorsorderhandle);
    }

    /**
     * 新增医嘱执行记录表
     * 
     * @param tMedicalCpoeDoctorsorderhandle 医嘱执行记录表
     * @return 结果
     */
    @Override
    public int insertTMedicalCpoeDoctorsorderhandle(TMedicalCpoeDoctorsorderhandle tMedicalCpoeDoctorsorderhandle)
    {
        tMedicalCpoeDoctorsorderhandle.setCreateTime(DateUtils.getNowDate());
        return tMedicalCpoeDoctorsorderhandleMapper.insertTMedicalCpoeDoctorsorderhandle(tMedicalCpoeDoctorsorderhandle);
    }

    /**
     * 修改医嘱执行记录表
     * 
     * @param tMedicalCpoeDoctorsorderhandle 医嘱执行记录表
     * @return 结果
     */
    @Override
    public int updateTMedicalCpoeDoctorsorderhandle(TMedicalCpoeDoctorsorderhandle tMedicalCpoeDoctorsorderhandle)
    {
        return tMedicalCpoeDoctorsorderhandleMapper.updateTMedicalCpoeDoctorsorderhandle(tMedicalCpoeDoctorsorderhandle);
    }

    /**
     * 批量删除医嘱执行记录表
     * 
     * @param ids 需要删除的医嘱执行记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCpoeDoctorsorderhandleByIds(String[] ids)
    {
        return tMedicalCpoeDoctorsorderhandleMapper.deleteTMedicalCpoeDoctorsorderhandleByIds(ids);
    }

    /**
     * 删除医嘱执行记录表信息
     * 
     * @param id 医嘱执行记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCpoeDoctorsorderhandleById(String id)
    {
        return tMedicalCpoeDoctorsorderhandleMapper.deleteTMedicalCpoeDoctorsorderhandleById(id);
    }
}
