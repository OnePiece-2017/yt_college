package com.acsm.ytcollege.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by HASEE on 2017/12/17.
 */
public class DeliveryProgressDto {

    private int userId;

    @ApiModelProperty(value = "简历被查看状态")
    private int status;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
