package com.zhiku.resumeapp.service;

import com.zhiku.resumeapp.entity.Member;

public interface MemberService {
    //处理用户登陆的逻辑，接收两个参数，返回登陆成功后的用户信息
    Member login(String username,String password);
    boolean register(Member member);
}
