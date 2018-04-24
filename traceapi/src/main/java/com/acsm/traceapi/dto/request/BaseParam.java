package com.acsm.traceapi.dto.request;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by LiYu on 2018/3/26.
 */
public class BaseParam {

    @NotNull(message = "appId不能为空")
    @ApiModelProperty("appId")
    private String appId;

    @NotNull(message = "appSecret不能为空")
    @ApiModelProperty("appSecret")
    private String appSecret;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}

