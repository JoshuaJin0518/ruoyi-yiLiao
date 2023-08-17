package com.ruoyi.ruoyi_yiliao.mapper;

import com.ruoyi.ruoyi_yiliao.domain.Doctors;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface DoctorIdMapper {

    public List<Doctors> sel();
}
