package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 盘点记录对象 t_medical_drugs_inventory_record
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalDrugsInventoryRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 药品id */
    @Excel(name = "药品id")
    private String drugsId;

    /** 账面数量 */
    @Excel(name = "账面数量")
    private Long paperNumber;

    /** 实存数量 */
    @Excel(name = "实存数量")
    private Long existNumber;

    /** 购进单价 */
    @Excel(name = "购进单价")
    private Double buyUnitPrice;

    /** 零售单价 */
    @Excel(name = "零售单价")
    private Double sellUnitPrice;

    /** 盘盈数量 */
    @Excel(name = "盘盈数量")
    private Long inventorySurplusNo;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setDrugsId(String drugsId) 
    {
        this.drugsId = drugsId;
    }

    public String getDrugsId() 
    {
        return drugsId;
    }
    public void setPaperNumber(Long paperNumber) 
    {
        this.paperNumber = paperNumber;
    }

    public Long getPaperNumber() 
    {
        return paperNumber;
    }
    public void setExistNumber(Long existNumber) 
    {
        this.existNumber = existNumber;
    }

    public Long getExistNumber() 
    {
        return existNumber;
    }
    public void setBuyUnitPrice(Double buyUnitPrice) 
    {
        this.buyUnitPrice = buyUnitPrice;
    }

    public Double getBuyUnitPrice() 
    {
        return buyUnitPrice;
    }
    public void setSellUnitPrice(Double sellUnitPrice) 
    {
        this.sellUnitPrice = sellUnitPrice;
    }

    public Double getSellUnitPrice() 
    {
        return sellUnitPrice;
    }
    public void setInventorySurplusNo(Long inventorySurplusNo) 
    {
        this.inventorySurplusNo = inventorySurplusNo;
    }

    public Long getInventorySurplusNo() 
    {
        return inventorySurplusNo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("drugsId", getDrugsId())
            .append("paperNumber", getPaperNumber())
            .append("existNumber", getExistNumber())
            .append("buyUnitPrice", getBuyUnitPrice())
            .append("sellUnitPrice", getSellUnitPrice())
            .append("inventorySurplusNo", getInventorySurplusNo())
            .append("createTime", getCreateTime())
            .append("remark", getRemark())
            .toString();
    }
}
