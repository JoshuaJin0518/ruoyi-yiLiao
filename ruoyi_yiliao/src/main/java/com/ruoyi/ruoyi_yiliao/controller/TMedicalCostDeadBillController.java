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
import com.ruoyi.ruoyi_yiliao.domain.TMedicalCostDeadBill;
import com.ruoyi.ruoyi_yiliao.service.ITMedicalCostDeadBillService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 医院烂账记录表Controller
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@RestController
@RequestMapping("/feiyongguanli/dead_bill")
public class TMedicalCostDeadBillController extends BaseController
{
    @Autowired
    private ITMedicalCostDeadBillService tMedicalCostDeadBillService;

    /**
     * 查询医院烂账记录表列表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:dead_bill:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalCostDeadBill tMedicalCostDeadBill)
    {
        startPage();
        List<TMedicalCostDeadBill> list = tMedicalCostDeadBillService.selectTMedicalCostDeadBillList(tMedicalCostDeadBill);
        return getDataTable(list);
    }

    /**
     * 导出医院烂账记录表列表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:dead_bill:export')")
    @Log(title = "医院烂账记录表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalCostDeadBill tMedicalCostDeadBill)
    {
        List<TMedicalCostDeadBill> list = tMedicalCostDeadBillService.selectTMedicalCostDeadBillList(tMedicalCostDeadBill);
        ExcelUtil<TMedicalCostDeadBill> util = new ExcelUtil<TMedicalCostDeadBill>(TMedicalCostDeadBill.class);
        util.exportExcel(response, list, "医院烂账记录表数据");
    }

    /**
     * 获取医院烂账记录表详细信息
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:dead_bill:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(tMedicalCostDeadBillService.selectTMedicalCostDeadBillById(id));
    }

    /**
     * 新增医院烂账记录表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:dead_bill:add')")
    @Log(title = "医院烂账记录表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalCostDeadBill tMedicalCostDeadBill)
    {
        return toAjax(tMedicalCostDeadBillService.insertTMedicalCostDeadBill(tMedicalCostDeadBill));
    }

    /**
     * 修改医院烂账记录表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:dead_bill:edit')")
    @Log(title = "医院烂账记录表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalCostDeadBill tMedicalCostDeadBill)
    {
        return toAjax(tMedicalCostDeadBillService.updateTMedicalCostDeadBill(tMedicalCostDeadBill));
    }

    /**
     * 删除医院烂账记录表
     */
    @PreAuthorize("@ss.hasPermi('feiyongguanli:dead_bill:remove')")
    @Log(title = "医院烂账记录表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalCostDeadBillService.deleteTMedicalCostDeadBillByIds(ids));
    }
}
