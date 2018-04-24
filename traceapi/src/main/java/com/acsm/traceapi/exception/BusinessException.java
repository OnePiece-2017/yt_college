package com.acsm.traceapi.exception;

import com.acsm.traceapi.enums.ExceptionEnum;

/**
 * 业务异常
 * Created by LiYu on 2017/7/3.
 */
public class BusinessException extends RuntimeException {

    private Integer code;

    /**
     * 继承Exception并加入状态值
     * @param exceptionEnum
     */
    public BusinessException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.code = exceptionEnum.getCode();
    }

    /**
     * 自定义错误信息
     * @param msg
     * @param code
     */
    public BusinessException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
