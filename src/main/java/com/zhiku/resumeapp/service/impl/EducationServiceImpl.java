package com.zhiku.resumeapp.service.impl;

import com.zhiku.resumeapp.dao.BaseDao;
import com.zhiku.resumeapp.dao.EducationDao;
import com.zhiku.resumeapp.entity.Education;
import com.zhiku.resumeapp.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService {
    @Autowired
    private EducationDao educationDao;

    @Override
    public BaseDao getDao() {
        return educationDao;
    }

}
