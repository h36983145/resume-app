package com.zhiku.resumeapp.dao;

import com.zhiku.resumeapp.entity.Experience;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ExperienceDAO继承基类
 */
@Mapper
public interface ExperienceDao extends BaseDao<Experience>{
    List<Integer> selectCvIdLikeCompany(String keywords);

}