package com.ruoyi.ruoyi_yiliao.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecordId    extends BaseEntity {
    private String id;
    private Date createTime;
    private String name;
    private String doctorid;
}
