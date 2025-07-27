package com.example.labmanagesystem.pojo.domain;

import com.example.labmanagesystem.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class Reagent extends BaseEntity {
    /** 试剂名称 */
    private String name;

    /** 试剂CAS编号 */
    private String casCode;

    /** 试剂分子式 */
    private String molecularFormula;

    /** 试剂分子量 */
    private Double molecularWeight;

    /** 实验室自制标记 */
    private Integer labFlag;

    /** 试剂库存量 */
    private Double weight;

    /** 试剂有效期 */
    private Date expirationDate;

    /** 试剂使用状态 */
    private Integer status;

    /** 试剂存放位置 */
    private String location;

    public String toString() {
        return new ToStringBuilder(ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("name", getName())
                .append("casCode", getCasCode())
                .append("molecularFormula", getMolecularFormula())
                .append("molecularWeight", getMolecularWeight())
                .append("weight", getWeight())
                .append("expirationDate", getExpirationDate())
                .append("status", getStatus())
                .append("location", getLocation())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
