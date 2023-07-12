package com.zhiku.resumeapp.dao;

import com.zhiku.resumeapp.entity.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao {
    Member selectByUsername(String username);
    void insert(Member member);
}
