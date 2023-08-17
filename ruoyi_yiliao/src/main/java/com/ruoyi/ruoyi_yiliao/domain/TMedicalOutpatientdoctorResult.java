package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 医生看病结果对象 t_medical_outpatientdoctor_result
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalOutpatientdoctorResult extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 病名称 */
    @Excel(name = "病名称")
    private String name;

    /** 症状描述 */
    @Excel(name = "症状描述")
    private String description;

    /** 门诊医生接诊记录id */
    @Excel(name = "门诊医生接诊记录id")
    private String opDoctorReceiveRecordId;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setOpDoctorReceiveRecordId(String opDoctorReceiveRecordId) 
    {
        this.opDoctorReceiveRecordId = opDoctorReceiveRecordId;
    }

    public String getOpDoctorReceiveRecordId() 
    {
        return opDoctorReceiveRecordId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("description", getDescription())
            .append("remark", getRemark())
            .append("opDoctorReceiveRecordId", getOpDoctorReceiveRecordId())
            .toString();
    }
}
