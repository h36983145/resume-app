package com.zhiku.resumeapp.controller;

import com.zhiku.resumeapp.common.R;
import com.zhiku.resumeapp.controller.vo.LoginRequest;
import com.zhiku.resumeapp.entity.Member;
import com.zhiku.resumeapp.service.MemberService;
import com.zhiku.resumeapp.utils.LocalhostFileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class LoginController {
    //@RequestMapping(value = "/login",method = RequestMethod.POST)
    @Autowired
    private MemberService memberService;

//    @PostMapping("/login")
//    public R login(@RequestParam("usname") String username,@RequestParam("psword") String password){
//        Member member = memberService.login(username,password);
//        if(ObjectUtils.isEmpty(member)){
//            return R.failure().setMessage("用户名或密码错误！");
//        }
//        return R.success().setData(member);
//    }
    @PostMapping("/login")
    public R login(@RequestBody LoginRequest loginRequest, HttpSession session){
        Member member = memberService.login(loginRequest.getUsname(),loginRequest.getPsword());
        if(ObjectUtils.isEmpty(member)){
            return R.failure().setMessage("用户名或密码错误！");
        }
        session.setAttribute("USER",member);
        return R.success().setData(member);
    }

    @PostMapping("/register")
    public R register(@RequestBody Member member){
        if(memberService.register(member)){
            return  R.success().setMessage("用户注册成功！");
        }
        return R.failure().setMessage("用户重复！");
    }

    @RequestMapping("/uploadFile")
    public R upload(MultipartFile file) throws IOException {
        String path = LocalhostFileUtil.wFile(file);
        return R.success().setData(path);
    }
}
