package com.ruoyi.ruoyi_yiliao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 医嘱执行记录表对象 t_medical_cpoe_doctorsorderhandle
 * 
 * @author ruoyi
 * @date 2023-08-13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMedicalCpoeDoctorsorderhandle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 随机 */
    private String id;

    /** 操作人 */
    @Excel(name = "操作人")
    private String userId;

    /** 医嘱记录Id */
    @Excel(name = "医嘱记录Id")
    private String doctorsOrderId;

    /** 1正常2异常 */
    @Excel(name = "1正常2异常")
    private Integer result;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setDoctorsOrderId(String doctorsOrderId) 
    {
        this.doctorsOrderId = doctorsOrderId;
    }

    public String getDoctorsOrderId() 
    {
        return doctorsOrderId;
    }
    public void setResult(Integer result) 
    {
        this.result = result;
    }

    public Integer getResult() 
    {
        return result;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("doctorsOrderId", getDoctorsOrderId())
            .append("createTime", getCreateTime())
            .append("result", getResult())
            .append("remark", getRemark())
            .toString();
    }
}
