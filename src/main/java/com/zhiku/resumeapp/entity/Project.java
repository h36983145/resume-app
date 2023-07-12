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
public class Project implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 外键 简历id
     */
    private Integer cvId;

    /**
     * 参与时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date startDate;

    /**
     * 结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date endDate;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目描述
     */
    private String describe;

    private static final long serialVersionUID = 1L;
}