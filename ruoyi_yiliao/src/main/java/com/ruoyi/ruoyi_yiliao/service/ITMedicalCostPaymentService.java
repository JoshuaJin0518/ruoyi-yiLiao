package com.ruoyi.ruoyi_yiliao.service;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostPayment;

/**
 * 缴费Service接口
 * 
 * @author ruoyi
 * @date 2023-08-17
 */
public interface ITMedicalCostPaymentService 
{
    /**
     * 查询缴费
     * 
     * @param id 缴费主键
     * @return 缴费
     */
    public TMedicalCostPayment selectTMedicalCostPaymentById(String id);

    /**
     * 查询缴费列表
     * 
     * @param tMedicalCostPayment 缴费
     * @return 缴费集合
     */
    public List<TMedicalCostPayment> selectTMedicalCostPaymentList(TMedicalCostPayment tMedicalCostPayment);

    /**
     * 新增缴费
     * 
     * @param tMedicalCostPayment 缴费
     * @return 结果
     */
    public int insertTMedicalCostPayment(TMedicalCostPayment tMedicalCostPayment);

    /**
     * 修改缴费
     * 
     * @param tMedicalCostPayment 缴费
     * @return 结果
     */
    public int updateTMedicalCostPayment(TMedicalCostPayment tMedicalCostPayment);

    /**
     * 批量删除缴费
     * 
     * @param ids 需要删除的缴费主键集合
     * @return 结果
     */
    public int deleteTMedicalCostPaymentByIds(String[] ids);

    /**
     * 删除缴费信息
     * 
     * @param id 缴费主键
     * @return 结果
     */
    public int deleteTMedicalCostPaymentById(String id);
}
