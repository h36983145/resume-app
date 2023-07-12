package com.zhiku.resumeapp.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
@Data
public class Experience implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 外键 简历id
     */
    private Integer cvId;

    /**
     * 入职时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date startDate;

    /**
     * 离职时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date endDate;

    /**
     * 公司名称
     */
    private String company;

    /**
     * 所属行业
     */
    private String industry;

    /**
     * 职位名称
     */
    private String post;

    /**
     * 薪资水平 单位分
     */
    private Integer salary;

    /**
     * 工作概述
     */
    private String summarize;

    /**
     * 离职原因
     */
    private String reason;

    private static final long serialVersionUID = 1L;
}