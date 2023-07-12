package com.zhiku.resumeapp.service.impl;

import com.zhiku.resumeapp.dao.BaseDao;
import com.zhiku.resumeapp.dao.ExperienceDao;
import com.zhiku.resumeapp.entity.Experience;
import com.zhiku.resumeapp.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienceService {
    @Autowired
    private ExperienceDao experienceDao;

    @Override
    public BaseDao getDao() {
        return experienceDao;
    }

}
