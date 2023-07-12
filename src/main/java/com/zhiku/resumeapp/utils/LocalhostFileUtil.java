package com.zhiku.resumeapp.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class LocalhostFileUtil {
    public static final String DESK_PATH="E:/file/";
    public static final String WEB_PATH="/open/";
    public static String wFile(MultipartFile file) throws IOException {
        String filename = file.getOriginalFilename();
        File deskFile = new File(DESK_PATH + filename);
        file.transferTo(deskFile);
        return WEB_PATH+filename;
    }
}
