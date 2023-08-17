package com.ruoyi.ruoyi_yiliao.service.impl;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalCostPersonArchivesMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostPersonArchives;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCostPersonArchivesService;


/**
 * 患者信息Service业务层处理
 *
 * @author ruoyi
 * @date 2023-08-12
 */
@Service
@Slf4j
public class TMedicalCostPersonArchivesServiceImpl implements ITMedicalCostPersonArchivesService {
    @Autowired
    private TMedicalCostPersonArchivesMapper tMedicalCostPersonArchivesMapper;

    /**
     * 查询患者信息
     *
     * @param id 患者信息主键
     * @return 患者信息
     */
    @Override
    public TMedicalCostPersonArchives selectTMedicalCostPersonArchivesById(String id) {
        return tMedicalCostPersonArchivesMapper.selectTMedicalCostPersonArchivesById(id);
    }

    /**
     * 查询患者信息列表
     *
     * @param tMedicalCostPersonArchives 患者信息
     * @return 患者信息
     */
    @Override
    public List<TMedicalCostPersonArchives> selectTMedicalCostPersonArchivesList(TMedicalCostPersonArchives tMedicalCostPersonArchives) {
        return tMedicalCostPersonArchivesMapper.selectTMedicalCostPersonArchivesList(tMedicalCostPersonArchives);
    }

    /**
     * 新增患者信息
     *
     * @param tMedicalCostPersonArchives 患者信息
     * @return 结果
     */
    @Override
    public int insertTMedicalCostPersonArchives(TMedicalCostPersonArchives tMedicalCostPersonArchives) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-hh HH:mmm:ss");
        String format = simpleDateFormat.format(new Date(System.currentTimeMillis()));
        System.out.println(format);
        //插入时间
        tMedicalCostPersonArchives.setCreateTime(format);
    /*    // 获得创建人id
        tMedicalCostPersonArchives.setOperator(SecurityUtils.getUsername());*/
//      //插入id
//        tMedicalCostPersonArchives.setId(tMedicalCostPersonArchives.getOperator() + System.currentTimeMillis());
        System.out.println("=============="+tMedicalCostPersonArchives);

        return tMedicalCostPersonArchivesMapper.insertTMedicalCostPersonArchives(tMedicalCostPersonArchives);
    }

    /**
     * 修改患者信息
     *
     * @param tMedicalCostPersonArchives 患者信息
     * @return 结果
     */
    @Override
    public int updateTMedicalCostPersonArchives(TMedicalCostPersonArchives tMedicalCostPersonArchives) {
        return tMedicalCostPersonArchivesMapper.updateTMedicalCostPersonArchives(tMedicalCostPersonArchives);
    }

    /**
     * 批量删除患者信息
     *
     * @param ids 需要删除的患者信息主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCostPersonArchivesByIds(String[] ids) {
        return tMedicalCostPersonArchivesMapper.deleteTMedicalCostPersonArchivesByIds(ids);
    }

    /**
     * 删除患者信息信息
     *
     * @param id 患者信息主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCostPersonArchivesById(String id) {
        return tMedicalCostPersonArchivesMapper.deleteTMedicalCostPersonArchivesById(id);
    }
}
