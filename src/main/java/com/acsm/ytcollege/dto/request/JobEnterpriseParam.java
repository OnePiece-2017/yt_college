package com.acsm.ytcollege.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 19:30 2017/12/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobEnterpriseParam {
    @ApiModelProperty("招聘企业ID")
    private Integer jobEntepriseInfoId;

    @ApiModelProperty("企业logo")
    private String logo;

    @ApiModelProperty("企业名称")
    private String enterpriseName;

    @ApiModelProperty("企业性质")
    private String enterpriseNature;

    @ApiModelProperty("企业规模")
    private Integer enterpriseScale;

    @ApiModelProperty("招聘地址")
    private String recruitAddress;

    @ApiModelProperty("招聘人")
    private String recruitPeople;

    @ApiModelProperty("电话")
    private String phone;

    @ApiModelProperty("企业介绍")
    private String enterprisePresentation;

    @ApiModelProperty("认证状态")
    private Integer authState;

    @ApiModelProperty("企业ID")
    private Integer ytAccountId;

    public String getLogo() {
        return logo;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public String getEnterpriseNature() {
        return enterpriseNature;
    }

    public Integer getEnterpriseScale() {
        return enterpriseScale;
    }

    public String getRecruitAddress() {
        return recruitAddress;
    }

    public String getRecruitPeople() {
        return recruitPeople;
    }

    public String getPhone() {
        return phone;
    }

    public String getEnterprisePresentation() {
        return enterprisePresentation;
    }

    public Integer getAuthState() {
        return authState;
    }

    public Integer getYtAccountId() {
        return ytAccountId;
    }


    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public void setEnterpriseNature(String enterpriseNature) {
        this.enterpriseNature = enterpriseNature;
    }

    public void setEnterpriseScale(Integer enterpriseScale) {
        this.enterpriseScale = enterpriseScale;
    }

    public void setRecruitAddress(String recruitAddress) {
        this.recruitAddress = recruitAddress;
    }

    public void setRecruitPeople(String recruitPeople) {
        this.recruitPeople = recruitPeople;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEnterprisePresentation(String enterprisePresentation) {
        this.enterprisePresentation = enterprisePresentation;
    }

    public void setAuthState(Integer authState) {
        this.authState = authState;
    }

    public void setYtAccountId(Integer ytAccountId) {
        this.ytAccountId = ytAccountId;
    }

    public Integer getJobEntepriseInfoId() {
        return jobEntepriseInfoId;
    }

    public void setJobEntepriseInfoId(Integer jobEntepriseInfoId) {
        this.jobEntepriseInfoId = jobEntepriseInfoId;
    }
}
