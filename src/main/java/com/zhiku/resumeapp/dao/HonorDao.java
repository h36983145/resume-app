package com.zhiku.resumeapp.dao;

import com.zhiku.resumeapp.entity.Experience;
import com.zhiku.resumeapp.entity.Honor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * HonorDAO继承基类
 */
@Mapper
public interface HonorDao extends BaseDao<Honor>{
}