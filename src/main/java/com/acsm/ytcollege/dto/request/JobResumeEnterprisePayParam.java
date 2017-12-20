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
 * @Date : Create in 19:53 2017/12/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobResumeEnterprisePayParam {
    @ApiModelProperty("企业支付信息ID")
    private Integer EnterprisePayId;

    @NotNull(message = "简历ID不能为空")
    @ApiModelProperty("简历ID")
    private Integer resumeId;

    @NotNull(message = "企业ID不能为空")
    @ApiModelProperty("企业ID")
    private Integer jobEnterpriseId;

    private Date insertTime;

    public void setEnterprisePayId(Integer enterprisePayId) {
        EnterprisePayId = enterprisePayId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public void setJobEnterpriseId(Integer jobEnterpriseId) {
        this.jobEnterpriseId = jobEnterpriseId;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Integer getEnterprisePayId() {
        return EnterprisePayId;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public Integer getJobEnterpriseId() {
        return jobEnterpriseId;
    }

    public Date getInsertTime() {
        return insertTime;
    }
}
