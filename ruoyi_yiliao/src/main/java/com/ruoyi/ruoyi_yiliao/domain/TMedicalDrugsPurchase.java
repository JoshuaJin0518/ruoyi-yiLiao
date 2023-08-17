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
 * 药品采购信息表对象 t_medical_drugs_purchase
 * 
 * @author ruoyi
 * @date 2023-08-17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalDrugsPurchase extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 随机 */
    private String id;

    /** 药品名称ID */
    @Excel(name = "药品名称ID")
    private String drugsId;

    /** 药品来源 */
    @Excel(name = "药品来源")
    private String source;

    /** 产地 */
    @Excel(name = "产地")
    private String address;

    /** 批号 */
    @Excel(name = "批号")
    private String batchNumbe;

    /** 生产日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生产日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date manufactureTime;

    /** 有效日期 */
    @Excel(name = "有效日期")
    private String termOfValidity;

    /** 摘要 */
    @Excel(name = "摘要")
    private String digest;

    /** 填制人 */
    @Excel(name = "填制人")
    private String FilledBy;

    /** 核查人 */
    @Excel(name = "核查人")
    private String Verifier;

    /** 核查日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "核查日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date VerificationTime;

    /** 审核人 */
    @Excel(name = "审核人")
    private String Reviewer;

    /** 审核日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date AuditTime;

    /** 数量 */
    @Excel(name = "数量")
    private Long no;

    /** 操作人 */
    @Excel(name = "操作人")
    private String operator;

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
    public void setSource(String source) 
    {
        this.source = source;
    }

    public String getSource() 
    {
        return source;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setBatchNumbe(String batchNumbe) 
    {
        this.batchNumbe = batchNumbe;
    }

    public String getBatchNumbe() 
    {
        return batchNumbe;
    }
    public void setManufactureTime(Date manufactureTime) 
    {
        this.manufactureTime = manufactureTime;
    }

    public Date getManufactureTime() 
    {
        return manufactureTime;
    }
    public void setTermOfValidity(String termOfValidity) 
    {
        this.termOfValidity = termOfValidity;
    }

    public String getTermOfValidity() 
    {
        return termOfValidity;
    }
    public void setDigest(String digest) 
    {
        this.digest = digest;
    }

    public String getDigest() 
    {
        return digest;
    }
    public void setFilledBy(String FilledBy) 
    {
        this.FilledBy = FilledBy;
    }

    public String getFilledBy() 
    {
        return FilledBy;
    }
    public void setVerifier(String Verifier) 
    {
        this.Verifier = Verifier;
    }

    public String getVerifier() 
    {
        return Verifier;
    }
    public void setVerificationTime(Date VerificationTime) 
    {
        this.VerificationTime = VerificationTime;
    }

    public Date getVerificationTime() 
    {
        return VerificationTime;
    }
    public void setReviewer(String Reviewer) 
    {
        this.Reviewer = Reviewer;
    }

    public String getReviewer() 
    {
        return Reviewer;
    }
    public void setAuditTime(Date AuditTime) 
    {
        this.AuditTime = AuditTime;
    }

    public Date getAuditTime() 
    {
        return AuditTime;
    }
    public void setNo(Long no) 
    {
        this.no = no;
    }

    public Long getNo() 
    {
        return no;
    }
    public void setOperator(String operator) 
    {
        this.operator = operator;
    }

    public String getOperator() 
    {
        return operator;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("drugsId", getDrugsId())
            .append("source", getSource())
            .append("address", getAddress())
            .append("batchNumbe", getBatchNumbe())
            .append("manufactureTime", getManufactureTime())
            .append("termOfValidity", getTermOfValidity())
            .append("digest", getDigest())
            .append("FilledBy", getFilledBy())
            .append("Verifier", getVerifier())
            .append("VerificationTime", getVerificationTime())
            .append("Reviewer", getReviewer())
            .append("AuditTime", getAuditTime())
            .append("no", getNo())
            .append("operator", getOperator())
            .toString();
    }
}
