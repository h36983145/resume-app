package com.zhiku.resumeapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResConfig implements WebMvcConfigurer {
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/open/**").addResourceLocations("file:E:/file/");
    }
}
