package com.acsm.traceapi.dto.request;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by LiYu on 2018/4/4.
 */
public class RequestTraceCodesParam{

    @ApiModelProperty("申请数量")
    @NotNull(message = "申请数量不能为空")
    private Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
