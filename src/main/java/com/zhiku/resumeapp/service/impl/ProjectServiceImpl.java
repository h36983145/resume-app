package com.zhiku.resumeapp.service.impl;

import com.zhiku.resumeapp.dao.BaseDao;
import com.zhiku.resumeapp.dao.ProjectDao;
import com.zhiku.resumeapp.entity.Experience;
import com.zhiku.resumeapp.entity.Project;
import com.zhiku.resumeapp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectDao projectDao;

    @Override
    public BaseDao getDao() {
        return projectDao;
    }

}
