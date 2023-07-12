package com.zhiku.resumeapp.service.impl;

import com.zhiku.resumeapp.dao.StudentDao;
import com.zhiku.resumeapp.entity.Student;
import com.zhiku.resumeapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> findAll() {
        return studentDao.selectAll();
    }

    @Override
    public Student findOne(int id) {
        return studentDao.selectById(id);
    }
}
