package com.acsm.ytcollege.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 20:47 2017/12/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPositionRePublishParam {
    @NotNull(message = "职位信息ID不能为空")
    @ApiModelProperty("职位信息ID")
    private Integer jobPositionId;

    @ApiModelProperty("截止日期")
    private String expirationTime;

    public Integer getJobPositionId() {
        return jobPositionId;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public void setJobPositionId(Integer jobPositionId) {
        this.jobPositionId = jobPositionId;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }
}
