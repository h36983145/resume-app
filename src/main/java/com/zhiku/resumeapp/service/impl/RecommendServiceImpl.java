package com.zhiku.resumeapp.service.impl;

import com.zhiku.resumeapp.dao.RecommendDao;
import com.zhiku.resumeapp.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecommendServiceImpl implements RecommendService {
    @Autowired
    private RecommendDao recommendDao;
}
