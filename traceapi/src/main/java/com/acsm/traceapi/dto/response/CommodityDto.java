package com.acsm.traceapi.dto.response;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by LiYu on 2018/4/13.
 */
public class CommodityDto {

    @ApiModelProperty("商品id")
    private Integer commodityId;

    @ApiModelProperty("商品追溯码")
    private String traceCode;

    @ApiModelProperty("商品更新日期")
    private String date;

    @ApiModelProperty("商品状态")
    private String commodityStatus;

    @ApiModelProperty("商品名")
    private String commodityName;

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getTraceCode() {
        return traceCode;
    }

    public void setTraceCode(String traceCode) {
        this.traceCode = traceCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCommodityStatus() {
        return commodityStatus;
    }

    public void setCommodityStatus(String commodityStatus) {
        this.commodityStatus = commodityStatus;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }
}
