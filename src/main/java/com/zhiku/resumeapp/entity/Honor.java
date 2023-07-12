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
public class Honor implements Serializable {
    /**
     * 主键 荣誉证书
     */
    private Integer id;

    /**
     * 外键 简历ID
     */
    private Integer cvId;

    /**
     * 荣誉名称
     */
    private String name;

    /**
     * 获奖时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date awardTime;

    /**
     * 证书图片地址
     */
    private String certificateUrl;

    private static final long serialVersionUID = 1L;
}