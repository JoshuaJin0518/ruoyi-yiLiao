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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostPersonArchives;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCostPersonArchivesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 患者信息Controller
 * 
 * @author ruoyi
 * @date 2023-08-12
 */
@RestController
@RequestMapping("/yiliao/huanzhexinxi")
public class TMedicalCostPersonArchivesController extends BaseController
{
    @Autowired
    private ITMedicalCostPersonArchivesService tMedicalCostPersonArchivesService;

    /**
     * 查询患者信息列表
     */
    @PreAuthorize("@ss.hasPermi('yiliao:huanzhexinxi:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalCostPersonArchives tMedicalCostPersonArchives)
    {
        startPage();
        List<TMedicalCostPersonArchives> list = tMedicalCostPersonArchivesService.selectTMedicalCostPersonArchivesList(tMedicalCostPersonArchives);
        return getDataTable(list);
    }

    /**
     * 导出患者信息列表
     */
    @PreAuthorize("@ss.hasPermi('yiliao:huanzhexinxi:export')")
    @Log(title = "患者信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalCostPersonArchives tMedicalCostPersonArchives)
    {
        List<TMedicalCostPersonArchives> list = tMedicalCostPersonArchivesService.selectTMedicalCostPersonArchivesList(tMedicalCostPersonArchives);
        ExcelUtil<TMedicalCostPersonArchives> util = new ExcelUtil<TMedicalCostPersonArchives>(TMedicalCostPersonArchives.class);
        util.exportExcel(response, list, "患者信息数据");
    }

    /**
     * 获取患者信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('yiliao:huanzhexinxi:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalCostPersonArchivesService.selectTMedicalCostPersonArchivesById(id));
    }

    /**
     * 新增患者信息
     */
    @PreAuthorize("@ss.hasPermi('yiliao:huanzhexinxi:add')")
    @Log(title = "患者信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalCostPersonArchives tMedicalCostPersonArchives)
    {
        return toAjax(tMedicalCostPersonArchivesService.insertTMedicalCostPersonArchives(tMedicalCostPersonArchives));
    }

    /**
     * 修改患者信息
     */
    @PreAuthorize("@ss.hasPermi('yiliao:huanzhexinxi:edit')")
    @Log(title = "患者信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalCostPersonArchives tMedicalCostPersonArchives)
    {
        return toAjax(tMedicalCostPersonArchivesService.updateTMedicalCostPersonArchives(tMedicalCostPersonArchives));
    }

    /**
     * 删除患者信息
     */
    @PreAuthorize("@ss.hasPermi('yiliao:huanzhexinxi:remove')")
    @Log(title = "患者信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalCostPersonArchivesService.deleteTMedicalCostPersonArchivesByIds(ids));
    }
}
