package com.ruoyi.ruoyi_yiliao.service;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalLisInfo;

/**
 * Lis检验信息表Service接口
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
public interface ITMedicalLisInfoService 
{
    /**
     * 查询Lis检验信息表
     * 
     * @param id Lis检验信息表主键
     * @return Lis检验信息表
     */
    public TMedicalLisInfo selectTMedicalLisInfoById(String id);

    /**
     * 查询Lis检验信息表列表
     * 
     * @param tMedicalLisInfo Lis检验信息表
     * @return Lis检验信息表集合
     */
    public List<TMedicalLisInfo> selectTMedicalLisInfoList(TMedicalLisInfo tMedicalLisInfo);

    /**
     * 新增Lis检验信息表
     * 
     * @param tMedicalLisInfo Lis检验信息表
     * @return 结果
     */
    public int insertTMedicalLisInfo(TMedicalLisInfo tMedicalLisInfo);

    /**
     * 修改Lis检验信息表
     * 
     * @param tMedicalLisInfo Lis检验信息表
     * @return 结果
     */
    public int updateTMedicalLisInfo(TMedicalLisInfo tMedicalLisInfo);

    /**
     * 批量删除Lis检验信息表
     * 
     * @param ids 需要删除的Lis检验信息表主键集合
     * @return 结果
     */
    public int deleteTMedicalLisInfoByIds(String[] ids);

    /**
     * 删除Lis检验信息表信息
     * 
     * @param id Lis检验信息表主键
     * @return 结果
     */
    public int deleteTMedicalLisInfoById(String id);
}
