package com.zhiku.resumeapp.dao;

import com.zhiku.resumeapp.entity.Experience;
import com.zhiku.resumeapp.entity.Training;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * TrainingDAO继承基类
 */
@Mapper
public interface TrainingDao extends BaseDao<Training>{

}