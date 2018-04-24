package com.acsm.traceapi.dto.response;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by LiYu on 2018/4/11.
 */
public class TraceCodesWithBatchDto {

    @ApiModelProperty("批次名")
    private String batchName;

    @ApiModelProperty("本批次追溯码")
    private List<String> codeList;

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public List<String> getCodeList() {
        return codeList;
    }

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }
}
