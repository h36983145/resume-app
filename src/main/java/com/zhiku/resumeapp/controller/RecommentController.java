package com.zhiku.resumeapp.controller;

import com.zhiku.resumeapp.service.EducationService;
import com.zhiku.resumeapp.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recommend")
public class RecommentController {
    @Autowired
    private RecommendService recommendService;
}
