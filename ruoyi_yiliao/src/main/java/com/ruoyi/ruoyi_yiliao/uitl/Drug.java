package com.ruoyi.ruoyi_yiliao.uitl;

import com.ruoyi.ruoyi_yiliao.domain.DrugEntity;
import com.ruoyi.ruoyi_yiliao.mapper.DrugMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Drug {
    @Autowired
    private DrugMapper drugMapper;

    public List<DrugEntity> getDrug() {
        List<DrugEntity> list = drugMapper.getDrug();
        return list;
    }

    public List<DrugEntity> getDrugById(String id) {
        List<DrugEntity> list = null;
        if (id != null) {
            list = drugMapper.getDrugById(id);
        }
        return list;
    }
}
