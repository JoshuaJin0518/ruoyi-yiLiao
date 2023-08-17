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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalOutpatientdoctorAction;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalOutpatientdoctorActionService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 医生看病流程表Controller
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@RestController
@RequestMapping("/menzhenyisheng/action")
public class TMedicalOutpatientdoctorActionController extends BaseController
{
    @Autowired
    private ITMedicalOutpatientdoctorActionService tMedicalOutpatientdoctorActionService;

    /**
     * 查询医生看病流程表列表
     */
    @PreAuthorize("@ss.hasPermi('menzhenyisheng:action:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction)
    {
        startPage();
        List<TMedicalOutpatientdoctorAction> list = tMedicalOutpatientdoctorActionService.selectTMedicalOutpatientdoctorActionList(tMedicalOutpatientdoctorAction);
        return getDataTable(list);
    }

    /**
     * 导出医生看病流程表列表
     */
    @PreAuthorize("@ss.hasPermi('menzhenyisheng:action:export')")
    @Log(title = "医生看病流程表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction)
    {
        List<TMedicalOutpatientdoctorAction> list = tMedicalOutpatientdoctorActionService.selectTMedicalOutpatientdoctorActionList(tMedicalOutpatientdoctorAction);
        ExcelUtil<TMedicalOutpatientdoctorAction> util = new ExcelUtil<TMedicalOutpatientdoctorAction>(TMedicalOutpatientdoctorAction.class);
        util.exportExcel(response, list, "医生看病流程表数据");
    }

    /**
     * 获取医生看病流程表详细信息
     */
    @PreAuthorize("@ss.hasPermi('menzhenyisheng:action:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalOutpatientdoctorActionService.selectTMedicalOutpatientdoctorActionById(id));
    }

    /**
     * 新增医生看病流程表
     */
    @PreAuthorize("@ss.hasPermi('menzhenyisheng:action:add')")
    @Log(title = "医生看病流程表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction)
    {
        return toAjax(tMedicalOutpatientdoctorActionService.insertTMedicalOutpatientdoctorAction(tMedicalOutpatientdoctorAction));
    }

    /**
     * 修改医生看病流程表
     */
    @PreAuthorize("@ss.hasPermi('menzhenyisheng:action:edit')")
    @Log(title = "医生看病流程表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction)
    {
        return toAjax(tMedicalOutpatientdoctorActionService.updateTMedicalOutpatientdoctorAction(tMedicalOutpatientdoctorAction));
    }

    /**
     * 删除医生看病流程表
     */
    @PreAuthorize("@ss.hasPermi('menzhenyisheng:action:remove')")
    @Log(title = "医生看病流程表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalOutpatientdoctorActionService.deleteTMedicalOutpatientdoctorActionByIds(ids));
    }
}
