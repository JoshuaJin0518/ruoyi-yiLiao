package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 医嘱记录表对象 t_medical_emr_doctorsorder
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalEmrDoctorsorder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 随机 */
    private String id;

    /** 患者id */
    @Excel(name = "患者id")
    private String personId;

    /** 主治医生id */
    @Excel(name = "主治医生id")
    private String doctorId;

    /** 1长期2临时3出院 */
    @Excel(name = "1长期2临时3出院")
    private Integer status;

    /** 0未执行1执行2停止3暂停 */
    @Excel(name = "0未执行1执行2停止3暂停")
    private Integer type;

    /** 医嘱描述 */
    @Excel(name = "医嘱描述")
    private String description;

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
    public void setDoctorId(String doctorId) 
    {
        this.doctorId = doctorId;
    }

    public String getDoctorId() 
    {
        return doctorId;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("personId", getPersonId())
            .append("DoctorIdMapper", getDoctorId())
            .append("status", getStatus())
            .append("type", getType())
            .append("description", getDescription())
            .append("createTime", getCreateTime())
            .toString();
    }
}
