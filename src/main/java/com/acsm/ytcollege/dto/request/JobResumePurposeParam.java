package com.acsm.ytcollege.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 18:51 2017/12/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobResumePurposeParam {
    @ApiModelProperty("求职意向ID")
    private Integer jobPurposeId;

    @NotNull(message = "简历ID不能为空")
    @ApiModelProperty("简历ID")
    private Integer resumeId;

    @ApiModelProperty("工作性质")
    private String jobCategoryId;

    @ApiModelProperty("工作地点")
    private Integer workLocationId;

    @ApiModelProperty("职位类别")
    private Integer jobTypesId;

    @ApiModelProperty("职位薪资下限ID")
    private Integer salaryMinId;

    @ApiModelProperty("职位薪资上线ID")
    private Integer salaryMaxId;

    @ApiModelProperty("求职状态")
    private Integer jobState;

    public Integer getJobPurposeId() {
        return jobPurposeId;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public String getJobCategoryId() {
        return jobCategoryId;
    }

    public Integer getWorkLocationId() {
        return workLocationId;
    }

    public Integer getJobTypesId() {
        return jobTypesId;
    }

    public Integer getJobState() {
        return jobState;
    }

    public void setJobPurposeId(Integer jobPurposeId) {
        this.jobPurposeId = jobPurposeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public void setJobCategoryId(String jobCategoryId) {
        this.jobCategoryId = jobCategoryId;
    }

    public void setWorkLocationId(Integer workLocationId) {
        this.workLocationId = workLocationId;
    }

    public void setJobTypesId(Integer jobTypesId) {
        this.jobTypesId = jobTypesId;
    }

    public void setJobState(Integer jobState) {
        this.jobState = jobState;
    }

    public Integer getSalaryMinId() {
        return salaryMinId;
    }

    public void setSalaryMinId(Integer salaryMinId) {
        this.salaryMinId = salaryMinId;
    }

    public Integer getSalaryMaxId() {
        return salaryMaxId;
    }

    public void setSalaryMaxId(Integer salaryMaxId) {
        this.salaryMaxId = salaryMaxId;
    }
}
