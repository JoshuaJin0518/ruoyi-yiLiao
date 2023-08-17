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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostPayment;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCostPaymentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 缴费Controller
 * 
 * @author ruoyi
 * @date 2023-08-17
 */
@RestController
@RequestMapping("/jiaofei/payment")
public class TMedicalCostPaymentController extends BaseController
{
    @Autowired
    private ITMedicalCostPaymentService tMedicalCostPaymentService;

    /**
     * 查询缴费列表
     */
    @PreAuthorize("@ss.hasPermi('jiaofei:payment:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalCostPayment tMedicalCostPayment)
    {
        startPage();
        List<TMedicalCostPayment> list = tMedicalCostPaymentService.selectTMedicalCostPaymentList(tMedicalCostPayment);
        return getDataTable(list);
    }

    /**
     * 导出缴费列表
     */
    @PreAuthorize("@ss.hasPermi('jiaofei:payment:export')")
    @Log(title = "缴费", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalCostPayment tMedicalCostPayment)
    {
        List<TMedicalCostPayment> list = tMedicalCostPaymentService.selectTMedicalCostPaymentList(tMedicalCostPayment);
        ExcelUtil<TMedicalCostPayment> util = new ExcelUtil<TMedicalCostPayment>(TMedicalCostPayment.class);
        util.exportExcel(response, list, "缴费数据");
    }

    /**
     * 获取缴费详细信息
     */
    @PreAuthorize("@ss.hasPermi('jiaofei:payment:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalCostPaymentService.selectTMedicalCostPaymentById(id));
    }

    /**
     * 新增缴费
     */
    @PreAuthorize("@ss.hasPermi('jiaofei:payment:add')")
    @Log(title = "缴费", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalCostPayment tMedicalCostPayment)
    {
        return toAjax(tMedicalCostPaymentService.insertTMedicalCostPayment(tMedicalCostPayment));
    }

    /**
     * 修改缴费
     */
    @PreAuthorize("@ss.hasPermi('jiaofei:payment:edit')")
    @Log(title = "缴费", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalCostPayment tMedicalCostPayment)
    {
        return toAjax(tMedicalCostPaymentService.updateTMedicalCostPayment(tMedicalCostPayment));
    }

    /**
     * 删除缴费
     */
    @PreAuthorize("@ss.hasPermi('jiaofei:payment:remove')")
    @Log(title = "缴费", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalCostPaymentService.deleteTMedicalCostPaymentByIds(ids));
    }
}
