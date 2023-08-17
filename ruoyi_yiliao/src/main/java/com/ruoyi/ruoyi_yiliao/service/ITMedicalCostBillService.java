package com.ruoyi.ruoyi_yiliao.service;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostBill;

/**
 * 患者费用账单表Service接口
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
public interface ITMedicalCostBillService 
{
    /**
     * 查询患者费用账单表
     * 
     * @param id 患者费用账单表主键
     * @return 患者费用账单表
     */
    public TMedicalCostBill selectTMedicalCostBillById(String id);

    /**
     * 查询患者费用账单表列表
     * 
     * @param tMedicalCostBill 患者费用账单表
     * @return 患者费用账单表集合
     */
    public List<TMedicalCostBill> selectTMedicalCostBillList(TMedicalCostBill tMedicalCostBill);

    /**
     * 新增患者费用账单表
     * 
     * @param tMedicalCostBill 患者费用账单表
     * @return 结果
     */
    public int insertTMedicalCostBill(TMedicalCostBill tMedicalCostBill);

    /**
     * 修改患者费用账单表
     * 
     * @param tMedicalCostBill 患者费用账单表
     * @return 结果
     */
    public int updateTMedicalCostBill(TMedicalCostBill tMedicalCostBill);

    /**
     * 批量删除患者费用账单表
     * 
     * @param ids 需要删除的患者费用账单表主键集合
     * @return 结果
     */
    public int deleteTMedicalCostBillByIds(String[] ids);

    /**
     * 删除患者费用账单表信息
     * 
     * @param id 患者费用账单表主键
     * @return 结果
     */
    public int deleteTMedicalCostBillById(String id);
}
