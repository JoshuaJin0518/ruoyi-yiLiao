package com.ruoyi.ruoyi_yiliao.service;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostDeadBill;

/**
 * 医院烂账记录表Service接口
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
public interface ITMedicalCostDeadBillService 
{
    /**
     * 查询医院烂账记录表
     * 
     * @param id 医院烂账记录表主键
     * @return 医院烂账记录表
     */
    public TMedicalCostDeadBill selectTMedicalCostDeadBillById(String id);

    /**
     * 查询医院烂账记录表列表
     * 
     * @param tMedicalCostDeadBill 医院烂账记录表
     * @return 医院烂账记录表集合
     */
    public List<TMedicalCostDeadBill> selectTMedicalCostDeadBillList(TMedicalCostDeadBill tMedicalCostDeadBill);

    /**
     * 新增医院烂账记录表
     * 
     * @param tMedicalCostDeadBill 医院烂账记录表
     * @return 结果
     */
    public int insertTMedicalCostDeadBill(TMedicalCostDeadBill tMedicalCostDeadBill);

    /**
     * 修改医院烂账记录表
     * 
     * @param tMedicalCostDeadBill 医院烂账记录表
     * @return 结果
     */
    public int updateTMedicalCostDeadBill(TMedicalCostDeadBill tMedicalCostDeadBill);

    /**
     * 批量删除医院烂账记录表
     * 
     * @param ids 需要删除的医院烂账记录表主键集合
     * @return 结果
     */
    public int deleteTMedicalCostDeadBillByIds(String[] ids);

    /**
     * 删除医院烂账记录表信息
     * 
     * @param id 医院烂账记录表主键
     * @return 结果
     */
    public int deleteTMedicalCostDeadBillById(String id);
}
