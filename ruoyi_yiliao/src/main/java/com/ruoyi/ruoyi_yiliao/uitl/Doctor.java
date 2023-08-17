package com.ruoyi.ruoyi_yiliao.uitl;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ruoyi_yiliao.domain.Doctors;
import com.ruoyi.ruoyi_yiliao.mapper.DoctorIdMapper;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.core.controller.BaseController;
import java.util.List;
@RequestMapping("/doctor")
@RestController
public class Doctor {
    @Autowired
    private DoctorIdMapper doctorIdMapper;


    @GetMapping
    /*查询医生*/
    public AjaxResult list() {
        List<Doctors> sel = doctorIdMapper.sel();
        for (Doctors doctors : sel) {
            System.out.println(doctors);
        }
        AjaxResult ajax=AjaxResult.success();
        ajax.put("doctor",sel);

        return ajax;
    }
}
