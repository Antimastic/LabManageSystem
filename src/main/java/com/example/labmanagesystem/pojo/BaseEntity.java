package com.example.labmanagesystem.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class BaseEntity {
    /** 主键 */
    private Integer id;

    /** 创建时间 */
    private Date createTime;

    /** 修改时间 */
    private Date updateTime;

    /** 删除标记 */
    private Integer delFlag;

    /** 开始时间 */
    private Date fromTime;

    /** 结束时间 */
    private Date toTime;
}
