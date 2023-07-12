package com.zhiku.resumeapp.service.impl;

import com.zhiku.resumeapp.dao.CvDao;
import com.zhiku.resumeapp.dao.MemberDao;
import com.zhiku.resumeapp.entity.Member;
import com.zhiku.resumeapp.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberDao memberDao;

    @Autowired
    private CvDao cvDao;
    @Override
    public Member login(String username, String password) {
        Member member = memberDao.selectByUsername(username);
        if(ObjectUtils.isEmpty(member)){
            //throw new RuntimeException("当前用户不存在！")；
            return null;
        }
        if(member.getPsword().equals(password)){
            member.setPsword(null);
            Integer cvId = cvDao.selectByMemberId(member.getId());
            member.setCvId(cvId);
            return  member;
        }
        return null;
    }

    @Override
    public boolean register(Member member) {
        Member result = memberDao.selectByUsername(member.getUsname());
        if(ObjectUtils.isEmpty(result)){
            //throw new RuntimeException("当前用户不存在！")；
            memberDao.insert(member);
            int memberId = member.getId();
            cvDao.insertEmptyCv(memberId);
            return true;
        }
        return false;
    }
}
