package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalCpoePrescriptionMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoePrescription;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCpoePrescriptionService;

/**
 * 住院治疗处方表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@Service
public class TMedicalCpoePrescriptionServiceImpl implements ITMedicalCpoePrescriptionService 
{
    @Autowired
    private TMedicalCpoePrescriptionMapper tMedicalCpoePrescriptionMapper;

    /**
     * 查询住院治疗处方表
     * 
     * @param id 住院治疗处方表主键
     * @return 住院治疗处方表
     */
    @Override
    public TMedicalCpoePrescription selectTMedicalCpoePrescriptionById(String id)
    {
        return tMedicalCpoePrescriptionMapper.selectTMedicalCpoePrescriptionById(id);
    }

    /**
     * 查询住院治疗处方表列表
     * 
     * @param tMedicalCpoePrescription 住院治疗处方表
     * @return 住院治疗处方表
     */
    @Override
    public List<TMedicalCpoePrescription> selectTMedicalCpoePrescriptionList(TMedicalCpoePrescription tMedicalCpoePrescription)
    {
        return tMedicalCpoePrescriptionMapper.selectTMedicalCpoePrescriptionList(tMedicalCpoePrescription);
    }

    /**
     * 新增住院治疗处方表
     * 
     * @param tMedicalCpoePrescription 住院治疗处方表
     * @return 结果
     */
    @Override
    public int insertTMedicalCpoePrescription(TMedicalCpoePrescription tMedicalCpoePrescription)
    {
        tMedicalCpoePrescription.setCreateTime(DateUtils.getNowDate());
        return tMedicalCpoePrescriptionMapper.insertTMedicalCpoePrescription(tMedicalCpoePrescription);
    }

    /**
     * 修改住院治疗处方表
     * 
     * @param tMedicalCpoePrescription 住院治疗处方表
     * @return 结果
     */
    @Override
    public int updateTMedicalCpoePrescription(TMedicalCpoePrescription tMedicalCpoePrescription)
    {
        return tMedicalCpoePrescriptionMapper.updateTMedicalCpoePrescription(tMedicalCpoePrescription);
    }

    /**
     * 批量删除住院治疗处方表
     * 
     * @param ids 需要删除的住院治疗处方表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCpoePrescriptionByIds(String[] ids)
    {
        return tMedicalCpoePrescriptionMapper.deleteTMedicalCpoePrescriptionByIds(ids);
    }

    /**
     * 删除住院治疗处方表信息
     * 
     * @param id 住院治疗处方表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCpoePrescriptionById(String id)
    {
        return tMedicalCpoePrescriptionMapper.deleteTMedicalCpoePrescriptionById(id);
    }
}
