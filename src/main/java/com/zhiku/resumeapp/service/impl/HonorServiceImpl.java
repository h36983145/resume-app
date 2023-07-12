package com.zhiku.resumeapp.service.impl;

import com.zhiku.resumeapp.dao.BaseDao;
import com.zhiku.resumeapp.dao.HonorDao;
import com.zhiku.resumeapp.entity.Experience;
import com.zhiku.resumeapp.entity.Honor;
import com.zhiku.resumeapp.service.HonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HonorServiceImpl implements HonorService {
    @Autowired
    private HonorDao honorDao;

    @Override
    public BaseDao getDao() {
        return honorDao;
    }

}
