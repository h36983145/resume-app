package com.zhiku.resumeapp.dao;

import com.zhiku.resumeapp.entity.Experience;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseDao<T> {
    List<T> selectByCvId(@Param("cvId") int cvId);
    void update(T entity);

    void insert(T entity);

    void deleteById(int id);
}
