package com.ruoyi.ruoyi_yiliao.mapper;

import com.ruoyi.ruoyi_yiliao.domain.DrugEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface DrugMapper {
    @Select("SELECT i.`id` ,i.`name` ,p.no,r.`buyUnitPrice` FROM `t_medical_drugs_info` i  INNER JOIN t_medical_drugs_inventory_record r \n" +
            "ON r.`drugsId` = i.`id`  INNER JOIN `t_medical_drugs_storage` p ON p.`drugsId` =i.`id`\n" +
            "WHERE  p.no >10")
    List<DrugEntity> getDrug();

    @Select("SELECT i.`id` ,i.`name` ,p.no,r.`buyUnitPrice` FROM `t_medical_drugs_info` i  INNER JOIN t_medical_drugs_inventory_record r \n" +
            "ON r.`drugsId` = i.`id`  INNER JOIN `t_medical_drugs_storage` p ON p.`drugsId` =i.`id`\n" +
            "WHERE  p.no >10 AND i.id = #{id}")
    List<DrugEntity> getDrugById(String id);
}
