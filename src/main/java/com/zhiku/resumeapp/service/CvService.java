package com.zhiku.resumeapp.service;

import com.zhiku.resumeapp.entity.Cv;

import java.util.List;

public interface CvService {

    List<Cv> findPublicCv();
    List<Cv> searchCv(String keywords);

    Cv findById(int id);

    void editBase(Cv cv);

    void editDesired(Cv cv);
}
