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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalDrugsStorage;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalDrugsStorageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 药库库存表Controller
 * 
 * @author ruoyi
 * @date 2023-08-17
 */
@RestController
@RequestMapping("/yaofangyaoku/storage")
public class TMedicalDrugsStorageController extends BaseController
{
    @Autowired
    private ITMedicalDrugsStorageService tMedicalDrugsStorageService;

    /**
     * 查询药库库存表列表
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:storage:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalDrugsStorage tMedicalDrugsStorage)
    {
        startPage();
        List<TMedicalDrugsStorage> list = tMedicalDrugsStorageService.selectTMedicalDrugsStorageList(tMedicalDrugsStorage);
        return getDataTable(list);
    }

    /**
     * 导出药库库存表列表
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:storage:export')")
    @Log(title = "药库库存表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalDrugsStorage tMedicalDrugsStorage)
    {
        List<TMedicalDrugsStorage> list = tMedicalDrugsStorageService.selectTMedicalDrugsStorageList(tMedicalDrugsStorage);
        ExcelUtil<TMedicalDrugsStorage> util = new ExcelUtil<TMedicalDrugsStorage>(TMedicalDrugsStorage.class);
        util.exportExcel(response, list, "药库库存表数据");
    }

    /**
     * 获取药库库存表详细信息
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:storage:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalDrugsStorageService.selectTMedicalDrugsStorageById(id));
    }

    /**
     * 新增药库库存表
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:storage:add')")
    @Log(title = "药库库存表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalDrugsStorage tMedicalDrugsStorage)
    {
        return toAjax(tMedicalDrugsStorageService.insertTMedicalDrugsStorage(tMedicalDrugsStorage));
    }

    /**
     * 修改药库库存表
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:storage:edit')")
    @Log(title = "药库库存表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalDrugsStorage tMedicalDrugsStorage)
    {
        return toAjax(tMedicalDrugsStorageService.updateTMedicalDrugsStorage(tMedicalDrugsStorage));
    }

    /**
     * 删除药库库存表
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:storage:remove')")
    @Log(title = "药库库存表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalDrugsStorageService.deleteTMedicalDrugsStorageByIds(ids));
    }
}
