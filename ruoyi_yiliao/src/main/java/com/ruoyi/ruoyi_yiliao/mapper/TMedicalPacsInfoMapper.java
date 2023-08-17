package com.ruoyi.ruoyi_yiliao.mapper;

import java.util.List;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalPacsInfo;

/**
 * pacs影像信息表Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
public interface TMedicalPacsInfoMapper 
{
    /**
     * 查询pacs影像信息表
     * 
     * @param id pacs影像信息表主键
     * @return pacs影像信息表
     */
    public TMedicalPacsInfo selectTMedicalPacsInfoById(String id);

    /**
     * 查询pacs影像信息表列表
     * 
     * @param tMedicalPacsInfo pacs影像信息表
     * @return pacs影像信息表集合
     */
    public List<TMedicalPacsInfo> selectTMedicalPacsInfoList(TMedicalPacsInfo tMedicalPacsInfo);

    /**
     * 新增pacs影像信息表
     * 
     * @param tMedicalPacsInfo pacs影像信息表
     * @return 结果
     */
    public int insertTMedicalPacsInfo(TMedicalPacsInfo tMedicalPacsInfo);

    /**
     * 修改pacs影像信息表
     * 
     * @param tMedicalPacsInfo pacs影像信息表
     * @return 结果
     */
    public int updateTMedicalPacsInfo(TMedicalPacsInfo tMedicalPacsInfo);

    /**
     * 删除pacs影像信息表
     * 
     * @param id pacs影像信息表主键
     * @return 结果
     */
    public int deleteTMedicalPacsInfoById(String id);

    /**
     * 批量删除pacs影像信息表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalPacsInfoByIds(String[] ids);
}
