package com.zhiku.resumeapp.config;

import com.zhiku.resumeapp.common.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionConfig {
    @ExceptionHandler(value = Exception.class)
    public R<String> errorHandler(Exception ex){
        System.err.println("-------出现错误-------");
        ex.printStackTrace();
        return R.failure().setData("服务器内部错误");
    }
}
