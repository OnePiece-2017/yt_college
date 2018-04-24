package com.acsm.traceapi.domain;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by LiYu on 2018/3/26.
 */
public class Commodity {

    @NotNull(message = "经营主体名不能为空")
    @ApiModelProperty("经营主体名")
    private String subjectName;

    @ApiModelProperty("主体证件号")
    private String subjectCode;

    @ApiModelProperty("经营主体类型")
    private Integer subjectType;

    @ApiModelProperty("货品名")
    private String commodityName;

    @ApiModelProperty("厂家货品编码")
    private String factoryCode;

    @ApiModelProperty("追溯码")
    @NotNull(message = "追溯码不能为空")
    private String traceCode;

    @ApiModelProperty("下级货品")
    private List<Commodity> commodities;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public Integer getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(Integer subjectType) {
        this.subjectType = subjectType;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public List<Commodity> getCommodities() {
        return commodities;
    }

    public void setCommodities(List<Commodity> commodities) {
        this.commodities = commodities;
    }

    public String getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode;
    }

    public String getTraceCode() {
        return traceCode;
    }

    public void setTraceCode(String traceCode) {
        this.traceCode = traceCode;
    }
}
