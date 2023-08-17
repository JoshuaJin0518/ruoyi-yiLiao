package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.ruoyi_yiliao.annotion.Add;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalOutpatientdoctorAction;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalOutpatientdoctorActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalLisInfoMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalLisInfo;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalLisInfoService;

/**
 * Lis检验信息表Service业务层处理
 *
 * @author ruoyi
 * @date 2023-08-14
 */
@Service
public class TMedicalLisInfoServiceImpl implements ITMedicalLisInfoService {
    @Autowired
    private TMedicalLisInfoMapper tMedicalLisInfoMapper;
    @Autowired
    private ITMedicalOutpatientdoctorActionService itMedicalOutpatientdoctorActionService;

    /**
     * 查询Lis检验信息表
     *
     * @param id Lis检验信息表主键
     * @return Lis检验信息表
     */
    @Override
    public TMedicalLisInfo selectTMedicalLisInfoById(String id) {
        return tMedicalLisInfoMapper.selectTMedicalLisInfoById(id);
    }

    /**
     * 查询Lis检验信息表列表
     *
     * @param tMedicalLisInfo Lis检验信息表
     * @return Lis检验信息表
     */
    @Override
    public List<TMedicalLisInfo> selectTMedicalLisInfoList(TMedicalLisInfo tMedicalLisInfo) {
        return tMedicalLisInfoMapper.selectTMedicalLisInfoList(tMedicalLisInfo);
    }

    /**
     * 新增Lis检验信息表
     *
     * @param tMedicalLisInfo Lis检验信息表
     * @return 结果
     */
    @Override
    public int insertTMedicalLisInfo(TMedicalLisInfo tMedicalLisInfo) {
        tMedicalLisInfo.setCreateTime(DateUtils.getNowDate());
        return tMedicalLisInfoMapper.insertTMedicalLisInfo(tMedicalLisInfo);
    }

    /**
     * 修改Lis检验信息表
     *
     * @param tMedicalLisInfo Lis检验信息表
     * @return 结果
     */
    //开启事务
    @Add
    @Override
    public int updateTMedicalLisInfo(TMedicalLisInfo tMedicalLisInfo) {
        return tMedicalLisInfoMapper.updateTMedicalLisInfo(tMedicalLisInfo);
    }

    /**
     * 批量删除Lis检验信息表
     *
     * @param ids 需要删除的Lis检验信息表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalLisInfoByIds(String[] ids) {
        return tMedicalLisInfoMapper.deleteTMedicalLisInfoByIds(ids);
    }

    /**
     * 删除Lis检验信息表信息
     *
     * @param id Lis检验信息表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalLisInfoById(String id) {
        return tMedicalLisInfoMapper.deleteTMedicalLisInfoById(id);
    }
}
