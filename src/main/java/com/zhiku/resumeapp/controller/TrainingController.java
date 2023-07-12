package com.zhiku.resumeapp.controller;

import com.zhiku.resumeapp.common.R;
import com.zhiku.resumeapp.entity.Experience;
import com.zhiku.resumeapp.entity.Training;
import com.zhiku.resumeapp.service.ExperienceService;
import com.zhiku.resumeapp.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/training")
public class TrainingController extends BaseController<Training,TrainingService>{
    @Autowired
    private TrainingService trainingService;
}
