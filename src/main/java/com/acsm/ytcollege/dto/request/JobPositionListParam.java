package com.acsm.ytcollege.dto.request;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 17:13 2017/12/19
 */
public class JobPositionListParam {
    @NotNull(message = "状态不能为空")
    @ApiModelProperty("职位状态 发布状态 0 未发布 1 招募中 2 已下线")
    private Integer positionState;

    @NotNull(message = "企业ID不能为空")
    @ApiModelProperty("企业ID")
    private Integer jobEnterpriseId;

    @ApiModelProperty("第几页")
    private Integer pageIndex;

    @ApiModelProperty("一页多少条")
    private Integer pageSize;


    public Integer getJobEnterpriseId() {
        return jobEnterpriseId;
    }

    public void setJobEnterpriseId(Integer jobEnterpriseId) {
        this.jobEnterpriseId = jobEnterpriseId;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPositionState() {
        return positionState;
    }

    public void setPositionState(Integer positionState) {
        this.positionState = positionState;
    }
}
