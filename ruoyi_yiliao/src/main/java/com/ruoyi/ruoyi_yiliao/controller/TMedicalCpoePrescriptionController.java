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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoePrescription;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCpoePrescriptionService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 住院治疗处方表Controller
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@RestController
@RequestMapping("/hushizhan/prescription")
public class TMedicalCpoePrescriptionController extends BaseController
{
    @Autowired
    private ITMedicalCpoePrescriptionService tMedicalCpoePrescriptionService;

    /**
     * 查询住院治疗处方表列表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:prescription:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalCpoePrescription tMedicalCpoePrescription)
    {
        startPage();
        List<TMedicalCpoePrescription> list = tMedicalCpoePrescriptionService.selectTMedicalCpoePrescriptionList(tMedicalCpoePrescription);
        return getDataTable(list);
    }

    /**
     * 导出住院治疗处方表列表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:prescription:export')")
    @Log(title = "住院治疗处方表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalCpoePrescription tMedicalCpoePrescription)
    {
        List<TMedicalCpoePrescription> list = tMedicalCpoePrescriptionService.selectTMedicalCpoePrescriptionList(tMedicalCpoePrescription);
        ExcelUtil<TMedicalCpoePrescription> util = new ExcelUtil<TMedicalCpoePrescription>(TMedicalCpoePrescription.class);
        util.exportExcel(response, list, "住院治疗处方表数据");
    }

    /**
     * 获取住院治疗处方表详细信息
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:prescription:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalCpoePrescriptionService.selectTMedicalCpoePrescriptionById(id));
    }

    /**
     * 新增住院治疗处方表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:prescription:add')")
    @Log(title = "住院治疗处方表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalCpoePrescription tMedicalCpoePrescription)
    {
        return toAjax(tMedicalCpoePrescriptionService.insertTMedicalCpoePrescription(tMedicalCpoePrescription));
    }

    /**
     * 修改住院治疗处方表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:prescription:edit')")
    @Log(title = "住院治疗处方表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalCpoePrescription tMedicalCpoePrescription)
    {
        return toAjax(tMedicalCpoePrescriptionService.updateTMedicalCpoePrescription(tMedicalCpoePrescription));
    }

    /**
     * 删除住院治疗处方表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:prescription:remove')")
    @Log(title = "住院治疗处方表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalCpoePrescriptionService.deleteTMedicalCpoePrescriptionByIds(ids));
    }
}
