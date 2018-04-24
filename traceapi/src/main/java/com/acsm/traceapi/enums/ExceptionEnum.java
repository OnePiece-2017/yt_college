package com.acsm.traceapi.enums;

/**
 * Created by LiYu on 2017/7/3.
 */
public enum ExceptionEnum {
    UNKNOW_ERROR(-1, "未知错误"),
    IMAGE_INTERFACE_ERROR(100, "上传图片接口错误"),
    ARGUMENT_INVALID_ERROR(1000, "参数校验错误"),
    APPID_ERROR(1001, "平台的appid或者appsecret不正确")
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
