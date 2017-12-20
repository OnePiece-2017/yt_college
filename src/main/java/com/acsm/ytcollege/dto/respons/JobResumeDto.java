package com.acsm.ytcollege.dto.respons;

import com.acsm.ytcollege.entity.JobResumeEducationExperience;
import com.acsm.ytcollege.entity.JobResumeEmploymentRecord;
import com.acsm.ytcollege.entity.JobResumePersonalHonor;
import com.acsm.ytcollege.entity.JobResumePurpose;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 15:44 2017/12/18
 */
public class JobResumeDto {
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
    private Date birthdate;

    @ApiModelProperty("参加工作日期")
    private Date timeToWork;

    @ApiModelProperty("居住城市ID")
    private Integer livingCityId;

    @ApiModelProperty("糊口所在地ID")
    private Integer residentCityId;

    @ApiModelProperty("电子邮件")
    private String email;

    @ApiModelProperty("自我评价")
    private String selfEvaluation;

    private Integer isDeleted;

    @ApiModelProperty("求职意向")
    private JobResumePurpose jobResumePurpose;

    @ApiModelProperty("教育背景")
    private List<JobResumeEducationExperience> jobResumeEducationExperienceList;

    @ApiModelProperty("工作经历")
    private List<JobResumeEmploymentRecord> jobResumeEmploymentRecordList;

    @ApiModelProperty("个人荣誉")
    private List<JobResumePersonalHonor> jobResumePersonalHonorList;

    public List<JobResumeEmploymentRecord> getJobResumeEmploymentRecordList() {
        return jobResumeEmploymentRecordList;
    }

    public List<JobResumePersonalHonor> getJobResumePersonalHonorList() {
        return jobResumePersonalHonorList;
    }

    public List<JobResumeEducationExperience> getJobResumeEducationExperienceList() {
        return jobResumeEducationExperienceList;
    }

    public void setJobResumeEmploymentRecordList(List<JobResumeEmploymentRecord> jobResumeEmploymentRecordList) {
        this.jobResumeEmploymentRecordList = jobResumeEmploymentRecordList;
    }

    public void setJobResumePersonalHonorList(List<JobResumePersonalHonor> jobResumePersonalHonorList) {
        this.jobResumePersonalHonorList = jobResumePersonalHonorList;
    }

    public void setJobResumeEducationExperienceList(List<JobResumeEducationExperience> jobResumeEducationExperienceList) {
        this.jobResumeEducationExperienceList = jobResumeEducationExperienceList;
    }

    public void setJobResumePurpose(JobResumePurpose jobResumePurpose) {
        this.jobResumePurpose = jobResumePurpose;
    }

    public JobResumePurpose getJobResumePurpose() {

        return jobResumePurpose;
    }

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

    public Date getBirthdate() {
        return birthdate;
    }

    public Date getTimeToWork() {
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

    public Integer getIsDeleted() {
        return isDeleted;
    }

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

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setTimeToWork(Date timeToWork) {
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

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}
