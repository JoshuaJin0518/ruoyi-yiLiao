package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalCostBillMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostBill;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCostBillService;

/**
 * 患者费用账单表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@Service
public class TMedicalCostBillServiceImpl implements ITMedicalCostBillService 
{
    @Autowired
    private TMedicalCostBillMapper tMedicalCostBillMapper;

    /**
     * 查询患者费用账单表
     * 
     * @param id 患者费用账单表主键
     * @return 患者费用账单表
     */
    @Override
    public TMedicalCostBill selectTMedicalCostBillById(String id)
    {
        return tMedicalCostBillMapper.selectTMedicalCostBillById(id);
    }

    /**
     * 查询患者费用账单表列表
     * 
     * @param tMedicalCostBill 患者费用账单表
     * @return 患者费用账单表
     */
    @Override
    public List<TMedicalCostBill> selectTMedicalCostBillList(TMedicalCostBill tMedicalCostBill)
    {
        return tMedicalCostBillMapper.selectTMedicalCostBillList(tMedicalCostBill);
    }

    /**
     * 新增患者费用账单表
     * 
     * @param tMedicalCostBill 患者费用账单表
     * @return 结果
     */
    @Override
    public int insertTMedicalCostBill(TMedicalCostBill tMedicalCostBill)
    {
        tMedicalCostBill.setCreateTime(DateUtils.getNowDate());
        return tMedicalCostBillMapper.insertTMedicalCostBill(tMedicalCostBill);
    }

    /**
     * 修改患者费用账单表
     * 
     * @param tMedicalCostBill 患者费用账单表
     * @return 结果
     */
    @Override
    public int updateTMedicalCostBill(TMedicalCostBill tMedicalCostBill)
    {
        return tMedicalCostBillMapper.updateTMedicalCostBill(tMedicalCostBill);
    }

    /**
     * 批量删除患者费用账单表
     * 
     * @param ids 需要删除的患者费用账单表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCostBillByIds(String[] ids)
    {
        return tMedicalCostBillMapper.deleteTMedicalCostBillByIds(ids);
    }

    /**
     * 删除患者费用账单表信息
     * 
     * @param id 患者费用账单表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCostBillById(String id)
    {
        return tMedicalCostBillMapper.deleteTMedicalCostBillById(id);
    }
}
