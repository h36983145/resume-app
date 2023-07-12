package com.zhiku.resumeapp.dao;

import com.zhiku.resumeapp.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDao {

    List<Student> selectAll();

    Student selectById(int id);

}
