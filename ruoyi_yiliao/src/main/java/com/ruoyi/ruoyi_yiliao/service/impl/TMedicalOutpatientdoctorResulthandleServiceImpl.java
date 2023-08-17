package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalOutpatientdoctorResulthandleMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalOutpatientdoctorResulthandle;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalOutpatientdoctorResulthandleService;

/**
 * 医生看病治疗方案Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@Service
public class TMedicalOutpatientdoctorResulthandleServiceImpl implements ITMedicalOutpatientdoctorResulthandleService 
{
    @Autowired
    private TMedicalOutpatientdoctorResulthandleMapper tMedicalOutpatientdoctorResulthandleMapper;

    /**
     * 查询医生看病治疗方案
     * 
     * @param id 医生看病治疗方案主键
     * @return 医生看病治疗方案
     */
    @Override
    public TMedicalOutpatientdoctorResulthandle selectTMedicalOutpatientdoctorResulthandleById(String id)
    {
        return tMedicalOutpatientdoctorResulthandleMapper.selectTMedicalOutpatientdoctorResulthandleById(id);
    }

    /**
     * 查询医生看病治疗方案列表
     * 
     * @param tMedicalOutpatientdoctorResulthandle 医生看病治疗方案
     * @return 医生看病治疗方案
     */
    @Override
    public List<TMedicalOutpatientdoctorResulthandle> selectTMedicalOutpatientdoctorResulthandleList(TMedicalOutpatientdoctorResulthandle tMedicalOutpatientdoctorResulthandle)
    {
        return tMedicalOutpatientdoctorResulthandleMapper.selectTMedicalOutpatientdoctorResulthandleList(tMedicalOutpatientdoctorResulthandle);
    }

    /**
     * 新增医生看病治疗方案
     * 
     * @param tMedicalOutpatientdoctorResulthandle 医生看病治疗方案
     * @return 结果
     */
    @Override
    public int insertTMedicalOutpatientdoctorResulthandle(TMedicalOutpatientdoctorResulthandle tMedicalOutpatientdoctorResulthandle)
    {
        return tMedicalOutpatientdoctorResulthandleMapper.insertTMedicalOutpatientdoctorResulthandle(tMedicalOutpatientdoctorResulthandle);
    }

    /**
     * 修改医生看病治疗方案
     * 
     * @param tMedicalOutpatientdoctorResulthandle 医生看病治疗方案
     * @return 结果
     */
    @Override
    public int updateTMedicalOutpatientdoctorResulthandle(TMedicalOutpatientdoctorResulthandle tMedicalOutpatientdoctorResulthandle)
    {
        return tMedicalOutpatientdoctorResulthandleMapper.updateTMedicalOutpatientdoctorResulthandle(tMedicalOutpatientdoctorResulthandle);
    }

    /**
     * 批量删除医生看病治疗方案
     * 
     * @param ids 需要删除的医生看病治疗方案主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalOutpatientdoctorResulthandleByIds(String[] ids)
    {
        return tMedicalOutpatientdoctorResulthandleMapper.deleteTMedicalOutpatientdoctorResulthandleByIds(ids);
    }

    /**
     * 删除医生看病治疗方案信息
     * 
     * @param id 医生看病治疗方案主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalOutpatientdoctorResulthandleById(String id)
    {
        return tMedicalOutpatientdoctorResulthandleMapper.deleteTMedicalOutpatientdoctorResulthandleById(id);
    }
}
