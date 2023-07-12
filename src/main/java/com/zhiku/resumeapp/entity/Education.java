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
public class Education implements Serializable {
    /**
     * 主键 教育经历
     */
    private Integer id;

    /**
     * 外键 简历id
     */
    private Integer cvId;

    /**
     * 开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date startDate;

    /**
     * 毕业时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date endDate;

    /**
     * 院校名称
     */
    private String academy;

    /**
     * 所学专业
     */
    private String major;

    /**
     * 学校层次
     */
    private String degree;

    private static final long serialVersionUID = 1L;
}