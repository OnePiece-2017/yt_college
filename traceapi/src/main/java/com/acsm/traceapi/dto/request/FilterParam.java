package com.acsm.traceapi.dto.request;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by LiYu on 2018/4/16.
 */
public class FilterParam {

    @ApiModelProperty("搜索内容")
    private String searchStr;

    public String getSearchStr() {
        return searchStr;
    }

    public void setSearchStr(String searchStr) {
        this.searchStr = searchStr;
    }
}
