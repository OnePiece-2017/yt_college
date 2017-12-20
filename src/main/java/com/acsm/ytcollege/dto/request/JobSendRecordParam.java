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
 * @Date : Create in 21:06 2017/12/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSendRecordParam {
//    @ApiModelProperty("投递记录ID")
//    private Integer sendRecordId;
@NotNull(message = "简历ID不能为空")
    @ApiModelProperty("简历ID")
    private Integer resumeId;

    @NotNull(message = "职位ID不能为空")
    @ApiModelProperty("职位ID")

    private Integer positionId;
    @ApiModelProperty("投递状态")
    private Integer state;

    @ApiModelProperty("投递时间")
    private Date sendTime;

    public Integer getResumeId() {
        return resumeId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public Integer getState() {
        return state;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}
