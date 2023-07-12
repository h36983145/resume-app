package com.zhiku.resumeapp.service;

import com.zhiku.resumeapp.dao.BaseDao;

import java.util.List;

public interface BaseService<T> {
    BaseDao getDao();
    default List<T> findByCvId(int cvId){
        return getDao().selectByCvId(cvId);
    }
    default void update(T entity){
        getDao().update(entity);
    }

    default void insert(T entity){
        getDao().insert(entity);
    }

    default void deleteById(int id){
        getDao().deleteById(id);
    }
}
