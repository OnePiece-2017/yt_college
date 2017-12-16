package com.acsm.ytcollege.enums;

/**
 * Created by LiYu on 2017/7/3.
 */
public enum ExceptionEnum {
    UNKNOW_ERROR(-1, "未知错误"),
    IMAGE_INTERFACE_ERROR(100, "上传图片接口错误"),
    ;

    private Integer code;
    private String msg;

    ExceptionEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
