package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 住院治疗处方表对象 t_medical_cpoe_prescription
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalCpoePrescription extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 随机 */
    private String id;

    /** 当天处方汇总Id */
    @Excel(name = "当天处方汇总Id")
    private String prescriptionTotalId;

    /** 医嘱记录Id */
    @Excel(name = "医嘱记录Id")
    private String doctorsOrderId;

    /** 药品表ID */
    @Excel(name = "药品表ID")
    private String partId;

    /** 用量 */
    @Excel(name = "用量")
    private Long partNo;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setPrescriptionTotalId(String prescriptionTotalId) 
    {
        this.prescriptionTotalId = prescriptionTotalId;
    }

    public String getPrescriptionTotalId() 
    {
        return prescriptionTotalId;
    }
    public void setDoctorsOrderId(String doctorsOrderId) 
    {
        this.doctorsOrderId = doctorsOrderId;
    }

    public String getDoctorsOrderId() 
    {
        return doctorsOrderId;
    }
    public void setPartId(String partId) 
    {
        this.partId = partId;
    }

    public String getPartId() 
    {
        return partId;
    }
    public void setPartNo(Long partNo) 
    {
        this.partNo = partNo;
    }

    public Long getPartNo() 
    {
        return partNo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("prescriptionTotalId", getPrescriptionTotalId())
            .append("doctorsOrderId", getDoctorsOrderId())
            .append("partId", getPartId())
            .append("partNo", getPartNo())
            .append("createTime", getCreateTime())
            .append("remark", getRemark())
            .toString();
    }
}
