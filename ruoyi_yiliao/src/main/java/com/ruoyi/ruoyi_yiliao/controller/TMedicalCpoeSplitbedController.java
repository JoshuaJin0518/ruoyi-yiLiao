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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoeSplitbed;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCpoeSplitbedService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 分床记录表Controller
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@RestController
@RequestMapping("/hushizhan/splitbed")
public class TMedicalCpoeSplitbedController extends BaseController
{
    @Autowired
    private ITMedicalCpoeSplitbedService tMedicalCpoeSplitbedService;

    /**
     * 查询分床记录表列表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:splitbed:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalCpoeSplitbed tMedicalCpoeSplitbed)
    {
        startPage();
        List<TMedicalCpoeSplitbed> list = tMedicalCpoeSplitbedService.selectTMedicalCpoeSplitbedList(tMedicalCpoeSplitbed);
        return getDataTable(list);
    }

    /**
     * 导出分床记录表列表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:splitbed:export')")
    @Log(title = "分床记录表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalCpoeSplitbed tMedicalCpoeSplitbed)
    {
        List<TMedicalCpoeSplitbed> list = tMedicalCpoeSplitbedService.selectTMedicalCpoeSplitbedList(tMedicalCpoeSplitbed);
        ExcelUtil<TMedicalCpoeSplitbed> util = new ExcelUtil<TMedicalCpoeSplitbed>(TMedicalCpoeSplitbed.class);
        util.exportExcel(response, list, "分床记录表数据");
    }

    /**
     * 获取分床记录表详细信息
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:splitbed:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalCpoeSplitbedService.selectTMedicalCpoeSplitbedById(id));
    }

    /**
     * 新增分床记录表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:splitbed:add')")
    @Log(title = "分床记录表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalCpoeSplitbed tMedicalCpoeSplitbed)
    {
        return toAjax(tMedicalCpoeSplitbedService.insertTMedicalCpoeSplitbed(tMedicalCpoeSplitbed));
    }

    /**
     * 修改分床记录表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:splitbed:edit')")
    @Log(title = "分床记录表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalCpoeSplitbed tMedicalCpoeSplitbed)
    {
        return toAjax(tMedicalCpoeSplitbedService.updateTMedicalCpoeSplitbed(tMedicalCpoeSplitbed));
    }

    /**
     * 删除分床记录表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:splitbed:remove')")
    @Log(title = "分床记录表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalCpoeSplitbedService.deleteTMedicalCpoeSplitbedByIds(ids));
    }
}
