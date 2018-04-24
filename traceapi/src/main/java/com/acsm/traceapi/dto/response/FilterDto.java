package com.acsm.traceapi.dto.response;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by LiYu on 2018/4/16.
 */
public class FilterDto {

    @ApiModelProperty("商品信息")
    private List<CommodityDto> commodities;

    @ApiModelProperty("追溯节点")
    private TraceDto traceNode;

    public List<CommodityDto> getCommodities() {
        return commodities;
    }

    public void setCommodities(List<CommodityDto> commodities) {
        this.commodities = commodities;
    }

    public TraceDto getTraceNode() {
        return traceNode;
    }

    public void setTraceNode(TraceDto traceNode) {
        this.traceNode = traceNode;
    }
}
