package com.ruoyi.ruoyi_yiliao.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 门诊卡信息表对象 t_medical_cost_outpatient_info
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalCostOutpatientInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 金额 */
    @Excel(name = "金额")
    private Double money;

    /** 启用日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "启用日期", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date enableTime;

    /** 挂失日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "挂失日期", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date lossTime;

    /** 作废日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "作废日期", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date deadTime;

    /** 退卡日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "退卡日期", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date returnTime;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 押金 */
    @Excel(name = "押金")
    private Double deposit;

    /** 个人档案id */
    @Excel(name = "个人档案id")
    private String personId;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setMoney(Double money)
    {
        this.money = money;
    }

    public Double getMoney()
    {
        return money;
    }
    public void setEnableTime(Date enableTime) 
    {
        this.enableTime = enableTime;
    }

    public Date getEnableTime() 
    {
        return enableTime;
    }
    public void setLossTime(Date lossTime) 
    {
        this.lossTime = lossTime;
    }

    public Date getLossTime() 
    {
        return lossTime;
    }
    public void setDeadTime(Date deadTime) 
    {
        this.deadTime = deadTime;
    }

    public Date getDeadTime() 
    {
        return deadTime;
    }
    public void setReturnTime(Date returnTime) 
    {
        this.returnTime = returnTime;
    }

    public Date getReturnTime() 
    {
        return returnTime;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setDeposit(Double deposit) 
    {
        this.deposit = deposit;
    }

    public Double getDeposit() 
    {
        return deposit;
    }
    public void setPersonId(String personId) 
    {
        this.personId = personId;
    }

    public String getPersonId() 
    {
        return personId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("money", getMoney())
            .append("enableTime", getEnableTime())
            .append("lossTime", getLossTime())
            .append("deadTime", getDeadTime())
            .append("returnTime", getReturnTime())
            .append("status", getStatus())
            .append("deposit", getDeposit())
            .append("personId", getPersonId())
            .toString();
    }
}
