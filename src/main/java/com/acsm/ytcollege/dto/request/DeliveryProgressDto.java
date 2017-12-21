package com.acsm.ytcollege.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by LiYu on 2017/12/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryProgressDto {

    @NotNull(message = "用户ID不能为空")
    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "简历被查看状态")
    private Integer status;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
