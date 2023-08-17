package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalOutpatientdoctorResultMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalOutpatientdoctorResult;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalOutpatientdoctorResultService;

/**
 * 医生看病结果Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@Service
public class TMedicalOutpatientdoctorResultServiceImpl implements ITMedicalOutpatientdoctorResultService 
{
    @Autowired
    private TMedicalOutpatientdoctorResultMapper tMedicalOutpatientdoctorResultMapper;

    /**
     * 查询医生看病结果
     * 
     * @param id 医生看病结果主键
     * @return 医生看病结果
     */
    @Override
    public TMedicalOutpatientdoctorResult selectTMedicalOutpatientdoctorResultById(String id)
    {
        return tMedicalOutpatientdoctorResultMapper.selectTMedicalOutpatientdoctorResultById(id);
    }

    /**
     * 查询医生看病结果列表
     * 
     * @param tMedicalOutpatientdoctorResult 医生看病结果
     * @return 医生看病结果
     */
    @Override
    public List<TMedicalOutpatientdoctorResult> selectTMedicalOutpatientdoctorResultList(TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult)
    {
        return tMedicalOutpatientdoctorResultMapper.selectTMedicalOutpatientdoctorResultList(tMedicalOutpatientdoctorResult);
    }

    /**
     * 新增医生看病结果
     * 
     * @param tMedicalOutpatientdoctorResult 医生看病结果
     * @return 结果
     */
    @Override
    public int insertTMedicalOutpatientdoctorResult(TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult)
    {
        return tMedicalOutpatientdoctorResultMapper.insertTMedicalOutpatientdoctorResult(tMedicalOutpatientdoctorResult);
    }

    /**
     * 修改医生看病结果
     * 
     * @param tMedicalOutpatientdoctorResult 医生看病结果
     * @return 结果
     */
    @Override
    public int updateTMedicalOutpatientdoctorResult(TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult)
    {
        return tMedicalOutpatientdoctorResultMapper.updateTMedicalOutpatientdoctorResult(tMedicalOutpatientdoctorResult);
    }

    /**
     * 批量删除医生看病结果
     * 
     * @param ids 需要删除的医生看病结果主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalOutpatientdoctorResultByIds(String[] ids)
    {
        return tMedicalOutpatientdoctorResultMapper.deleteTMedicalOutpatientdoctorResultByIds(ids);
    }

    /**
     * 删除医生看病结果信息
     * 
     * @param id 医生看病结果主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalOutpatientdoctorResultById(String id)
    {
        return tMedicalOutpatientdoctorResultMapper.deleteTMedicalOutpatientdoctorResultById(id);
    }
}
