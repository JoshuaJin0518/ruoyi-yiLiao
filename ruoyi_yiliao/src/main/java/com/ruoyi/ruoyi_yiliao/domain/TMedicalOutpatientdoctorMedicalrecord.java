package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 门诊病历表对象 t_medical_outpatientdoctor_medicalrecord
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalOutpatientdoctorMedicalrecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 随机:时间戳 */
    private String id;

    /** （门诊卡id） */
    @Excel(name = "", readConverterExp = "门=诊卡id")
    private String outpatientId;

    /** 病历URL */
    @Excel(name = "病历URL")
    private String medicalRecordURL;

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
    public void setMedicalRecordURL(String medicalRecordURL) 
    {
        this.medicalRecordURL = medicalRecordURL;
    }

    public String getMedicalRecordURL() 
    {
        return medicalRecordURL;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("outpatientId", getOutpatientId())
            .append("medicalRecordURL", getMedicalRecordURL())
            .toString();
    }
}
