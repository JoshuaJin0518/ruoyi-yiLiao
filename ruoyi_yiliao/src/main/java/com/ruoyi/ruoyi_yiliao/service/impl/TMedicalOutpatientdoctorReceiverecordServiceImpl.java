package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalOutpatientdoctorReceiverecordMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalOutpatientdoctorReceiverecord;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalOutpatientdoctorReceiverecordService;

/**
 * 接诊记录表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@Service
public class TMedicalOutpatientdoctorReceiverecordServiceImpl implements ITMedicalOutpatientdoctorReceiverecordService 
{
    @Autowired
    private TMedicalOutpatientdoctorReceiverecordMapper tMedicalOutpatientdoctorReceiverecordMapper;

    /**
     * 查询接诊记录表
     * 
     * @param id 接诊记录表主键
     * @return 接诊记录表
     */
    @Override
    public TMedicalOutpatientdoctorReceiverecord selectTMedicalOutpatientdoctorReceiverecordById(String id)
    {
        return tMedicalOutpatientdoctorReceiverecordMapper.selectTMedicalOutpatientdoctorReceiverecordById(id);
    }

    /**
     * 查询接诊记录表列表
     * 
     * @param tMedicalOutpatientdoctorReceiverecord 接诊记录表
     * @return 接诊记录表
     */
    @Override
    public List<TMedicalOutpatientdoctorReceiverecord> selectTMedicalOutpatientdoctorReceiverecordList(TMedicalOutpatientdoctorReceiverecord tMedicalOutpatientdoctorReceiverecord)
    {
        return tMedicalOutpatientdoctorReceiverecordMapper.selectTMedicalOutpatientdoctorReceiverecordList(tMedicalOutpatientdoctorReceiverecord);
    }

    /**
     * 新增接诊记录表
     * 
     * @param tMedicalOutpatientdoctorReceiverecord 接诊记录表
     * @return 结果
     */
    @Override
    public int insertTMedicalOutpatientdoctorReceiverecord(TMedicalOutpatientdoctorReceiverecord tMedicalOutpatientdoctorReceiverecord)
    {
        tMedicalOutpatientdoctorReceiverecord.setCreateTime(DateUtils.getNowDate());
        return tMedicalOutpatientdoctorReceiverecordMapper.insertTMedicalOutpatientdoctorReceiverecord(tMedicalOutpatientdoctorReceiverecord);
    }

    /**
     * 修改接诊记录表
     * 
     * @param tMedicalOutpatientdoctorReceiverecord 接诊记录表
     * @return 结果
     */
    @Override
    public int updateTMedicalOutpatientdoctorReceiverecord(TMedicalOutpatientdoctorReceiverecord tMedicalOutpatientdoctorReceiverecord)
    {
        return tMedicalOutpatientdoctorReceiverecordMapper.updateTMedicalOutpatientdoctorReceiverecord(tMedicalOutpatientdoctorReceiverecord);
    }

    /**
     * 批量删除接诊记录表
     * 
     * @param ids 需要删除的接诊记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalOutpatientdoctorReceiverecordByIds(String[] ids)
    {
        return tMedicalOutpatientdoctorReceiverecordMapper.deleteTMedicalOutpatientdoctorReceiverecordByIds(ids);
    }

    /**
     * 删除接诊记录表信息
     * 
     * @param id 接诊记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalOutpatientdoctorReceiverecordById(String id)
    {
        return tMedicalOutpatientdoctorReceiverecordMapper.deleteTMedicalOutpatientdoctorReceiverecordById(id);
    }
}
