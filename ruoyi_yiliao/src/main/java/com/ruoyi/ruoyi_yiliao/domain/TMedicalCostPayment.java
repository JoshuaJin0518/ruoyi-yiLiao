package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 缴费对象 t_medical_cost_payment
 * 
 * @author ruoyi
 * @date 2023-08-17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalCostPayment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 缴费事项 */
    @Excel(name = "缴费事项")
    private String partName;

    /** 事项数量 */
    @Excel(name = "事项数量")
    private Long partNumber;

    /** 门诊卡 */
    @Excel(name = "门诊卡")
    private String outpatientId;

    /** 金额 */
    @Excel(name = "金额")
    private Double money;

    /** 缴费状态 */
    @Excel(name = "缴费状态")
    private Integer status;

    /** 主治医生 */
    @Excel(name = "主治医生")
    private String doctorid;

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
    public void setPartNumber(Long partNumber) 
    {
        this.partNumber = partNumber;
    }

    public Long getPartNumber() 
    {
        return partNumber;
    }
    public void setOutpatientId(String outpatientId) 
    {
        this.outpatientId = outpatientId;
    }

    public String getOutpatientId() 
    {
        return outpatientId;
    }
    public void setMoney(Double money) 
    {
        this.money = money;
    }

    public Double getMoney() 
    {
        return money;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setDoctorid(String doctorid) 
    {
        this.doctorid = doctorid;
    }

    public String getDoctorid() 
    {
        return doctorid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("partName", getPartName())
            .append("partNumber", getPartNumber())
            .append("outpatientId", getOutpatientId())
            .append("money", getMoney())
            .append("status", getStatus())
            .append("doctorid", getDoctorid())
            .append("createTime", getCreateTime())
            .toString();
    }
}
