package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalDrugsPharmacyMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalDrugsPharmacy;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalDrugsPharmacyService;

/**
 * 药房库存表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@Service
public class TMedicalDrugsPharmacyServiceImpl implements ITMedicalDrugsPharmacyService 
{
    @Autowired
    private TMedicalDrugsPharmacyMapper tMedicalDrugsPharmacyMapper;

    /**
     * 查询药房库存表
     * 
     * @param id 药房库存表主键
     * @return 药房库存表
     */
    @Override
    public TMedicalDrugsPharmacy selectTMedicalDrugsPharmacyById(String id)
    {
        return tMedicalDrugsPharmacyMapper.selectTMedicalDrugsPharmacyById(id);
    }

    /**
     * 查询药房库存表列表
     * 
     * @param tMedicalDrugsPharmacy 药房库存表
     * @return 药房库存表
     */
    @Override
    public List<TMedicalDrugsPharmacy> selectTMedicalDrugsPharmacyList(TMedicalDrugsPharmacy tMedicalDrugsPharmacy)
    {
        return tMedicalDrugsPharmacyMapper.selectTMedicalDrugsPharmacyList(tMedicalDrugsPharmacy);
    }

    /**
     * 新增药房库存表
     * 
     * @param tMedicalDrugsPharmacy 药房库存表
     * @return 结果
     */
    @Override
    public int insertTMedicalDrugsPharmacy(TMedicalDrugsPharmacy tMedicalDrugsPharmacy)
    {
        tMedicalDrugsPharmacy.setCreateTime(DateUtils.getNowDate());
        return tMedicalDrugsPharmacyMapper.insertTMedicalDrugsPharmacy(tMedicalDrugsPharmacy);
    }

    /**
     * 修改药房库存表
     * 
     * @param tMedicalDrugsPharmacy 药房库存表
     * @return 结果
     */
    @Override
    public int updateTMedicalDrugsPharmacy(TMedicalDrugsPharmacy tMedicalDrugsPharmacy)
    {
        return tMedicalDrugsPharmacyMapper.updateTMedicalDrugsPharmacy(tMedicalDrugsPharmacy);
    }

    /**
     * 批量删除药房库存表
     * 
     * @param ids 需要删除的药房库存表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalDrugsPharmacyByIds(String[] ids)
    {
        return tMedicalDrugsPharmacyMapper.deleteTMedicalDrugsPharmacyByIds(ids);
    }

    /**
     * 删除药房库存表信息
     * 
     * @param id 药房库存表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalDrugsPharmacyById(String id)
    {
        return tMedicalDrugsPharmacyMapper.deleteTMedicalDrugsPharmacyById(id);
    }
}
