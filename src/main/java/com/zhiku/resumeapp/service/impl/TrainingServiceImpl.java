package com.zhiku.resumeapp.service.impl;

import com.zhiku.resumeapp.dao.BaseDao;
import com.zhiku.resumeapp.dao.TrainingDao;
import com.zhiku.resumeapp.entity.Experience;
import com.zhiku.resumeapp.entity.Training;
import com.zhiku.resumeapp.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService {
    @Autowired
    private TrainingDao trainingDao;

    @Override
    public BaseDao getDao() {
        return trainingDao;
    }

}
