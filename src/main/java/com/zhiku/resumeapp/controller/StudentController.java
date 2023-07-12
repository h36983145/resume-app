package com.zhiku.resumeapp.controller;

import com.zhiku.resumeapp.common.R;
import com.zhiku.resumeapp.entity.Student;
import com.zhiku.resumeapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/all")
    public R<Student> findAll(){
        List<Student> all = studentService.findAll();
        return R.success().setData(all);
    }

    @RequestMapping("/one/{id}")
    public R<Student> findOne(@PathVariable("id") Integer id){
        Student one = studentService.findOne(id);
        return R.success().setData(one);
    }
}
