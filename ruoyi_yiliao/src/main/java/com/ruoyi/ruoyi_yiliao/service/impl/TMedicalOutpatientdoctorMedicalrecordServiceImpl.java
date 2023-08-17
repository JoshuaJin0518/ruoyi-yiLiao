package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalOutpatientdoctorMedicalrecordMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalOutpatientdoctorMedicalrecord;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalOutpatientdoctorMedicalrecordService;

/**
 * 门诊病历表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@Service
public class TMedicalOutpatientdoctorMedicalrecordServiceImpl implements ITMedicalOutpatientdoctorMedicalrecordService 
{
    @Autowired
    private TMedicalOutpatientdoctorMedicalrecordMapper tMedicalOutpatientdoctorMedicalrecordMapper;

    /**
     * 查询门诊病历表
     * 
     * @param id 门诊病历表主键
     * @return 门诊病历表
     */
    @Override
    public TMedicalOutpatientdoctorMedicalrecord selectTMedicalOutpatientdoctorMedicalrecordById(String id)
    {
        return tMedicalOutpatientdoctorMedicalrecordMapper.selectTMedicalOutpatientdoctorMedicalrecordById(id);
    }

    /**
     * 查询门诊病历表列表
     * 
     * @param tMedicalOutpatientdoctorMedicalrecord 门诊病历表
     * @return 门诊病历表
     */
    @Override
    public List<TMedicalOutpatientdoctorMedicalrecord> selectTMedicalOutpatientdoctorMedicalrecordList(TMedicalOutpatientdoctorMedicalrecord tMedicalOutpatientdoctorMedicalrecord)
    {
        return tMedicalOutpatientdoctorMedicalrecordMapper.selectTMedicalOutpatientdoctorMedicalrecordList(tMedicalOutpatientdoctorMedicalrecord);
    }

    /**
     * 新增门诊病历表
     * 
     * @param tMedicalOutpatientdoctorMedicalrecord 门诊病历表
     * @return 结果
     */
    @Override
    public int insertTMedicalOutpatientdoctorMedicalrecord(TMedicalOutpatientdoctorMedicalrecord tMedicalOutpatientdoctorMedicalrecord)
    {
        return tMedicalOutpatientdoctorMedicalrecordMapper.insertTMedicalOutpatientdoctorMedicalrecord(tMedicalOutpatientdoctorMedicalrecord);
    }

    /**
     * 修改门诊病历表
     * 
     * @param tMedicalOutpatientdoctorMedicalrecord 门诊病历表
     * @return 结果
     */
    @Override
    public int updateTMedicalOutpatientdoctorMedicalrecord(TMedicalOutpatientdoctorMedicalrecord tMedicalOutpatientdoctorMedicalrecord)
    {
        return tMedicalOutpatientdoctorMedicalrecordMapper.updateTMedicalOutpatientdoctorMedicalrecord(tMedicalOutpatientdoctorMedicalrecord);
    }

    /**
     * 批量删除门诊病历表
     * 
     * @param ids 需要删除的门诊病历表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalOutpatientdoctorMedicalrecordByIds(String[] ids)
    {
        return tMedicalOutpatientdoctorMedicalrecordMapper.deleteTMedicalOutpatientdoctorMedicalrecordByIds(ids);
    }

    /**
     * 删除门诊病历表信息
     * 
     * @param id 门诊病历表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalOutpatientdoctorMedicalrecordById(String id)
    {
        return tMedicalOutpatientdoctorMedicalrecordMapper.deleteTMedicalOutpatientdoctorMedicalrecordById(id);
    }
}
