package com.acsm.traceapi.enums;

/**
 * Created by LiYu on 2018/4/12.
 */
public enum RedisKeyEnum {
    TRACE_CODE_INDEX_PREFIX("trace_code_index:", "追溯码索引前缀"),
    ;

    private String keyPrefix;
    private String keyComment;

    RedisKeyEnum(String keyPrefix, String keyComment){
        this.keyPrefix = keyPrefix;
        this.keyComment = keyComment;
    }

    public String getKeyPrefix() {
        return keyPrefix;
    }

    public String getKeyComment() {
        return keyComment;
    }
}
