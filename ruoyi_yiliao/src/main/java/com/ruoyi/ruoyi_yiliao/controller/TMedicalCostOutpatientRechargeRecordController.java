package com.ruoyi.ruoyi_yiliao.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostOutpatientRechargeRecord;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCostOutpatientRechargeRecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 门诊卡充值记录表Controller
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@RestController
@RequestMapping("/feiyongguanli/record")
public class TMedicalCostOutpatientRechargeRecordController extends BaseController
{
    @Autowired
    private ITMedicalCostOutpatientRechargeRecordService tMedicalCostOutpatientRechargeRecordService;

    /**
     * 查询门诊卡充值记录表列表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:record:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalCostOutpatientRechargeRecord tMedicalCostOutpatientRechargeRecord)
    {
        startPage();
        List<TMedicalCostOutpatientRechargeRecord> list = tMedicalCostOutpatientRechargeRecordService.selectTMedicalCostOutpatientRechargeRecordList(tMedicalCostOutpatientRechargeRecord);
        return getDataTable(list);
    }

    /**
     * 导出门诊卡充值记录表列表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:record:export')")
    @Log(title = "门诊卡充值记录表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalCostOutpatientRechargeRecord tMedicalCostOutpatientRechargeRecord)
    {
        List<TMedicalCostOutpatientRechargeRecord> list = tMedicalCostOutpatientRechargeRecordService.selectTMedicalCostOutpatientRechargeRecordList(tMedicalCostOutpatientRechargeRecord);
        ExcelUtil<TMedicalCostOutpatientRechargeRecord> util = new ExcelUtil<TMedicalCostOutpatientRechargeRecord>(TMedicalCostOutpatientRechargeRecord.class);
        util.exportExcel(response, list, "门诊卡充值记录表数据");
    }

    /**
     * 获取门诊卡充值记录表详细信息
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:record:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalCostOutpatientRechargeRecordService.selectTMedicalCostOutpatientRechargeRecordById(id));
    }

    /**
     * 新增门诊卡充值记录表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:record:add')")
    @Log(title = "门诊卡充值记录表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalCostOutpatientRechargeRecord tMedicalCostOutpatientRechargeRecord)
    {
        return toAjax(tMedicalCostOutpatientRechargeRecordService.insertTMedicalCostOutpatientRechargeRecord(tMedicalCostOutpatientRechargeRecord));
    }

    /**
     * 修改门诊卡充值记录表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:record:edit')")
    @Log(title = "门诊卡充值记录表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalCostOutpatientRechargeRecord tMedicalCostOutpatientRechargeRecord)
    {
        return toAjax(tMedicalCostOutpatientRechargeRecordService.updateTMedicalCostOutpatientRechargeRecord(tMedicalCostOutpatientRechargeRecord));
    }

    /**
     * 删除门诊卡充值记录表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:record:remove')")
    @Log(title = "门诊卡充值记录表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalCostOutpatientRechargeRecordService.deleteTMedicalCostOutpatientRechargeRecordByIds(ids));
    }
}
