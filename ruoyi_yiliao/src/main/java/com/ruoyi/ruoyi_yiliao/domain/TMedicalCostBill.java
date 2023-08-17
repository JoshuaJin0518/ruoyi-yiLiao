package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 患者费用账单表对象 t_medical_cost_bill
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalCostBill extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 门诊卡id */
    @Excel(name = "门诊卡id")
    private String outpatientId;

    /** 金额 */
    @Excel(name = "金额")
    private Double money;

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
    public void setMoney(Double money) 
    {
        this.money = money;
    }

    public Double getMoney() 
    {
        return money;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("outpatientId", getOutpatientId())
            .append("money", getMoney())
            .append("createTime", getCreateTime())
            .toString();
    }
}
