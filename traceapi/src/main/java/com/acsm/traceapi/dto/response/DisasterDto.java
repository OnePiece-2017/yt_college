package com.acsm.traceapi.dto.response;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

/**
 * Created by LiYu on 2018/4/23.
 */
public class DisasterDto {

    @ApiModelProperty("灾害标题")
    private String title;

    @ApiModelProperty("灾害code")
    private String disasterCode;

    @ApiModelProperty("灾害等级code")
    private String disasterLevelCode;

    @ApiModelProperty("发布时间")
    private String publishTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDisasterCode() {
        return disasterCode;
    }

    public void setDisasterCode(String disasterCode) {
        this.disasterCode = disasterCode;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getDisasterLevelCode() {
        return disasterLevelCode;
    }

    public void setDisasterLevelCode(String disasterLevelCode) {
        this.disasterLevelCode = disasterLevelCode;
    }
}
