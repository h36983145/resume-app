package com.zhiku.resumeapp.controller;

import com.zhiku.resumeapp.common.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller + @ResponseBody = @RestController
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/ok")
    public R<String> ok(){
        return R.success().setData("Success!");
    }

    @RequestMapping("/param/{id}")
    public R<String> ok(@PathVariable("id") String url, @RequestParam("name") String name){
        return R.success().setData("Success!{url:"+url+",name:"+name+"}");
    }

    @RequestMapping("/error/{x}")
    public R<String> error(@PathVariable("x") int x){
        int i = 100/x;
        return R.success().setData("Success:Error!");
    }
}
