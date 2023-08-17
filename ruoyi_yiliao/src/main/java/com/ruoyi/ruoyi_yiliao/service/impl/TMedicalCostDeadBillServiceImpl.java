package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalCostDeadBillMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostDeadBill;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCostDeadBillService;

/**
 * 医院烂账记录表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@Service
public class TMedicalCostDeadBillServiceImpl implements ITMedicalCostDeadBillService 
{
    @Autowired
    private TMedicalCostDeadBillMapper tMedicalCostDeadBillMapper;

    /**
     * 查询医院烂账记录表
     * 
     * @param id 医院烂账记录表主键
     * @return 医院烂账记录表
     */
    @Override
    public TMedicalCostDeadBill selectTMedicalCostDeadBillById(String id)
    {
        return tMedicalCostDeadBillMapper.selectTMedicalCostDeadBillById(id);
    }

    /**
     * 查询医院烂账记录表列表
     * 
     * @param tMedicalCostDeadBill 医院烂账记录表
     * @return 医院烂账记录表
     */
    @Override
    public List<TMedicalCostDeadBill> selectTMedicalCostDeadBillList(TMedicalCostDeadBill tMedicalCostDeadBill)
    {
        return tMedicalCostDeadBillMapper.selectTMedicalCostDeadBillList(tMedicalCostDeadBill);
    }

    /**
     * 新增医院烂账记录表
     * 
     * @param tMedicalCostDeadBill 医院烂账记录表
     * @return 结果
     */
    @Override
    public int insertTMedicalCostDeadBill(TMedicalCostDeadBill tMedicalCostDeadBill)
    {
        tMedicalCostDeadBill.setCreateTime(DateUtils.getNowDate());
        return tMedicalCostDeadBillMapper.insertTMedicalCostDeadBill(tMedicalCostDeadBill);
    }

    /**
     * 修改医院烂账记录表
     * 
     * @param tMedicalCostDeadBill 医院烂账记录表
     * @return 结果
     */
    @Override
    public int updateTMedicalCostDeadBill(TMedicalCostDeadBill tMedicalCostDeadBill)
    {
        return tMedicalCostDeadBillMapper.updateTMedicalCostDeadBill(tMedicalCostDeadBill);
    }

    /**
     * 批量删除医院烂账记录表
     * 
     * @param ids 需要删除的医院烂账记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCostDeadBillByIds(String[] ids)
    {
        return tMedicalCostDeadBillMapper.deleteTMedicalCostDeadBillByIds(ids);
    }

    /**
     * 删除医院烂账记录表信息
     * 
     * @param id 医院烂账记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCostDeadBillById(String id)
    {
        return tMedicalCostDeadBillMapper.deleteTMedicalCostDeadBillById(id);
    }
}
