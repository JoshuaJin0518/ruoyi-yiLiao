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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoeSickroomDuty;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCpoeSickroomDutyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 病房值班记录表Controller
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@RestController
@RequestMapping("/hushizhan/duty")
public class TMedicalCpoeSickroomDutyController extends BaseController
{
    @Autowired
    private ITMedicalCpoeSickroomDutyService tMedicalCpoeSickroomDutyService;

    /**
     * 查询病房值班记录表列表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:duty:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalCpoeSickroomDuty tMedicalCpoeSickroomDuty)
    {
        startPage();
        List<TMedicalCpoeSickroomDuty> list = tMedicalCpoeSickroomDutyService.selectTMedicalCpoeSickroomDutyList(tMedicalCpoeSickroomDuty);
        return getDataTable(list);
    }

    /**
     * 导出病房值班记录表列表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:duty:export')")
    @Log(title = "病房值班记录表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalCpoeSickroomDuty tMedicalCpoeSickroomDuty)
    {
        List<TMedicalCpoeSickroomDuty> list = tMedicalCpoeSickroomDutyService.selectTMedicalCpoeSickroomDutyList(tMedicalCpoeSickroomDuty);
        ExcelUtil<TMedicalCpoeSickroomDuty> util = new ExcelUtil<TMedicalCpoeSickroomDuty>(TMedicalCpoeSickroomDuty.class);
        util.exportExcel(response, list, "病房值班记录表数据");
    }

    /**
     * 获取病房值班记录表详细信息
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:duty:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalCpoeSickroomDutyService.selectTMedicalCpoeSickroomDutyById(id));
    }

    /**
     * 新增病房值班记录表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:duty:add')")
    @Log(title = "病房值班记录表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalCpoeSickroomDuty tMedicalCpoeSickroomDuty)
    {
        return toAjax(tMedicalCpoeSickroomDutyService.insertTMedicalCpoeSickroomDuty(tMedicalCpoeSickroomDuty));
    }

    /**
     * 修改病房值班记录表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:duty:edit')")
    @Log(title = "病房值班记录表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalCpoeSickroomDuty tMedicalCpoeSickroomDuty)
    {
        return toAjax(tMedicalCpoeSickroomDutyService.updateTMedicalCpoeSickroomDuty(tMedicalCpoeSickroomDuty));
    }

    /**
     * 删除病房值班记录表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:duty:remove')")
    @Log(title = "病房值班记录表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalCpoeSickroomDutyService.deleteTMedicalCpoeSickroomDutyByIds(ids));
    }
}
