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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalDrugsPharmacy;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalDrugsPharmacyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 药房库存表Controller
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@RestController
@RequestMapping("/yaofangyaoku/pharmacy")
public class TMedicalDrugsPharmacyController extends BaseController
{
    @Autowired
    private ITMedicalDrugsPharmacyService tMedicalDrugsPharmacyService;

    /**
     * 查询药房库存表列表
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:pharmacy:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalDrugsPharmacy tMedicalDrugsPharmacy)
    {
        startPage();
        List<TMedicalDrugsPharmacy> list = tMedicalDrugsPharmacyService.selectTMedicalDrugsPharmacyList(tMedicalDrugsPharmacy);
        return getDataTable(list);
    }

    /**
     * 导出药房库存表列表
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:pharmacy:export')")
    @Log(title = "药房库存表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalDrugsPharmacy tMedicalDrugsPharmacy)
    {
        List<TMedicalDrugsPharmacy> list = tMedicalDrugsPharmacyService.selectTMedicalDrugsPharmacyList(tMedicalDrugsPharmacy);
        ExcelUtil<TMedicalDrugsPharmacy> util = new ExcelUtil<TMedicalDrugsPharmacy>(TMedicalDrugsPharmacy.class);
        util.exportExcel(response, list, "药房库存表数据");
    }

    /**
     * 获取药房库存表详细信息
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:pharmacy:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalDrugsPharmacyService.selectTMedicalDrugsPharmacyById(id));
    }

    /**
     * 新增药房库存表
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:pharmacy:add')")
    @Log(title = "药房库存表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalDrugsPharmacy tMedicalDrugsPharmacy)
    {
        return toAjax(tMedicalDrugsPharmacyService.insertTMedicalDrugsPharmacy(tMedicalDrugsPharmacy));
    }

    /**
     * 修改药房库存表
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:pharmacy:edit')")
    @Log(title = "药房库存表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalDrugsPharmacy tMedicalDrugsPharmacy)
    {
        return toAjax(tMedicalDrugsPharmacyService.updateTMedicalDrugsPharmacy(tMedicalDrugsPharmacy));
    }

    /**
     * 删除药房库存表
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:pharmacy:remove')")
    @Log(title = "药房库存表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalDrugsPharmacyService.deleteTMedicalDrugsPharmacyByIds(ids));
    }
}
