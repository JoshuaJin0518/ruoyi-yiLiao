package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * pacs影像信息表对象 t_medical_pacs_info
 * 
 * @author ruoyi
 * @date 2023-08-14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalPacsInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 时间戳 */
    private String id;

    /** 消费事项 */
    @Excel(name = "消费事项")
    private String name;

    /** 患者id */
    @Excel(name = "患者id")
    private String personId;

    /** 检查科医生 */
    @Excel(name = "检查科医生")
    private String doctorid;

    /** 1已做 2未做 */
    @Excel(name = "1已做 2未做")
    private Integer status;

    /** 门诊医生接诊记录ID */
    @Excel(name = "门诊医生接诊记录ID")
    private String receiveRecordId;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPersonId(String personId) 
    {
        this.personId = personId;
    }

    public String getPersonId() 
    {
        return personId;
    }
    public void setDoctorid(String doctorid) 
    {
        this.doctorid = doctorid;
    }

    public String getDoctorid() 
    {
        return doctorid;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setReceiveRecordId(String receiveRecordId) 
    {
        this.receiveRecordId = receiveRecordId;
    }

    public String getReceiveRecordId() 
    {
        return receiveRecordId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("personId", getPersonId())
            .append("doctorid", getDoctorid())
            .append("createTime", getCreateTime())
            .append("status", getStatus())
            .append("receiveRecordId", getReceiveRecordId())
            .toString();
    }
}
