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
 * @Date : Create in 19:08 2017/12/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobResumePersonalHonorParam {
    @ApiModelProperty("个人荣誉ID")
    private Integer personalHonorId;

    @NotNull(message = "简历ID不能为空")
    @ApiModelProperty("简历ID")
    private Integer resumeId;

    @ApiModelProperty("证书类型")
    private Integer certificateType;

    @ApiModelProperty("证书名称")
    private String certificateName;

    @ApiModelProperty("获取时间")
    private String acquireTime;

    @ApiModelProperty("颁发单位")
    private String issued;

    public Integer getPersonalHonorId() {
        return personalHonorId;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public Integer getCertificateType() {
        return certificateType;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public String getAcquireTime() {
        return acquireTime;
    }

    public String getIssued() {
        return issued;
    }

    public void setPersonalHonorId(Integer personalHonorId) {
        this.personalHonorId = personalHonorId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public void setAcquireTime(String acquireTime) {
        this.acquireTime = acquireTime;
    }

    public void setIssued(String issued) {
        this.issued = issued;
    }
}
