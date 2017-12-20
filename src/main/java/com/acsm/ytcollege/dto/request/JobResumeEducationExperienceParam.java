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
 * @Date : Create in 18:04 2017/12/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobResumeEducationExperienceParam {
    @ApiModelProperty("教育经历ID")
    private Integer educationExperienceId;

    @NotNull(message = "简历ID不能为空")
    @ApiModelProperty("简历ID")
    private Integer resumeId;

    @ApiModelProperty("学校")
    private Integer schoolId;

    @ApiModelProperty("学位")
    private Integer degreeId;

    @ApiModelProperty("入学时间")
    private String beginTime;

    @ApiModelProperty("毕业时间")
    private String endTime;

    @ApiModelProperty("专业")
    private Integer majorId;

    public Integer getEducationExperienceId() {
        return educationExperienceId;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public Integer getDegreeId() {
        return degreeId;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setEducationExperienceId(Integer educationExperienceId) {
        this.educationExperienceId = educationExperienceId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public void setDegreeId(Integer degreeId) {
        this.degreeId = degreeId;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }
}
