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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCpoeDoctorsorderhandle;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCpoeDoctorsorderhandleService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 医嘱执行记录表Controller
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@RestController
@RequestMapping("/hushizhan/doctorsorderhandle")
public class TMedicalCpoeDoctorsorderhandleController extends BaseController
{
    @Autowired
    private ITMedicalCpoeDoctorsorderhandleService tMedicalCpoeDoctorsorderhandleService;

    /**
     * 查询医嘱执行记录表列表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:doctorsorderhandle:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalCpoeDoctorsorderhandle tMedicalCpoeDoctorsorderhandle)
    {
        startPage();
        List<TMedicalCpoeDoctorsorderhandle> list = tMedicalCpoeDoctorsorderhandleService.selectTMedicalCpoeDoctorsorderhandleList(tMedicalCpoeDoctorsorderhandle);
        return getDataTable(list);
    }

    /**
     * 导出医嘱执行记录表列表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:doctorsorderhandle:export')")
    @Log(title = "医嘱执行记录表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalCpoeDoctorsorderhandle tMedicalCpoeDoctorsorderhandle)
    {
        List<TMedicalCpoeDoctorsorderhandle> list = tMedicalCpoeDoctorsorderhandleService.selectTMedicalCpoeDoctorsorderhandleList(tMedicalCpoeDoctorsorderhandle);
        ExcelUtil<TMedicalCpoeDoctorsorderhandle> util = new ExcelUtil<TMedicalCpoeDoctorsorderhandle>(TMedicalCpoeDoctorsorderhandle.class);
        util.exportExcel(response, list, "医嘱执行记录表数据");
    }

    /**
     * 获取医嘱执行记录表详细信息
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:doctorsorderhandle:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalCpoeDoctorsorderhandleService.selectTMedicalCpoeDoctorsorderhandleById(id));
    }

    /**
     * 新增医嘱执行记录表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:doctorsorderhandle:add')")
    @Log(title = "医嘱执行记录表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalCpoeDoctorsorderhandle tMedicalCpoeDoctorsorderhandle)
    {
        return toAjax(tMedicalCpoeDoctorsorderhandleService.insertTMedicalCpoeDoctorsorderhandle(tMedicalCpoeDoctorsorderhandle));
    }

    /**
     * 修改医嘱执行记录表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:doctorsorderhandle:edit')")
    @Log(title = "医嘱执行记录表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalCpoeDoctorsorderhandle tMedicalCpoeDoctorsorderhandle)
    {
        return toAjax(tMedicalCpoeDoctorsorderhandleService.updateTMedicalCpoeDoctorsorderhandle(tMedicalCpoeDoctorsorderhandle));
    }

    /**
     * 删除医嘱执行记录表
     */
    @PreAuthorize("@ss.hasPermi('hushizhan:doctorsorderhandle:remove')")
    @Log(title = "医嘱执行记录表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalCpoeDoctorsorderhandleService.deleteTMedicalCpoeDoctorsorderhandleByIds(ids));
    }
}
