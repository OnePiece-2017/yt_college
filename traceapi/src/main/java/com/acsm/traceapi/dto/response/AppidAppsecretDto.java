package com.acsm.traceapi.dto.response;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by LiYu on 2018/4/11.
 */
public class AppidAppsecretDto {

    @ApiModelProperty("appid")
    private String appid;

    @ApiModelProperty("appsecret")
    private String appSecret;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}
