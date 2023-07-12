package com.zhiku.resumeapp.common;

import lombok.Getter;

@Getter
public enum Code {
    SUCCESS("200", "操作成功"),
    FAILURE("400", "操作失败"),
    UNKONWN("500", "服务器未知错误"),
    SAVE_FAILURE("501", "保存失败"),
    UPDATE_FAILURE("502", "修改失败"),
    DELETE_FAILURE("503", "删除失败");
    private String value;
    private String message;
    Code(String value, String message) {
        this.value = value;
        this.message = message;
    }
}