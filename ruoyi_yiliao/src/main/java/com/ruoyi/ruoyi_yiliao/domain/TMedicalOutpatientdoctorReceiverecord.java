package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 接诊记录表对象 t_medical_outpatientdoctor_receiverecord
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalOutpatientdoctorReceiverecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** rd+医生id+时间戳 */
    private String id;

    /** 门诊卡id */
    @Excel(name = "门诊卡id")
    private String outpatientId;

    /** 医生id */
    @Excel(name = "医生id")
    private String doctorId;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setOutpatientId(String outpatientId) 
    {
        this.outpatientId = outpatientId;
    }

    public String getOutpatientId() 
    {
        return outpatientId;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("outpatientId", getOutpatientId())
            .append("DoctorIdMapper", getDoctorId())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
