package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 医生看病治疗方案对象 t_medical_outpatientdoctor_resulthandle
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalOutpatientdoctorResulthandle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 消费事项 */
    @Excel(name = "消费事项")
    private String partName;

    /** 事项数量 */
    @Excel(name = "事项数量")
    private String partNumber;

    /** 单价 */
    @Excel(name = "单价")
    private Double partMoney;

    /** 医生治疗结果id */
    @Excel(name = "医生治疗结果id")
    private String opDoctorResultId;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setPartName(String partName) 
    {
        this.partName = partName;
    }

    public String getPartName() 
    {
        return partName;
    }
    public void setPartNumber(String partNumber) 
    {
        this.partNumber = partNumber;
    }

    public String getPartNumber() 
    {
        return partNumber;
    }
    public void setPartMoney(Double partMoney) 
    {
        this.partMoney = partMoney;
    }

    public Double getPartMoney() 
    {
        return partMoney;
    }
    public void setOpDoctorResultId(String opDoctorResultId) 
    {
        this.opDoctorResultId = opDoctorResultId;
    }

    public String getOpDoctorResultId() 
    {
        return opDoctorResultId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("partName", getPartName())
            .append("partNumber", getPartNumber())
            .append("partMoney", getPartMoney())
            .append("opDoctorResultId", getOpDoctorResultId())
            .toString();
    }
}
