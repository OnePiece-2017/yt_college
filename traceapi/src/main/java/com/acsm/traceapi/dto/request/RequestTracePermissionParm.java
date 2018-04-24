package com.acsm.traceapi.dto.request;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

import javax.validation.constraints.NotNull;

/**
 * Created by LiYu on 2018/4/11.
 */
public class RequestTracePermissionParm {

    @ApiModelProperty("平台名称")
    @NotNull
    private String platformName;

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }
}
