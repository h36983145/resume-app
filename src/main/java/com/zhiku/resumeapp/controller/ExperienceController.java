package com.zhiku.resumeapp.controller;

import com.zhiku.resumeapp.common.R;
import com.zhiku.resumeapp.entity.Experience;
import com.zhiku.resumeapp.service.CvService;
import com.zhiku.resumeapp.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experience")
public class ExperienceController extends BaseController<Experience,ExperienceService>{
    @Autowired
    private ExperienceService experienceService;
}
