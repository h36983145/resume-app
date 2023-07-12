package com.zhiku.resumeapp.dao;

import com.zhiku.resumeapp.entity.Cv;
import com.zhiku.resumeapp.entity.Experience;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * CvDAO
 */
@Mapper
public interface CvDao{
    List<Cv> selectCvByStatus(int status);

    List<Cv> selectCv(@Param("keywords")String keywords,@Param("status") int status);

    List<Cv> selectCvByIds(@Param("cvIds") List<Integer> cvIds);

    Cv selectById(@Param("id") int id);

    void insertEmptyCv(int memberId);

    Integer selectByMemberId(@Param("memberId") Integer id);

    void updateBase(Cv cv);

    void updateDesired(Cv cv);

    void updateStatus(@Param("id") Integer id, @Param("status") int status);
}