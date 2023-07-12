package com.zhiku.resumeapp.controller;

import com.zhiku.resumeapp.common.R;
import com.zhiku.resumeapp.entity.Education;
import com.zhiku.resumeapp.entity.Experience;
import com.zhiku.resumeapp.service.CvService;
import com.zhiku.resumeapp.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/education")
public class EducationController extends BaseController<Education,EducationService>{
    @Autowired
    private EducationService educationService;
}
