package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 患者费用明细表对象 t_medical_cost_bill_detail
 * 
 * @author ruoyi
 * @date 2023-08-15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalCostBillDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 接诊记录id */
    @Excel(name = "接诊记录id")
    private String receiveRecordId;

    /** 消费事项 */
    @Excel(name = "消费事项")
    private String partName;

    /** 事项数量 */
    @Excel(name = "事项数量")
    private Long partNumber;

    /** 单价 */
    @Excel(name = "单价")
    private Double partMoney;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setReceiveRecordId(String receiveRecordId) 
    {
        this.receiveRecordId = receiveRecordId;
    }

    public String getReceiveRecordId() 
    {
        return receiveRecordId;
    }
    public void setPartName(String partName) 
    {
        this.partName = partName;
    }

    public String getPartName() 
    {
        return partName;
    }
    public void setPartNumber(Long partNumber) 
    {
        this.partNumber = partNumber;
    }

    public Long getPartNumber() 
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("receiveRecordId", getReceiveRecordId())
            .append("partName", getPartName())
            .append("partNumber", getPartNumber())
            .append("partMoney", getPartMoney())
            .toString();
    }
}
