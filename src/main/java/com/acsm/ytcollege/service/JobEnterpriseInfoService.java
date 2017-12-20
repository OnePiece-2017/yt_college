package com.acsm.ytcollege.service;

import com.acsm.ytcollege.dto.request.JobEnterpriseParam;
import com.acsm.ytcollege.dto.request.JobResumeEnterprisePayParam;
import com.acsm.ytcollege.entity.JobEnterpriseInfo;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 22:10 2017/12/17
 */
public interface JobEnterpriseInfoService {
    public JobEnterpriseInfo findJobEntepriseInfoOne(int JobEntepriseInfoId);

    public Integer insertJobEntepriseInfo(JobEnterpriseParam jobEnterpriseParam);

    public void insertJobEnterprisePay(JobResumeEnterprisePayParam jobResumeEnterprisePayParam);
}
