package com.example.labmanagesystem.pojo.domain;

import com.example.labmanagesystem.pojo.BaseEntity;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Data
public class Equipment extends BaseEntity {

    /** 设备名称 */
    private String name;

    /** 设备编号 */
    private String code;

    /** 设备位置 */
    private String position;

    /** 设备状态 */
    private Integer status;

    /** 设备管理员 */
    private String manager;

    public String toString() {
        return new ToStringBuilder(ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("name", getName())
                .append("code", getCode())
                .append("position", getPosition())
                .append("status", getStatus())
                .append("manager", getManager())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
