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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalDrugsPurchase;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalDrugsPurchaseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 药品采购信息表Controller
 * 
 * @author ruoyi
 * @date 2023-08-17
 */
@RestController
@RequestMapping("/yaofangyaoku/caigouxinxi")
public class TMedicalDrugsPurchaseController extends BaseController
{
    @Autowired
    private ITMedicalDrugsPurchaseService tMedicalDrugsPurchaseService;

    /**
     * 查询药品采购信息表列表
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:caigouxinxi:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalDrugsPurchase tMedicalDrugsPurchase)
    {
        startPage();
        List<TMedicalDrugsPurchase> list = tMedicalDrugsPurchaseService.selectTMedicalDrugsPurchaseList(tMedicalDrugsPurchase);
        return getDataTable(list);
    }

    /**
     * 导出药品采购信息表列表
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:caigouxinxi:export')")
    @Log(title = "药品采购信息表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalDrugsPurchase tMedicalDrugsPurchase)
    {
        List<TMedicalDrugsPurchase> list = tMedicalDrugsPurchaseService.selectTMedicalDrugsPurchaseList(tMedicalDrugsPurchase);
        ExcelUtil<TMedicalDrugsPurchase> util = new ExcelUtil<TMedicalDrugsPurchase>(TMedicalDrugsPurchase.class);
        util.exportExcel(response, list, "药品采购信息表数据");
    }

    /**
     * 获取药品采购信息表详细信息
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:caigouxinxi:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalDrugsPurchaseService.selectTMedicalDrugsPurchaseById(id));
    }

    /**
     * 新增药品采购信息表
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:caigouxinxi:add')")
    @Log(title = "药品采购信息表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalDrugsPurchase tMedicalDrugsPurchase)
    {
        return toAjax(tMedicalDrugsPurchaseService.insertTMedicalDrugsPurchase(tMedicalDrugsPurchase));
    }

    /**
     * 修改药品采购信息表
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:caigouxinxi:edit')")
    @Log(title = "药品采购信息表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalDrugsPurchase tMedicalDrugsPurchase)
    {
        return toAjax(tMedicalDrugsPurchaseService.updateTMedicalDrugsPurchase(tMedicalDrugsPurchase));
    }

    /**
     * 删除药品采购信息表
     */
    @PreAuthorize("@ss.hasPermi('yaofangyaoku:caigouxinxi:remove')")
    @Log(title = "药品采购信息表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalDrugsPurchaseService.deleteTMedicalDrugsPurchaseByIds(ids));
    }
}
