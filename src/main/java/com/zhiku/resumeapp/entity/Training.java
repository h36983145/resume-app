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
public class Training implements Serializable {
    /**
     * 主键 培训经历
     */
    private Integer id;

    /**
     * 外键 简历ID
     */
    private Integer cvId;

    /**
     * 开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date startDate;

    /**
     * 结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date endDate;

    /**
     * 培训名称
     */
    private String name;

    /**详情*/
    private String summarize;

    private static final long serialVersionUID = 1L;
}