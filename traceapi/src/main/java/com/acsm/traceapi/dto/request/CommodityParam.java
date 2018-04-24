package com.acsm.traceapi.dto.request;

import com.acsm.traceapi.domain.Commodity;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by LiYu on 2018/4/13.
 */
public class CommodityParam {

    @ApiModelProperty("追溯环节")
    private int traceStage;

    @ApiModelProperty("商品信息")
    @NotNull
    private List<Commodity> commodities;

    public List<Commodity> getCommodities() {
        return commodities;
    }

    public void setCommodities(List<Commodity> commodities) {
        this.commodities = commodities;
    }

    public int getTraceStage() {
        return traceStage;
    }

    public void setTraceStage(int traceStage) {
        this.traceStage = traceStage;
    }
}
