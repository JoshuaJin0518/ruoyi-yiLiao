package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 病房值班记录表对象 t_medical_cpoe_sickroom_duty
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalCpoeSickroomDuty extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 随机 */
    private String id;

    /** 病房id */
    @Excel(name = "病房id")
    private String sickroomId;

    /** 值班医生 */
    @Excel(name = "值班医生")
    private String doctorId;

    /** 值班护士 */
    @Excel(name = "值班护士")
    private String murseId;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setSickroomId(String sickroomId) 
    {
        this.sickroomId = sickroomId;
    }

    public String getSickroomId() 
    {
        return sickroomId;
    }
    public void setDoctorId(String doctorId) 
    {
        this.doctorId = doctorId;
    }

    public String getDoctorId() 
    {
        return doctorId;
    }
    public void setMurseId(String murseId) 
    {
        this.murseId = murseId;
    }

    public String getMurseId() 
    {
        return murseId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sickroomId", getSickroomId())
            .append("DoctorIdMapper", getDoctorId())
            .append("murseId", getMurseId())
            .toString();
    }
}
