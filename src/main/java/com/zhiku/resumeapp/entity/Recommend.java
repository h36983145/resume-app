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
public class Recommend implements Serializable {
    /**
     * 主键 自荐信
     */
    private Integer id;

    /**
     * 外键 用户ID
     */
    private Integer memberId;

    /**
     * 自荐信名称
     */
    private String name;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createdTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;

    /**
     * 状态0私密 1展示
     */
    @JsonFormat(shape= JsonFormat.Shape.STRING)
    private Integer status;

    /**
     * 自荐信内容
     */
    private String content;

    private static final long serialVersionUID = 1L;
}