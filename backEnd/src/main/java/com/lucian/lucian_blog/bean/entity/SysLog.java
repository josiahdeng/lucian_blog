package com.lucian.lucian_blog.bean.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@TableName("sys_logs")
@Data
public class SysLog extends BaseEntity {
    private Integer userId;
    private String operation;
    private Integer time;
    private String method;
    private String requestParams;
    private Long responseStatus;
    private String ip;
    private String address;
    private String browser;
    private String os;
}