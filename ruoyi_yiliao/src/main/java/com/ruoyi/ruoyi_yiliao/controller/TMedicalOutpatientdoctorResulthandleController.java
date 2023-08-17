package com.ruoyi.ruoyi_yiliao.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.ruoyi_yiliao.domain.DrugEntity;
import com.ruoyi.ruoyi_yiliao.uitl.Drug;
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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalOutpatientdoctorResulthandle;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalOutpatientdoctorResulthandleService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 医生看病治疗方案Controller
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@RestController
@RequestMapping("/menzhenyisheng/resulthandle")
public class TMedicalOutpatientdoctorResulthandleController extends BaseController
{
    @Autowired
    private ITMedicalOutpatientdoctorResulthandleService tMedicalOutpatientdoctorResulthandleService;

    @Autowired
    private Drug drug;
    /**
     * 查询医生看病治疗方案列表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:resulthandle:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalOutpatientdoctorResulthandle tMedicalOutpatientdoctorResulthandle)
    {
        startPage();
        List<TMedicalOutpatientdoctorResulthandle> list = tMedicalOutpatientdoctorResulthandleService.selectTMedicalOutpatientdoctorResulthandleList(tMedicalOutpatientdoctorResulthandle);
        return getDataTable(list);
    }

    /**
     * 导出医生看病治疗方案列表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:resulthandle:export')")
    @Log(title = "医生看病治疗方案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalOutpatientdoctorResulthandle tMedicalOutpatientdoctorResulthandle)
    {
        List<TMedicalOutpatientdoctorResulthandle> list = tMedicalOutpatientdoctorResulthandleService.selectTMedicalOutpatientdoctorResulthandleList(tMedicalOutpatientdoctorResulthandle);
        ExcelUtil<TMedicalOutpatientdoctorResulthandle> util = new ExcelUtil<TMedicalOutpatientdoctorResulthandle>(TMedicalOutpatientdoctorResulthandle.class);
        util.exportExcel(response, list, "医生看病治疗方案数据");
    }

    /**
     * 获取医生看病治疗方案详细信息
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:resulthandle:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalOutpatientdoctorResulthandleService.selectTMedicalOutpatientdoctorResulthandleById(id));
    }

    /**
     * 新增医生看病治疗方案
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:resulthandle:add')")
    @Log(title = "医生看病治疗方案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalOutpatientdoctorResulthandle tMedicalOutpatientdoctorResulthandle)
    {
        return toAjax(tMedicalOutpatientdoctorResulthandleService.insertTMedicalOutpatientdoctorResulthandle(tMedicalOutpatientdoctorResulthandle));
    }

    /**
     * 修改医生看病治疗方案
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:resulthandle:edit')")
    @Log(title = "医生看病治疗方案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalOutpatientdoctorResulthandle tMedicalOutpatientdoctorResulthandle)
    {
        return toAjax(tMedicalOutpatientdoctorResulthandleService.updateTMedicalOutpatientdoctorResulthandle(tMedicalOutpatientdoctorResulthandle));
    }

    /**
     * 删除医生看病治疗方案
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:resulthandle:remove')")
    @Log(title = "医生看病治疗方案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalOutpatientdoctorResulthandleService.deleteTMedicalOutpatientdoctorResulthandleByIds(ids));
    }
    /**
     * 获得所有药品
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:resulthandle:remove')")
    @Log(title = "获得说有药品")
	@GetMapping("/partNames")
    public AjaxResult partNames()
    {
        AjaxResult ajaxResult = new AjaxResult();
        List<DrugEntity> drugs = drug.getDrug();
        ajaxResult.put("data",drugs);
        return ajaxResult;
    }
    /**
     * 根据药品id查询
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:resulthandle:remove')")
    @Log(title = "根据药品id查询")
	@GetMapping("/partNames/{id}")
    public AjaxResult getDrugById(@PathVariable String id)
    {
        AjaxResult ajaxResult = new AjaxResult();
        List<DrugEntity> drugs = drug.getDrugById(id);
        ajaxResult.put("data",drugs);
        return ajaxResult;
    }

}
