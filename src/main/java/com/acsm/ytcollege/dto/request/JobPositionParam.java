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
 * @Date : Create in 20:28 2017/12/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPositionParam {

    @ApiModelProperty("职位ID")
    private Integer positionId;

    @ApiModelProperty("职位名称")
    private String positionName;

    @ApiModelProperty("职位类别")
    private Integer jobTypesId;

    @ApiModelProperty("职位薪资下限ID")
    private Integer salaryMinId;

    @ApiModelProperty("职位薪资上线ID")
    private Integer salaryMaxId;

    @ApiModelProperty("经验")
    private Integer experience;

    @ApiModelProperty("学历")
    private Integer degreeId;

    @ApiModelProperty("福利待遇")
    private Integer benefits;

    @ApiModelProperty("招聘人数")
    private Integer recruitNum;

    @ApiModelProperty("职位描述")
    private String positionDescribe;

    @ApiModelProperty("工作地址")
    private String workAddress;

    @ApiModelProperty("发布时间")
    private String insertTime;

    @ApiModelProperty("截止时间")
    private String dueTime;

    @ApiModelProperty("发布状态")
    private Integer state;

    @NotNull(message = "企业ID不能为空")
    @ApiModelProperty("企业ID")
    private Integer jobEnterpriseId;

    public Integer getPositionId() {
        return positionId;
    }

    public String getPositionName() {
        return positionName;
    }
    public Integer getJobTypesId() {
        return jobTypesId;
    }

    public Integer getExperience() {
        return experience;
    }

    public Integer getDegreeId() {
        return degreeId;
    }

    public Integer getBenefits() {
        return benefits;
    }

    public Integer getRecruitNum() {
        return recruitNum;
    }

    public String getPositionDescribe() {
        return positionDescribe;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public Integer getState() {
        return state;
    }

    public Integer getJobEnterpriseId() {
        return jobEnterpriseId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public void setJobTypesId(Integer jobTypesId) {
        this.jobTypesId = jobTypesId;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public void setDegreeId(Integer degreeId) {
        this.degreeId = degreeId;
    }

    public void setBenefits(Integer benefits) {
        this.benefits = benefits;
    }

    public void setRecruitNum(Integer recruitNum) {
        this.recruitNum = recruitNum;
    }

    public void setPositionDescribe(String positionDescribe) {
        this.positionDescribe = positionDescribe;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void setJobEnterpriseId(Integer jobEnterpriseId) {
        this.jobEnterpriseId = jobEnterpriseId;
    }

    public String getDueTime() {
        return dueTime;
    }

    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
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
