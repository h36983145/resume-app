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
public class Member implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户名
     */
    private String usname;

    /**
     * 用户密码
     */
    private String psword;

    /**
     * 昵称
     */
    private String petName;

    /**
     * 头像地址
     */
    private String avatarUrl;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 邮箱验证0未验 1已验
     */
    private Integer emailVerify;

    /**
     * 手机验证0未验 1已验
     */
    private Integer mobileVerify;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    private Integer cvId;

    private static final long serialVersionUID = 1L;

}