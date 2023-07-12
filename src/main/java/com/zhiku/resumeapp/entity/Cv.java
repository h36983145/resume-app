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
public class Cv implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 外键 绑定用户ID
     */
    private Integer memberId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别 0女 1男
     */
    @JsonFormat(shape= JsonFormat.Shape.STRING)
    private Integer gender;

    /**
     * 生日
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date birthday;

    /**
     * 民族
     */
    private String nation;

    /**
     * 现居地址
     */
    private String address;

    /**
     * 联系邮箱
     */
    private String email;

    /**
     * 联系电话
     */
    private String mobile;

    /**
     * 政治面貌 01 中共党员 13 群众
     */
    @JsonFormat(shape= JsonFormat.Shape.STRING)
    private Integer politicsStatus;

    /**
     * 婚姻状况 0未婚 1已婚 2离异 3丧偶
     */
    @JsonFormat(shape= JsonFormat.Shape.STRING)
    private Integer maritalStatus;

    /**
     * 毕业院校
     */
    private String academy;

    /**
     * 所学专业
     */
    private String major;

    /**
     * 最高学历
     */
    private String degree;

    /**
     * 期望薪资 单位 分
     */
    private Integer desiredSalary;

    /**
     * 期望工作地
     */
    private String desiredPlace;

    /**
     * 求职方向
     */
    private String desiredDirection;

    /**
     * 0全职 1兼职 2均可
     */
    @JsonFormat(shape= JsonFormat.Shape.STRING)
    private Integer desiredStatus;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createdTime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;

    /**
     * 简历状态 0私密 1公开 最多只有一份简历公开
     */
    @JsonFormat(shape= JsonFormat.Shape.STRING)
    private Integer status;

    private static final long serialVersionUID = 1L;
}