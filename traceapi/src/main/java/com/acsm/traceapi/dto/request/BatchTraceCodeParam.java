package com.acsm.traceapi.dto.request;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by LiYu on 2018/4/11.
 */
public class BatchTraceCodeParam extends BaseParam{

    @ApiModelProperty("批次名")
    private String batchName;

    @ApiModelProperty("申请数量")
    @NotNull
    private int number;

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
