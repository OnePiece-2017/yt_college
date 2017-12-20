package com.acsm.ytcollege.dto.respons;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 20:18 2017/12/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobUserDto {
    @ApiModelProperty("用户ID")
    private Integer userId;

    @ApiModelProperty("电话")
    private String phone;

    @ApiModelProperty("头像")
    private String ico;

    public Integer getUserId() {
        return userId;
    }

    public String getPhone() {
        return phone;
    }

    public String getIco() {
        return ico;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }
}
