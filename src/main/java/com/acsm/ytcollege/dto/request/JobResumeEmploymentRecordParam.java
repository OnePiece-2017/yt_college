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
 * @Date : Create in 17:44 2017/12/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobResumeEmploymentRecordParam {
    @ApiModelProperty("工作经历/实习经历 ID")
    private Integer employmentRecordId;

    @NotNull(message = "简历ID不能为空")
    @ApiModelProperty("简历ID")
    private Integer resumeId;

    @ApiModelProperty("公司名称")
    private String companyName;

    @ApiModelProperty("开始时间")
    private String beginTime;

    @ApiModelProperty("结束时间")
    private String endTime;

    @ApiModelProperty("岗位")
    private Integer stationId;

    @ApiModelProperty("职位薪资下限ID")
    private Integer salaryMinId;

    @ApiModelProperty("职位薪资上线ID")
    private Integer salaryMaxId;

    @ApiModelProperty("工作描述")
    private String workDescribe;

    public Integer getEmploymentRecordId() {
        return employmentRecordId;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public Integer getStationId() {
        return stationId;
    }

    public String getWorkDescribe() {
        return workDescribe;
    }

    public void setEmploymentRecordId(Integer employmentRecordId) {
        this.employmentRecordId = employmentRecordId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public void setWorkDescribe(String workDescribe) {
        this.workDescribe = workDescribe;
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

