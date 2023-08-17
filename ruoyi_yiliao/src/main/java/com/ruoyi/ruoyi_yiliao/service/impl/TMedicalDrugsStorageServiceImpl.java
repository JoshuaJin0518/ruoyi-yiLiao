package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalDrugsStorageMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalDrugsStorage;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalDrugsStorageService;

/**
 * 药库库存表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-17
 */
@Service
public class TMedicalDrugsStorageServiceImpl implements ITMedicalDrugsStorageService 
{
    @Autowired
    private TMedicalDrugsStorageMapper tMedicalDrugsStorageMapper;

    /**
     * 查询药库库存表
     * 
     * @param id 药库库存表主键
     * @return 药库库存表
     */
    @Override
    public TMedicalDrugsStorage selectTMedicalDrugsStorageById(String id)
    {
        return tMedicalDrugsStorageMapper.selectTMedicalDrugsStorageById(id);
    }

    /**
     * 查询药库库存表列表
     * 
     * @param tMedicalDrugsStorage 药库库存表
     * @return 药库库存表
     */
    @Override
    public List<TMedicalDrugsStorage> selectTMedicalDrugsStorageList(TMedicalDrugsStorage tMedicalDrugsStorage)
    {
        return tMedicalDrugsStorageMapper.selectTMedicalDrugsStorageList(tMedicalDrugsStorage);
    }

    /**
     * 新增药库库存表
     * 
     * @param tMedicalDrugsStorage 药库库存表
     * @return 结果
     */
    @Override
    public int insertTMedicalDrugsStorage(TMedicalDrugsStorage tMedicalDrugsStorage)
    {
        return tMedicalDrugsStorageMapper.insertTMedicalDrugsStorage(tMedicalDrugsStorage);
    }

    /**
     * 修改药库库存表
     * 
     * @param tMedicalDrugsStorage 药库库存表
     * @return 结果
     */
    @Override
    public int updateTMedicalDrugsStorage(TMedicalDrugsStorage tMedicalDrugsStorage)
    {
        tMedicalDrugsStorage.setUpdateTime(DateUtils.getNowDate());
        return tMedicalDrugsStorageMapper.updateTMedicalDrugsStorage(tMedicalDrugsStorage);
    }

    /**
     * 批量删除药库库存表
     * 
     * @param ids 需要删除的药库库存表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalDrugsStorageByIds(String[] ids)
    {
        return tMedicalDrugsStorageMapper.deleteTMedicalDrugsStorageByIds(ids);
    }

    /**
     * 删除药库库存表信息
     * 
     * @param id 药库库存表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalDrugsStorageById(String id)
    {
        return tMedicalDrugsStorageMapper.deleteTMedicalDrugsStorageById(id);
    }
}
