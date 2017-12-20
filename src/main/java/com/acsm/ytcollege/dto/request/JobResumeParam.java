package com.acsm.ytcollege.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 15:55 2017/12/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobResumeParam {
    @ApiModelProperty("简历ID")
    private Integer resumeId;

    @ApiModelProperty("简历名称")
    private String resumeName;

    @ApiModelProperty("所属用户ID")
    private Integer userId;

    @ApiModelProperty("头像ico")
    private String ico;

    @ApiModelProperty("姓名")
    private String fullName;

    @ApiModelProperty("性别")
    private Integer sex;

    @ApiModelProperty("出生日期")
    private String birthdate;

    @ApiModelProperty("参加工作日期")
    private String timeToWork;

    @ApiModelProperty("居住城市ID")
    private Integer livingCityId;

    @ApiModelProperty("jhu所在地ID")
    private Integer residentCityId;

    @ApiModelProperty("电子邮件")
    private String email;

    @ApiModelProperty("自我评价")
    private String selfEvaluation;

//    private Integer isDeleted;

    public Integer getResumeId() {
        return resumeId;
    }

    public String getResumeName() {
        return resumeName;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getIco() {
        return ico;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getSex() {
        return sex;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getTimeToWork() {
        return timeToWork;
    }

    public Integer getLivingCityId() {
        return livingCityId;
    }

    public Integer getResidentCityId() {
        return residentCityId;
    }

    public String getEmail() {
        return email;
    }

    public String getSelfEvaluation() {
        return selfEvaluation;
    }

//    public Integer getIsDeleted() {
//        return isDeleted;
//    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setTimeToWork(String timeToWork) {
        this.timeToWork = timeToWork;
    }

    public void setLivingCityId(Integer livingCityId) {
        this.livingCityId = livingCityId;
    }

    public void setResidentCityId(Integer residentCityId) {
        this.residentCityId = residentCityId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSelfEvaluation(String selfEvaluation) {
        this.selfEvaluation = selfEvaluation;
    }

//    public void setIsDeleted(Integer isDeleted) {
//        this.isDeleted = isDeleted;
//    }
}
