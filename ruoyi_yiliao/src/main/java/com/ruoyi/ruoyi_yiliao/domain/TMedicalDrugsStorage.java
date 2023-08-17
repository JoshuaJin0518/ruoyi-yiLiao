package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 药库库存表对象 t_medical_drugs_storage
 * 
 * @author ruoyi
 * @date 2023-08-17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalDrugsStorage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 随机 */
    private String id;

    /** 药品名称ID */
    @Excel(name = "药品名称ID")
    private String drugsId;

    /** 数量 */
    @Excel(name = "数量")
    private Long no;

    /** 操作人id */
    @Excel(name = "操作人id")
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
            .append("no", getNo())
            .append("updateTime", getUpdateTime())
            .append("operator", getOperator())
            .toString();
    }
}
