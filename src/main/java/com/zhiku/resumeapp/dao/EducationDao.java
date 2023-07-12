package com.zhiku.resumeapp.dao;

import com.zhiku.resumeapp.entity.Education;
import com.zhiku.resumeapp.entity.Experience;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * EducationDAO
 */
@Mapper
public interface EducationDao extends BaseDao<Education>{

}