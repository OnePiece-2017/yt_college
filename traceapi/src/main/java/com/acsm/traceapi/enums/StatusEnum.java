package com.acsm.traceapi.enums;

/**
 * Created by LiYu on 2018/4/12.
 */
public enum StatusEnum {
    UNUSE(0, "未使用的溯源码"),
    ;


    private Integer status;
    private String comment;

    StatusEnum(Integer status, String comment){
        this.status = status;
        this.comment = comment;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
