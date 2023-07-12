package com.zhiku.resumeapp.service.impl;

import com.zhiku.resumeapp.common.Constants;
import com.zhiku.resumeapp.dao.CvDao;
import com.zhiku.resumeapp.dao.ExperienceDao;
import com.zhiku.resumeapp.entity.Cv;
import com.zhiku.resumeapp.service.CvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.zhiku.resumeapp.common.Constants.CV_PUBLIC;

@Service
public class CvServiceImpl implements CvService {
    @Autowired
    private CvDao cvDao;

    @Autowired
    private ExperienceDao experienceDao;

    @Override
    public List<Cv> findPublicCv() {
        List<Cv> cvList = cvDao.selectCvByStatus(CV_PUBLIC);
        return cvList;
    }
    @Override
    public List<Cv> searchCv(String keywords) {
        List<Cv> cvList = cvDao.selectCv(keywords, CV_PUBLIC);
        List<Integer> cvIds = experienceDao.selectCvIdLikeCompany(keywords);
        if (cvIds.isEmpty()){
            return cvList;
        }
        List<Cv> companyCvList =cvDao.selectCvByIds(cvIds);
        cvList.addAll(companyCvList);
        return cvList;
    }

    @Override
    public Cv findById(int id) {
        Cv cv = cvDao.selectById(id);
        return cv;
    }

    @Override
    public void editBase(Cv cv) {
        cvDao.updateBase(cv);
    }

    @Override
    public void editDesired(Cv cv) {
        cvDao.updateDesired(cv);
    }

    public void updateStatus(Cv cv){
        int status = cv.getStatus()==1?1:0;
        cvDao.updateStatus(cv.getId(), status);
    }

}
