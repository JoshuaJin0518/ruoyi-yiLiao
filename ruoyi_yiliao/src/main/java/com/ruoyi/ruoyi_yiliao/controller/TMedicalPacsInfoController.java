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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalPacsInfo;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalPacsInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * pacs影像信息表Controller
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@RestController
@RequestMapping("/lis/pacs_info")
public class TMedicalPacsInfoController extends BaseController
{
    @Autowired
    private ITMedicalPacsInfoService tMedicalPacsInfoService;

    /**
     * 查询pacs影像信息表列表
     */
    @PreAuthorize("@ss.hasPermi('lis:pacs_info:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalPacsInfo tMedicalPacsInfo)
    {
        startPage();
        List<TMedicalPacsInfo> list = tMedicalPacsInfoService.selectTMedicalPacsInfoList(tMedicalPacsInfo);
        return getDataTable(list);
    }

    /**
     * 导出pacs影像信息表列表
     */
    @PreAuthorize("@ss.hasPermi('lis:pacs_info:export')")
    @Log(title = "pacs影像信息表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalPacsInfo tMedicalPacsInfo)
    {
        List<TMedicalPacsInfo> list = tMedicalPacsInfoService.selectTMedicalPacsInfoList(tMedicalPacsInfo);
        ExcelUtil<TMedicalPacsInfo> util = new ExcelUtil<TMedicalPacsInfo>(TMedicalPacsInfo.class);
        util.exportExcel(response, list, "pacs影像信息表数据");
    }

    /**
     * 获取pacs影像信息表详细信息
     */
    @PreAuthorize("@ss.hasPermi('lis:pacs_info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalPacsInfoService.selectTMedicalPacsInfoById(id));
    }

    /**
     * 新增pacs影像信息表
     */
    @PreAuthorize("@ss.hasPermi('lis:pacs_info:add')")
    @Log(title = "pacs影像信息表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalPacsInfo tMedicalPacsInfo)
    {
        return toAjax(tMedicalPacsInfoService.insertTMedicalPacsInfo(tMedicalPacsInfo));
    }

    /**
     * 修改pacs影像信息表
     */
    @PreAuthorize("@ss.hasPermi('lis:pacs_info:edit')")
    @Log(title = "pacs影像信息表", businessType = BusinessType.UPDATE)
    @PutMapping
    @Transactional
    public AjaxResult edit(@RequestBody TMedicalPacsInfo tMedicalPacsInfo)
    {
        return toAjax(tMedicalPacsInfoService.updateTMedicalPacsInfo(tMedicalPacsInfo));
    }

    /**
     * 删除pacs影像信息表
     */
    @PreAuthorize("@ss.hasPermi('lis:pacs_info:remove')")
    @Log(title = "pacs影像信息表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalPacsInfoService.deleteTMedicalPacsInfoByIds(ids));
    }
}
