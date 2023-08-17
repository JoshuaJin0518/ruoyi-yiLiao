package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 医生看病流程表对象 t_medical_outpatientdoctor_action
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalOutpatientdoctorAction extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 医生id+时间戳 */
    private String id;

    /** 消费事项 */
    @Excel(name = "消费事项")
    private String partName;

    /** 事项数量 */
    @Excel(name = "事项数量")
    private String partNumber;

    /** 患者状态 */
    @Excel(name = "患者状态")
    private Integer personTyoe;

    /** 单价 */
    @Excel(name = "单价")
    private Double partMoney;

    /** 状态 */
    @Excel(name = "状态")
    private Integer type;

    /** 门诊医生接诊记录id/医嘱记录id */
    @Excel(name = "门诊医生接诊记录id/医嘱记录id")
    private String opDoctorReceiveRecordId;

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
    public void setPersonTyoe(Integer personTyoe) 
    {
        this.personTyoe = personTyoe;
    }

    public Integer getPersonTyoe() 
    {
        return personTyoe;
    }
    public void setPartMoney(Double partMoney) 
    {
        this.partMoney = partMoney;
    }

    public Double getPartMoney() 
    {
        return partMoney;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
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
            .append("partName", getPartName())
            .append("partNumber", getPartNumber())
            .append("personTyoe", getPersonTyoe())
            .append("partMoney", getPartMoney())
            .append("type", getType())
            .append("opDoctorReceiveRecordId", getOpDoctorReceiveRecordId())
            .toString();
    }
}
