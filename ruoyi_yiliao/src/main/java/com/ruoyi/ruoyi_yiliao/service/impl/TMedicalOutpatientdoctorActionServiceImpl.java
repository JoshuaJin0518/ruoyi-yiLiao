package com.ruoyi.ruoyi_yiliao.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ruoyi_yiliao.domain.RecordId;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalLisInfo;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalPacsInfo;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalDrugsInfoService;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalLisInfoService;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalPacsInfoService;
import com.ruoyi.ruoyi_yiliao.uitl.RecordIds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ruoyi_yiliao.mapper.TMedicalOutpatientdoctorActionMapper;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalOutpatientdoctorAction;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalOutpatientdoctorActionService;

/**
 * 医生看病流程表Service业务层处理
 *
 * @author ruoyi
 * @date 2023-08-14
 */
@Service
public class TMedicalOutpatientdoctorActionServiceImpl implements ITMedicalOutpatientdoctorActionService {
    @Autowired
    private TMedicalOutpatientdoctorActionMapper tMedicalOutpatientdoctorActionMapper;
    @Autowired
    private ITMedicalLisInfoService itMedicalLisInfoService;
    @Autowired
    private ITMedicalPacsInfoService itMedicalPacsInfoService;
    @Autowired
    private RecordIds recordIds;


    /**
     * 查询医生看病流程表
     *
     * @param id 医生看病流程表主键
     * @return 医生看病流程表
     */
    @Override
    public TMedicalOutpatientdoctorAction selectTMedicalOutpatientdoctorActionById(String id) {
        return tMedicalOutpatientdoctorActionMapper.selectTMedicalOutpatientdoctorActionById(id);
    }

    /**
     * 查询医生看病流程表列表
     *
     * @param tMedicalOutpatientdoctorAction 医生看病流程表
     * @return 医生看病流程表
     */
    @Override
    public List<TMedicalOutpatientdoctorAction> selectTMedicalOutpatientdoctorActionList(TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction) {
        return tMedicalOutpatientdoctorActionMapper.selectTMedicalOutpatientdoctorActionList(tMedicalOutpatientdoctorAction);
    }

    /**
     * 新增医生看病流程表
     *
     * @param tMedicalOutpatientdoctorAction 医生看病流程表
     * @return 结果
     */
    //开启事务
    @Override
    public int insertTMedicalOutpatientdoctorAction(TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction) {
        //将中文逗号换成英文
        tMedicalOutpatientdoctorAction.
                setPartName(tMedicalOutpatientdoctorAction.getPartName().replaceAll("，", ","));
        int i = tMedicalOutpatientdoctorActionMapper.insertTMedicalOutpatientdoctorAction
                (tMedicalOutpatientdoctorAction);
        if (i > 0) {
            //获得检查名称
            String[] split = tMedicalOutpatientdoctorAction.getPartName().split(",");
            //获得患者id
            RecordId recordId = recordIds.getid(tMedicalOutpatientdoctorAction.getId());
            for (String s : split) {
                if (s.equals("ct")) {
                    //生成pacs表
                    TMedicalPacsInfo tMedicalPacsInfo =new TMedicalPacsInfo();
                    tMedicalPacsInfo.setName(s);
                    tMedicalPacsInfo.setPersonId(recordId.getId());
                    tMedicalPacsInfo.setDoctorid(recordId.getDoctorid());
                    tMedicalPacsInfo.setStatus(2);
                    tMedicalPacsInfo.setReceiveRecordId(tMedicalOutpatientdoctorAction.getOpDoctorReceiveRecordId());
                    itMedicalPacsInfoService.insertTMedicalPacsInfo(tMedicalPacsInfo);
                } else if (s.equals("血常规")||s.equals("尿检")) {
                    //生成lis表
                    TMedicalLisInfo lisInfo =new TMedicalLisInfo();
                    lisInfo.setName(s);
                    lisInfo.setPersonId(recordId.getId());
                    lisInfo.setDoctorid(recordId.getDoctorid());
                    lisInfo.setStatus(2);
                    lisInfo.setReceiveRecordId(tMedicalOutpatientdoctorAction.getOpDoctorReceiveRecordId());
                    itMedicalLisInfoService.insertTMedicalLisInfo(lisInfo);
                }
            }
        }
        return i;
    }

    /**
     * 修改医生看病流程表
     *
     * @param tMedicalOutpatientdoctorAction 医生看病流程表
     * @return 结果
     */
    @Override
    public int updateTMedicalOutpatientdoctorAction(TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction) {
        return tMedicalOutpatientdoctorActionMapper.updateTMedicalOutpatientdoctorAction(tMedicalOutpatientdoctorAction);
    }

    /**
     * 批量删除医生看病流程表
     *
     * @param ids 需要删除的医生看病流程表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalOutpatientdoctorActionByIds(String[] ids) {
        return tMedicalOutpatientdoctorActionMapper.deleteTMedicalOutpatientdoctorActionByIds(ids);
    }

    /**
     * 删除医生看病流程表信息
     *
     * @param id 医生看病流程表主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalOutpatientdoctorActionById(String id) {
        return tMedicalOutpatientdoctorActionMapper.deleteTMedicalOutpatientdoctorActionById(id);
    }
}
