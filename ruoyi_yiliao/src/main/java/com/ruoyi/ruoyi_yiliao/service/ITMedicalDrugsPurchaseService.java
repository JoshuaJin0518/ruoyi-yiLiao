package com.ruoyi.ruoyi_yiliao.service;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalDrugsPurchase;

/**
 * 药品采购信息表Service接口
 * 
 * @author ruoyi
 * @date 2023-08-17
 */
public interface ITMedicalDrugsPurchaseService 
{
    /**
     * 查询药品采购信息表
     * 
     * @param id 药品采购信息表主键
     * @return 药品采购信息表
     */
    public TMedicalDrugsPurchase selectTMedicalDrugsPurchaseById(String id);

    /**
     * 查询药品采购信息表列表
     * 
     * @param tMedicalDrugsPurchase 药品采购信息表
     * @return 药品采购信息表集合
     */
    public List<TMedicalDrugsPurchase> selectTMedicalDrugsPurchaseList(TMedicalDrugsPurchase tMedicalDrugsPurchase);

    /**
     * 新增药品采购信息表
     * 
     * @param tMedicalDrugsPurchase 药品采购信息表
     * @return 结果
     */
    public int insertTMedicalDrugsPurchase(TMedicalDrugsPurchase tMedicalDrugsPurchase);

    /**
     * 修改药品采购信息表
     * 
     * @param tMedicalDrugsPurchase 药品采购信息表
     * @return 结果
     */
    public int updateTMedicalDrugsPurchase(TMedicalDrugsPurchase tMedicalDrugsPurchase);

    /**
     * 批量删除药品采购信息表
     * 
     * @param ids 需要删除的药品采购信息表主键集合
     * @return 结果
     */
    public int deleteTMedicalDrugsPurchaseByIds(String[] ids);

    /**
     * 删除药品采购信息表信息
     * 
     * @param id 药品采购信息表主键
     * @return 结果
     */
    public int deleteTMedicalDrugsPurchaseById(String id);
}
