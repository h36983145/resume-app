package com.zhiku.resumeapp.service;

import com.zhiku.resumeapp.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findOne(int id);
}
