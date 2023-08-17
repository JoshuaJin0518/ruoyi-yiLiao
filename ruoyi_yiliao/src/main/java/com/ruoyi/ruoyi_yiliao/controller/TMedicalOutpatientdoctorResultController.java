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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalOutpatientdoctorResult;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalOutpatientdoctorResultService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 医生看病结果Controller
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@RestController
@RequestMapping("/menzhenyisheng/result")
public class TMedicalOutpatientdoctorResultController extends BaseController
{
    @Autowired
    private ITMedicalOutpatientdoctorResultService tMedicalOutpatientdoctorResultService;

    /**
     * 查询医生看病结果列表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:result:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult)
    {
        startPage();
        List<TMedicalOutpatientdoctorResult> list = tMedicalOutpatientdoctorResultService.selectTMedicalOutpatientdoctorResultList(tMedicalOutpatientdoctorResult);
        return getDataTable(list);
    }

    /**
     * 导出医生看病结果列表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:result:export')")
    @Log(title = "医生看病结果", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult)
    {
        List<TMedicalOutpatientdoctorResult> list = tMedicalOutpatientdoctorResultService.selectTMedicalOutpatientdoctorResultList(tMedicalOutpatientdoctorResult);
        ExcelUtil<TMedicalOutpatientdoctorResult> util = new ExcelUtil<TMedicalOutpatientdoctorResult>(TMedicalOutpatientdoctorResult.class);
        util.exportExcel(response, list, "医生看病结果数据");
    }

    /**
     * 获取医生看病结果详细信息
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:result:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalOutpatientdoctorResultService.selectTMedicalOutpatientdoctorResultById(id));
    }

    /**
     * 新增医生看病结果
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:result:add')")
    @Log(title = "医生看病结果", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult)
    {
        return toAjax(tMedicalOutpatientdoctorResultService.insertTMedicalOutpatientdoctorResult(tMedicalOutpatientdoctorResult));
    }

    /**
     * 修改医生看病结果
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:result:edit')")
    @Log(title = "医生看病结果", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult)
    {
        return toAjax(tMedicalOutpatientdoctorResultService.updateTMedicalOutpatientdoctorResult(tMedicalOutpatientdoctorResult));
    }

    /**
     * 删除医生看病结果
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:result:remove')")
    @Log(title = "医生看病结果", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalOutpatientdoctorResultService.deleteTMedicalOutpatientdoctorResultByIds(ids));
    }
}
