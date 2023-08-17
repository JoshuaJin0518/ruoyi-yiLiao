package com.ruoyi.ruoyi_yiliao.mapper;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostBillDetail;

/**
 * 患者费用明细表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-15
 */
public interface TMedicalCostBillDetailMapper 
{
    /**
     * 查询患者费用明细表
     * 
     * @param id 患者费用明细表主键
     * @return 患者费用明细表
     */
    public TMedicalCostBillDetail selectTMedicalCostBillDetailById(String id);

    /**
     * 查询患者费用明细表列表
     * 
     * @param tMedicalCostBillDetail 患者费用明细表
     * @return 患者费用明细表集合
     */
    public List<TMedicalCostBillDetail> selectTMedicalCostBillDetailList(TMedicalCostBillDetail tMedicalCostBillDetail);

    /**
     * 新增患者费用明细表
     * 
     * @param tMedicalCostBillDetail 患者费用明细表
     * @return 结果
     */
    public int insertTMedicalCostBillDetail(TMedicalCostBillDetail tMedicalCostBillDetail);

    /**
     * 修改患者费用明细表
     * 
     * @param tMedicalCostBillDetail 患者费用明细表
     * @return 结果
     */
    public int updateTMedicalCostBillDetail(TMedicalCostBillDetail tMedicalCostBillDetail);

    /**
     * 删除患者费用明细表
     * 
     * @param id 患者费用明细表主键
     * @return 结果
     */
    public int deleteTMedicalCostBillDetailById(String id);

    /**
     * 批量删除患者费用明细表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalCostBillDetailByIds(String[] ids);
}
