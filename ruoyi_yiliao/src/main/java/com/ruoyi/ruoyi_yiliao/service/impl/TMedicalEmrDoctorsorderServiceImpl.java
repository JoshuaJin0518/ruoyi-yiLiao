package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalEmrDoctorsorderMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalEmrDoctorsorder;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalEmrDoctorsorderService;

/**
 * 医嘱记录表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@Service
public class TMedicalEmrDoctorsorderServiceImpl implements ITMedicalEmrDoctorsorderService 
{
    @Autowired
    private TMedicalEmrDoctorsorderMapper tMedicalEmrDoctorsorderMapper;

    /**
     * 查询医嘱记录表
     * 
     * @param id 医嘱记录表主键
     * @return 医嘱记录表
     */
    @Override
    public TMedicalEmrDoctorsorder selectTMedicalEmrDoctorsorderById(String id)
    {
        return tMedicalEmrDoctorsorderMapper.selectTMedicalEmrDoctorsorderById(id);
    }

    /**
     * 查询医嘱记录表列表
     * 
     * @param tMedicalEmrDoctorsorder 医嘱记录表
     * @return 医嘱记录表
     */
    @Override
    public List<TMedicalEmrDoctorsorder> selectTMedicalEmrDoctorsorderList(TMedicalEmrDoctorsorder tMedicalEmrDoctorsorder)
    {
        return tMedicalEmrDoctorsorderMapper.selectTMedicalEmrDoctorsorderList(tMedicalEmrDoctorsorder);
    }

    /**
     * 新增医嘱记录表
     * 
     * @param tMedicalEmrDoctorsorder 医嘱记录表
     * @return 结果
     */
    @Override
    public int insertTMedicalEmrDoctorsorder(TMedicalEmrDoctorsorder tMedicalEmrDoctorsorder)
    {
        tMedicalEmrDoctorsorder.setCreateTime(DateUtils.getNowDate());
        return tMedicalEmrDoctorsorderMapper.insertTMedicalEmrDoctorsorder(tMedicalEmrDoctorsorder);
    }

    /**
     * 修改医嘱记录表
     * 
     * @param tMedicalEmrDoctorsorder 医嘱记录表
     * @return 结果
     */
    @Override
    public int updateTMedicalEmrDoctorsorder(TMedicalEmrDoctorsorder tMedicalEmrDoctorsorder)
    {
        return tMedicalEmrDoctorsorderMapper.updateTMedicalEmrDoctorsorder(tMedicalEmrDoctorsorder);
    }

    /**
     * 批量删除医嘱记录表
     * 
     * @param ids 需要删除的医嘱记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalEmrDoctorsorderByIds(String[] ids)
    {
        return tMedicalEmrDoctorsorderMapper.deleteTMedicalEmrDoctorsorderByIds(ids);
    }

    /**
     * 删除医嘱记录表信息
     * 
     * @param id 医嘱记录表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalEmrDoctorsorderById(String id)
    {
        return tMedicalEmrDoctorsorderMapper.deleteTMedicalEmrDoctorsorderById(id);
    }
}
