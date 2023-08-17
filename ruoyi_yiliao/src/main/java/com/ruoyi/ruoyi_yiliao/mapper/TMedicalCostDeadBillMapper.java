package com.ruoyi.ruoyi_yiliao.mapper;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostDeadBill;

/**
 * 医院烂账记录表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
public interface TMedicalCostDeadBillMapper 
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
     * 删除医院烂账记录表
     * 
     * @param id 医院烂账记录表主键
     * @return 结果
     */
    public int deleteTMedicalCostDeadBillById(String id);

    /**
     * 批量删除医院烂账记录表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalCostDeadBillByIds(String[] ids);
}
