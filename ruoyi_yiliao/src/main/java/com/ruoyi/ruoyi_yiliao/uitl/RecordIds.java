package com.ruoyi.ruoyi_yiliao.uitl;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ruoyi_yiliao.domain.RecordId;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalLisInfo;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalPacsInfo;
import com.ruoyi.ruoyi_yiliao.mapper.RecordIdsMappper;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalLisInfoService;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalPacsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Component
public class RecordIds {
    @Autowired
    private RecordIdsMappper recordIdsMappper;

    public RecordIdsMappper getRecordIdsMappper() {
        return recordIdsMappper;
    }

    @GetMapping
    public AjaxResult list() {
        AjaxResult ajax = AjaxResult.success();
        System.out.println("=========================-12313-------------------------");
        System.out.println(recordIdsMappper.getAll());
        List<RecordId> sel = recordIdsMappper.getAll();
        for (RecordId recordId : sel) {
            System.out.println(recordId);
        }
        ajax.put("recordId", sel);
        return ajax;
    }

    @GetMapping
    public RecordId getid(String id) {
        System.out.println("=========================-12313-------------------------");
        List<RecordId> sel = null;
        if (id!=null){
         sel = recordIdsMappper.getId(id);
        }
        return sel.get(0);
    }


}
