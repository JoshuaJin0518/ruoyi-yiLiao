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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostOutpatientInfo;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCostOutpatientInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 门诊卡信息表Controller
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@RestController
@RequestMapping("/feiyongguanli/info")
public class TMedicalCostOutpatientInfoController extends BaseController
{
    @Autowired
    private ITMedicalCostOutpatientInfoService tMedicalCostOutpatientInfoService;

    /**
     * 查询门诊卡信息表列表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalCostOutpatientInfo tMedicalCostOutpatientInfo)
    {
        startPage();
        List<TMedicalCostOutpatientInfo> list = tMedicalCostOutpatientInfoService.selectTMedicalCostOutpatientInfoList(tMedicalCostOutpatientInfo);
        return getDataTable(list);
    }

    /**
     * 导出门诊卡信息表列表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:info:export')")
    @Log(title = "门诊卡信息表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalCostOutpatientInfo tMedicalCostOutpatientInfo)
    {
        List<TMedicalCostOutpatientInfo> list = tMedicalCostOutpatientInfoService.selectTMedicalCostOutpatientInfoList(tMedicalCostOutpatientInfo);
        ExcelUtil<TMedicalCostOutpatientInfo> util = new ExcelUtil<TMedicalCostOutpatientInfo>(TMedicalCostOutpatientInfo.class);
        util.exportExcel(response, list, "门诊卡信息表数据");
    }

    /**
     * 获取门诊卡信息表详细信息
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalCostOutpatientInfoService.selectTMedicalCostOutpatientInfoById(id));
    }

    /**
     * 新增门诊卡信息表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:info:add')")
    @Log(title = "门诊卡信息表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalCostOutpatientInfo tMedicalCostOutpatientInfo)
    {
        return toAjax(tMedicalCostOutpatientInfoService.insertTMedicalCostOutpatientInfo(tMedicalCostOutpatientInfo));
    }

    /**
     * 修改门诊卡信息表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:info:edit')")
    @Log(title = "门诊卡信息表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalCostOutpatientInfo tMedicalCostOutpatientInfo)
    {
        return toAjax(tMedicalCostOutpatientInfoService.updateTMedicalCostOutpatientInfo(tMedicalCostOutpatientInfo));
    }

    /**
     * 删除门诊卡信息表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:info:remove')")
    @Log(title = "门诊卡信息表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalCostOutpatientInfoService.deleteTMedicalCostOutpatientInfoByIds(ids));
    }
}
