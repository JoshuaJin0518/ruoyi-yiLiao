package com.ruoyi.ruoyi_yiliao.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalLisInfo;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalLisInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * Lis检验信息表Controller
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@RestController
@RequestMapping("/lis/info")
public class TMedicalLisInfoController extends BaseController
{
    @Autowired
    private ITMedicalLisInfoService tMedicalLisInfoService;

    /**
     * 查询Lis检验信息表列表
     */
    @PreAuthorize("@ss.hasPermi('lis:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalLisInfo tMedicalLisInfo)
    {
        startPage();
        List<TMedicalLisInfo> list = tMedicalLisInfoService.selectTMedicalLisInfoList(tMedicalLisInfo);
        return getDataTable(list);
    }

    /**
     * 导出Lis检验信息表列表
     */
    @PreAuthorize("@ss.hasPermi('lis:info:export')")
    @Log(title = "Lis检验信息表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalLisInfo tMedicalLisInfo)
    {
        List<TMedicalLisInfo> list = tMedicalLisInfoService.selectTMedicalLisInfoList(tMedicalLisInfo);
        ExcelUtil<TMedicalLisInfo> util = new ExcelUtil<TMedicalLisInfo>(TMedicalLisInfo.class);
        util.exportExcel(response, list, "Lis检验信息表数据");
    }

    /**
     * 获取Lis检验信息表详细信息
     */
    @PreAuthorize("@ss.hasPermi('lis:info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalLisInfoService.selectTMedicalLisInfoById(id));
    }

    /**
     * 新增Lis检验信息表
     */
    @PreAuthorize("@ss.hasPermi('lis:info:add')")
    @Log(title = "Lis检验信息表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalLisInfo tMedicalLisInfo)
    {
        return toAjax(tMedicalLisInfoService.insertTMedicalLisInfo(tMedicalLisInfo));
    }

    /**
     * 修改Lis检验信息表
     */
    @PreAuthorize("@ss.hasPermi('lis:info:edit')")
    @Log(title = "Lis检验信息表", businessType = BusinessType.UPDATE)
    @PutMapping
    @Transactional
    public AjaxResult edit(@RequestBody TMedicalLisInfo tMedicalLisInfo)
    {
        return toAjax(tMedicalLisInfoService.updateTMedicalLisInfo(tMedicalLisInfo));
    }

    /**
     * 删除Lis检验信息表
     */
    @PreAuthorize("@ss.hasPermi('lis:info:remove')")
    @Log(title = "Lis检验信息表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalLisInfoService.deleteTMedicalLisInfoByIds(ids));
    }
}
