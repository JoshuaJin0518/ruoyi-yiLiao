package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalCpoePrescriptiontotalMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoePrescriptiontotal;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCpoePrescriptiontotalService;

/**
 * 住院治疗处方总表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@Service
public class TMedicalCpoePrescriptiontotalServiceImpl implements ITMedicalCpoePrescriptiontotalService 
{
    @Autowired
    private TMedicalCpoePrescriptiontotalMapper tMedicalCpoePrescriptiontotalMapper;

    /**
     * 查询住院治疗处方总表
     * 
     * @param id 住院治疗处方总表主键
     * @return 住院治疗处方总表
     */
    @Override
    public TMedicalCpoePrescriptiontotal selectTMedicalCpoePrescriptiontotalById(String id)
    {
        return tMedicalCpoePrescriptiontotalMapper.selectTMedicalCpoePrescriptiontotalById(id);
    }

    /**
     * 查询住院治疗处方总表列表
     * 
     * @param tMedicalCpoePrescriptiontotal 住院治疗处方总表
     * @return 住院治疗处方总表
     */
    @Override
    public List<TMedicalCpoePrescriptiontotal> selectTMedicalCpoePrescriptiontotalList(TMedicalCpoePrescriptiontotal tMedicalCpoePrescriptiontotal)
    {
        return tMedicalCpoePrescriptiontotalMapper.selectTMedicalCpoePrescriptiontotalList(tMedicalCpoePrescriptiontotal);
    }

    /**
     * 新增住院治疗处方总表
     * 
     * @param tMedicalCpoePrescriptiontotal 住院治疗处方总表
     * @return 结果
     */
    @Override
    public int insertTMedicalCpoePrescriptiontotal(TMedicalCpoePrescriptiontotal tMedicalCpoePrescriptiontotal)
    {
        tMedicalCpoePrescriptiontotal.setCreateTime(DateUtils.getNowDate());
        return tMedicalCpoePrescriptiontotalMapper.insertTMedicalCpoePrescriptiontotal(tMedicalCpoePrescriptiontotal);
    }

    /**
     * 修改住院治疗处方总表
     * 
     * @param tMedicalCpoePrescriptiontotal 住院治疗处方总表
     * @return 结果
     */
    @Override
    public int updateTMedicalCpoePrescriptiontotal(TMedicalCpoePrescriptiontotal tMedicalCpoePrescriptiontotal)
    {
        return tMedicalCpoePrescriptiontotalMapper.updateTMedicalCpoePrescriptiontotal(tMedicalCpoePrescriptiontotal);
    }

    /**
     * 批量删除住院治疗处方总表
     * 
     * @param ids 需要删除的住院治疗处方总表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCpoePrescriptiontotalByIds(String[] ids)
    {
        return tMedicalCpoePrescriptiontotalMapper.deleteTMedicalCpoePrescriptiontotalByIds(ids);
    }

    /**
     * 删除住院治疗处方总表信息
     * 
     * @param id 住院治疗处方总表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCpoePrescriptiontotalById(String id)
    {
        return tMedicalCpoePrescriptiontotalMapper.deleteTMedicalCpoePrescriptiontotalById(id);
    }
}
