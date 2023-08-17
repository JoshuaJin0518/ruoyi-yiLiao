package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 患者信息对象 t_medical_cost_person_archives
 * 
 * @author ruoyi
 * @date 2023-08-12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TMedicalCostPersonArchives
{
    private static final long serialVersionUID = 1L;

    /** 随机生成:建卡人id+时间戳 */
    private String id;

    /** 患者姓名 */
    @Excel(name = "患者姓名")
    private String name;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long age;

    /** 人身份证 */
    @Excel(name = "人身份证")
    private String code;

    /** 性别 */
    @Excel(name = "性别")
    private Integer sex;

    /** 创建档案人(id) */
    @Excel(name = "创建档案人(id)")
    private String operator;
    /** 创建时间 */
    @Excel(name = "创建档案人(id)")
    private String createTime;
}
