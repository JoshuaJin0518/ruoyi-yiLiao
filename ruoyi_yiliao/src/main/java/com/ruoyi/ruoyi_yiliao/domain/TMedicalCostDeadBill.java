package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 医院烂账记录表对象 t_medical_cost_dead_bill
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalCostDeadBill extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 实收金额 */
    @Excel(name = "实收金额")
    private Double realNoney;

    /** 账上金额 */
    @Excel(name = "账上金额")
    private Double accountMoney;

    /** 记账人账号 */
    @Excel(name = "记账人账号")
    private String userName;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setRealNoney(Double realNoney) 
    {
        this.realNoney = realNoney;
    }

    public Double getRealNoney() 
    {
        return realNoney;
    }
    public void setAccountMoney(Double accountMoney) 
    {
        this.accountMoney = accountMoney;
    }

    public Double getAccountMoney() 
    {
        return accountMoney;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("realNoney", getRealNoney())
            .append("accountMoney", getAccountMoney())
            .append("userName", getUserName())
            .append("createTime", getCreateTime())
            .toString();
    }
}
