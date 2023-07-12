package com.zhiku.resumeapp.dao;

import com.zhiku.resumeapp.entity.Experience;
import com.zhiku.resumeapp.entity.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ProjectDAO继承基类
 */
@Mapper
public interface ProjectDao extends BaseDao<Project>{

}