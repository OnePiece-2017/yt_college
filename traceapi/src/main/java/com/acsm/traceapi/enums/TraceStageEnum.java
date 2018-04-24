package com.acsm.traceapi.enums;

/**
 * Created by LiYu on 2018/4/13.
 */
public enum TraceStageEnum {
    OTHER(0, "其他"),
    FARM(1, "生产"),
    PROCESS(2, "加工"),
    TRANSATION(3, "运输"),
    WHOLESALE(4, "批发"),
    RETAIL(5, "零售"),
    ;

    private int code;
    private String comment;

    TraceStageEnum(int code, String comment){
        this.code = code;
        this.comment = comment;
    }

    public int getCode() {
        return code;
    }

    public String getComment() {
        return comment;
    }

    public static TraceStageEnum getByCode(int code){
        for(TraceStageEnum traceStageEnum : TraceStageEnum.values()) {
            if(traceStageEnum.code == code) {
                return traceStageEnum;
            }
        }
        return TraceStageEnum.OTHER;
    }
}
