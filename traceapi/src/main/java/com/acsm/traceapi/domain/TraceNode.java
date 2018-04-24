package com.acsm.traceapi.domain;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by LiYu on 2018/4/13.
 */
public class TraceNode {

    @ApiModelProperty("主体名")
    private String subjectName;

    @ApiModelProperty("追溯阶段")
    private String traceStage;

    @ApiModelProperty("时间")
    private String dateTime;

    @ApiModelProperty("生产地址")
    private String traceAddr;

    @ApiModelProperty("经度")
    private double lng;

    @ApiModelProperty("纬度")
    private double lat;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getTraceStage() {
        return traceStage;
    }

    public void setTraceStage(String traceStage) {
        this.traceStage = traceStage;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getTraceAddr() {
        return traceAddr;
    }

    public void setTraceAddr(String traceAddr) {
        this.traceAddr = traceAddr;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
