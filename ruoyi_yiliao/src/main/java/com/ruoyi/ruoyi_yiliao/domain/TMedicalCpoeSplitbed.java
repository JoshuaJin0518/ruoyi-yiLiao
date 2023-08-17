package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 分床记录表对象 t_medical_cpoe_splitbed
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalCpoeSplitbed extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 随机 */
    private String id;

    /** 患者id */
    @Excel(name = "患者id")
    private String personId;

    /** 主治医生id */
    @Excel(name = "主治医生id")
    private String doctorid;

    /** 床位Id */
    @Excel(name = "床位Id")
    private String bedId;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setPersonId(String personId) 
    {
        this.personId = personId;
    }

    public String getPersonId() 
    {
        return personId;
    }
    public void setDoctorid(String doctorid) 
    {
        this.doctorid = doctorid;
    }

    public String getDoctorid() 
    {
        return doctorid;
    }
    public void setBedId(String bedId) 
    {
        this.bedId = bedId;
    }

    public String getBedId() 
    {
        return bedId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("personId", getPersonId())
            .append("doctorid", getDoctorid())
            .append("bedId", getBedId())
            .append("createTime", getCreateTime())
            .append("remark", getRemark())
            .toString();
    }
}
