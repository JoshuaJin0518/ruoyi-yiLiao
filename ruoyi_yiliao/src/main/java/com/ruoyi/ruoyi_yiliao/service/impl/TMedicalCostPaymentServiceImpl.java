package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalCostPaymentMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostPayment;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCostPaymentService;

/**
 * 缴费Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-17
 */
@Service
public class TMedicalCostPaymentServiceImpl implements ITMedicalCostPaymentService 
{
    @Autowired
    private TMedicalCostPaymentMapper tMedicalCostPaymentMapper;

    /**
     * 查询缴费
     * 
     * @param id 缴费主键
     * @return 缴费
     */
    @Override
    public TMedicalCostPayment selectTMedicalCostPaymentById(String id)
    {
        return tMedicalCostPaymentMapper.selectTMedicalCostPaymentById(id);
    }

    /**
     * 查询缴费列表
     * 
     * @param tMedicalCostPayment 缴费
     * @return 缴费
     */
    @Override
    public List<TMedicalCostPayment> selectTMedicalCostPaymentList(TMedicalCostPayment tMedicalCostPayment)
    {
        return tMedicalCostPaymentMapper.selectTMedicalCostPaymentList(tMedicalCostPayment);
    }

    /**
     * 新增缴费
     * 
     * @param tMedicalCostPayment 缴费
     * @return 结果
     */
    @Override
    public int insertTMedicalCostPayment(TMedicalCostPayment tMedicalCostPayment)
    {
        tMedicalCostPayment.setCreateTime(DateUtils.getNowDate());
        return tMedicalCostPaymentMapper.insertTMedicalCostPayment(tMedicalCostPayment);
    }

    /**
     * 修改缴费
     * 
     * @param tMedicalCostPayment 缴费
     * @return 结果
     */
    @Override
    public int updateTMedicalCostPayment(TMedicalCostPayment tMedicalCostPayment)
    {
        return tMedicalCostPaymentMapper.updateTMedicalCostPayment(tMedicalCostPayment);
    }

    /**
     * 批量删除缴费
     * 
     * @param ids 需要删除的缴费主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCostPaymentByIds(String[] ids)
    {
        return tMedicalCostPaymentMapper.deleteTMedicalCostPaymentByIds(ids);
    }

    /**
     * 删除缴费信息
     * 
     * @param id 缴费主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCostPaymentById(String id)
    {
        return tMedicalCostPaymentMapper.deleteTMedicalCostPaymentById(id);
    }
}
