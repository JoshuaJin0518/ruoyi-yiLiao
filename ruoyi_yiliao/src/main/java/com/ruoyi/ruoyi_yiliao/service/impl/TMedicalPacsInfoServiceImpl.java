package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.ruoyi_yiliao.annotion.Add;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalPacsInfoMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalPacsInfo;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalPacsInfoService;

/**
 * pacs影像信息表Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@Service
public class TMedicalPacsInfoServiceImpl implements ITMedicalPacsInfoService 
{
    @Autowired
    private TMedicalPacsInfoMapper tMedicalPacsInfoMapper;

    /**
     * 查询pacs影像信息表
     * 
     * @param id pacs影像信息表主键
     * @return pacs影像信息表
     */
    @Override
    public TMedicalPacsInfo selectTMedicalPacsInfoById(String id)
    {
        return tMedicalPacsInfoMapper.selectTMedicalPacsInfoById(id);
    }

    /**
     * 查询pacs影像信息表列表
     * 
     * @param tMedicalPacsInfo pacs影像信息表
     * @return pacs影像信息表
     */
    @Override
    public List<TMedicalPacsInfo> selectTMedicalPacsInfoList(TMedicalPacsInfo tMedicalPacsInfo)
    {
        return tMedicalPacsInfoMapper.selectTMedicalPacsInfoList(tMedicalPacsInfo);
    }

    /**
     * 新增pacs影像信息表
     * 
     * @param tMedicalPacsInfo pacs影像信息表
     * @return 结果
     */
    @Override
    public int insertTMedicalPacsInfo(TMedicalPacsInfo tMedicalPacsInfo)
    {
        tMedicalPacsInfo.setCreateTime(DateUtils.getNowDate());
        return tMedicalPacsInfoMapper.insertTMedicalPacsInfo(tMedicalPacsInfo);
    }

    /**
     * 修改pacs影像信息表
     * 
     * @param tMedicalPacsInfo pacs影像信息表
     * @return 结果
     */
    @Add
    @Override
    public int updateTMedicalPacsInfo(TMedicalPacsInfo tMedicalPacsInfo)
    {

        return tMedicalPacsInfoMapper.updateTMedicalPacsInfo(tMedicalPacsInfo);
    }

    /**
     * 批量删除pacs影像信息表
     * 
     * @param ids 需要删除的pacs影像信息表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalPacsInfoByIds(String[] ids)
    {
        return tMedicalPacsInfoMapper.deleteTMedicalPacsInfoByIds(ids);
    }

    /**
     * 删除pacs影像信息表信息
     * 
     * @param id pacs影像信息表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalPacsInfoById(String id)
    {
        return tMedicalPacsInfoMapper.deleteTMedicalPacsInfoById(id);
    }
}
