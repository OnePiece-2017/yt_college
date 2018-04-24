package com.acsm.traceapi.enums;

/**
 * Created by LiYu on 2018/4/13.
 */
public enum CommodityStatusEnum {
    NORMAL(0, "正常"),
    ;

    private int code;
    private String comment;

    CommodityStatusEnum(int code, String comment) {
        this.code = code;
        this.comment = comment;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
