package com.example.labmanagesystem.pojo.domain;

import com.example.labmanagesystem.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

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

    /** 试剂库存量 */
    private Double weight;

    /** 试剂有效期 */
    private Date expirationDate;

    /** 试剂使用状态 */
    private Integer status;

    /** 试剂存放位置 */
    private String location;
}
