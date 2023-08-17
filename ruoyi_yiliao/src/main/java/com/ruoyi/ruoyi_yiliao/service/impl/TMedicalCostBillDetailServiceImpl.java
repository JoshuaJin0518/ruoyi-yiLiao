package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalCostBillDetailMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostBillDetail;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCostBillDetailService;

/**
 * 患者费用明细表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-15
 */
@Service
public class TMedicalCostBillDetailServiceImpl implements ITMedicalCostBillDetailService 
{
    @Autowired
    private TMedicalCostBillDetailMapper tMedicalCostBillDetailMapper;

    /**
     * 查询患者费用明细表
     * 
     * @param id 患者费用明细表主键
     * @return 患者费用明细表
     */
    @Override
    public TMedicalCostBillDetail selectTMedicalCostBillDetailById(String id)
    {
        return tMedicalCostBillDetailMapper.selectTMedicalCostBillDetailById(id);
    }

    /**
     * 查询患者费用明细表列表
     * 
     * @param tMedicalCostBillDetail 患者费用明细表
     * @return 患者费用明细表
     */
    @Override
    public List<TMedicalCostBillDetail> selectTMedicalCostBillDetailList(TMedicalCostBillDetail tMedicalCostBillDetail)
    {
        return tMedicalCostBillDetailMapper.selectTMedicalCostBillDetailList(tMedicalCostBillDetail);
    }

    /**
     * 新增患者费用明细表
     * 
     * @param tMedicalCostBillDetail 患者费用明细表
     * @return 结果
     */
    @Override
    public int insertTMedicalCostBillDetail(TMedicalCostBillDetail tMedicalCostBillDetail)
    {
        return tMedicalCostBillDetailMapper.insertTMedicalCostBillDetail(tMedicalCostBillDetail);
    }

    /**
     * 修改患者费用明细表
     * 
     * @param tMedicalCostBillDetail 患者费用明细表
     * @return 结果
     */
    @Override
    public int updateTMedicalCostBillDetail(TMedicalCostBillDetail tMedicalCostBillDetail)
    {
        return tMedicalCostBillDetailMapper.updateTMedicalCostBillDetail(tMedicalCostBillDetail);
    }

    /**
     * 批量删除患者费用明细表
     * 
     * @param ids 需要删除的患者费用明细表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCostBillDetailByIds(String[] ids)
    {
        return tMedicalCostBillDetailMapper.deleteTMedicalCostBillDetailByIds(ids);
    }

    /**
     * 删除患者费用明细表信息
     * 
     * @param id 患者费用明细表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCostBillDetailById(String id)
    {
        return tMedicalCostBillDetailMapper.deleteTMedicalCostBillDetailById(id);
    }
}
