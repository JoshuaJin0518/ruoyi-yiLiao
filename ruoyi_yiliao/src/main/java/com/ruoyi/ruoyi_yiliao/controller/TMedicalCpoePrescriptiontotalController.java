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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoePrescriptiontotal;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCpoePrescriptiontotalService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 住院治疗处方总表Controller
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@RestController
@RequestMapping("/hushizhan/prescriptiontotal")
public class TMedicalCpoePrescriptiontotalController extends BaseController
{
    @Autowired
    private ITMedicalCpoePrescriptiontotalService tMedicalCpoePrescriptiontotalService;

    /**
     * 查询住院治疗处方总表列表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:prescriptiontotal:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalCpoePrescriptiontotal tMedicalCpoePrescriptiontotal)
    {
        startPage();
        List<TMedicalCpoePrescriptiontotal> list = tMedicalCpoePrescriptiontotalService.selectTMedicalCpoePrescriptiontotalList(tMedicalCpoePrescriptiontotal);
        return getDataTable(list);
    }

    /**
     * 导出住院治疗处方总表列表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:prescriptiontotal:export')")
    @Log(title = "住院治疗处方总表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalCpoePrescriptiontotal tMedicalCpoePrescriptiontotal)
    {
        List<TMedicalCpoePrescriptiontotal> list = tMedicalCpoePrescriptiontotalService.selectTMedicalCpoePrescriptiontotalList(tMedicalCpoePrescriptiontotal);
        ExcelUtil<TMedicalCpoePrescriptiontotal> util = new ExcelUtil<TMedicalCpoePrescriptiontotal>(TMedicalCpoePrescriptiontotal.class);
        util.exportExcel(response, list, "住院治疗处方总表数据");
    }

    /**
     * 获取住院治疗处方总表详细信息
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:prescriptiontotal:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalCpoePrescriptiontotalService.selectTMedicalCpoePrescriptiontotalById(id));
    }

    /**
     * 新增住院治疗处方总表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:prescriptiontotal:add')")
    @Log(title = "住院治疗处方总表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalCpoePrescriptiontotal tMedicalCpoePrescriptiontotal)
    {
        return toAjax(tMedicalCpoePrescriptiontotalService.insertTMedicalCpoePrescriptiontotal(tMedicalCpoePrescriptiontotal));
    }

    /**
     * 修改住院治疗处方总表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:prescriptiontotal:edit')")
    @Log(title = "住院治疗处方总表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalCpoePrescriptiontotal tMedicalCpoePrescriptiontotal)
    {
        return toAjax(tMedicalCpoePrescriptiontotalService.updateTMedicalCpoePrescriptiontotal(tMedicalCpoePrescriptiontotal));
    }

    /**
     * 删除住院治疗处方总表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:prescriptiontotal:remove')")
    @Log(title = "住院治疗处方总表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalCpoePrescriptiontotalService.deleteTMedicalCpoePrescriptiontotalByIds(ids));
    }
}
