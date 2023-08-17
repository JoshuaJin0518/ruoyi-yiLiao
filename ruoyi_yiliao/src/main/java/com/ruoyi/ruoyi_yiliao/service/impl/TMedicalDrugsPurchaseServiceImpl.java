package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalDrugsPurchaseMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalDrugsPurchase;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalDrugsPurchaseService;

/**
 * 药品采购信息表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-17
 */
@Service
public class TMedicalDrugsPurchaseServiceImpl implements ITMedicalDrugsPurchaseService 
{
    @Autowired
    private TMedicalDrugsPurchaseMapper tMedicalDrugsPurchaseMapper;

    /**
     * 查询药品采购信息表
     * 
     * @param id 药品采购信息表主键
     * @return 药品采购信息表
     */
    @Override
    public TMedicalDrugsPurchase selectTMedicalDrugsPurchaseById(String id)
    {
        return tMedicalDrugsPurchaseMapper.selectTMedicalDrugsPurchaseById(id);
    }

    /**
     * 查询药品采购信息表列表
     * 
     * @param tMedicalDrugsPurchase 药品采购信息表
     * @return 药品采购信息表
     */
    @Override
    public List<TMedicalDrugsPurchase> selectTMedicalDrugsPurchaseList(TMedicalDrugsPurchase tMedicalDrugsPurchase)
    {
        return tMedicalDrugsPurchaseMapper.selectTMedicalDrugsPurchaseList(tMedicalDrugsPurchase);
    }

    /**
     * 新增药品采购信息表
     * 
     * @param tMedicalDrugsPurchase 药品采购信息表
     * @return 结果
     */
    @Override
    public int insertTMedicalDrugsPurchase(TMedicalDrugsPurchase tMedicalDrugsPurchase)
    {
        return tMedicalDrugsPurchaseMapper.insertTMedicalDrugsPurchase(tMedicalDrugsPurchase);
    }

    /**
     * 修改药品采购信息表
     * 
     * @param tMedicalDrugsPurchase 药品采购信息表
     * @return 结果
     */
    @Override
    public int updateTMedicalDrugsPurchase(TMedicalDrugsPurchase tMedicalDrugsPurchase)
    {
        return tMedicalDrugsPurchaseMapper.updateTMedicalDrugsPurchase(tMedicalDrugsPurchase);
    }

    /**
     * 批量删除药品采购信息表
     * 
     * @param ids 需要删除的药品采购信息表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalDrugsPurchaseByIds(String[] ids)
    {
        return tMedicalDrugsPurchaseMapper.deleteTMedicalDrugsPurchaseByIds(ids);
    }

    /**
     * 删除药品采购信息表信息
     * 
     * @param id 药品采购信息表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalDrugsPurchaseById(String id)
    {
        return tMedicalDrugsPurchaseMapper.deleteTMedicalDrugsPurchaseById(id);
    }
}
