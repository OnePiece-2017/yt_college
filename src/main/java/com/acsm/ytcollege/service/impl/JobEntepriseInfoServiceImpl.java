package com.acsm.ytcollege.service.impl;

import com.acsm.ytcollege.dto.request.JobEnterpriseParam;
import com.acsm.ytcollege.dto.request.JobResumeEnterprisePayParam;
import com.acsm.ytcollege.entity.JobEnterpriseInfo;
import com.acsm.ytcollege.entity.JobResumeEnterprisePay;
import com.acsm.ytcollege.repository.JobEntepriseInfoPayRepository;
import com.acsm.ytcollege.repository.JobEntepriseInfoRepository;
import com.acsm.ytcollege.service.JobEnterpriseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 22:11 2017/12/17
 */
@Service
public class JobEntepriseInfoServiceImpl implements JobEnterpriseInfoService {
    @Autowired
    JobEntepriseInfoRepository jobEntepriseInfoRepository;

    @Autowired
    JobEntepriseInfoPayRepository jobEntepriseInfoPayRepository;

    @Override
    public JobEnterpriseInfo findJobEntepriseInfoOne(int JobEntepriseInfoId) {
        return jobEntepriseInfoRepository.findOne(JobEntepriseInfoId);
    }

    @Override
    @Transactional
    public Integer insertJobEntepriseInfo(JobEnterpriseParam jobEnterpriseParam) {
        if(null != jobEnterpriseParam.getJobEntepriseInfoId()){
            JobEnterpriseInfo jobEnterpriseInfo = jobEntepriseInfoRepository.findOne(jobEnterpriseParam.getJobEntepriseInfoId());
            jobEnterpriseInfo.setAuthState(jobEnterpriseParam.getAuthState());
            jobEnterpriseInfo.setEnterpriseName(jobEnterpriseParam.getEnterpriseName());
            jobEnterpriseInfo.setEnterpriseNature(jobEnterpriseParam.getEnterpriseNature());
            jobEnterpriseInfo.setEnterprisePresentation(jobEnterpriseParam.getEnterprisePresentation());
            jobEnterpriseInfo.setEnterpriseScale(jobEnterpriseParam.getEnterpriseScale());
            jobEnterpriseInfo.setLogo(jobEnterpriseParam.getLogo());
            jobEnterpriseInfo.setPhone(jobEnterpriseParam.getPhone());
            jobEnterpriseInfo.setRecruitAddress(jobEnterpriseParam.getRecruitAddress());
            jobEnterpriseInfo.setRecruitPeople(jobEnterpriseParam.getRecruitPeople());
            jobEnterpriseInfo.setYtAccountId(jobEnterpriseParam.getYtAccountId());
            jobEntepriseInfoRepository.saveAndFlush(jobEnterpriseInfo);
            return jobEnterpriseInfo.getJobEntepriseInfoId();
        }else{
            JobEnterpriseInfo jobEnterpriseInfo = new JobEnterpriseInfo();
            jobEnterpriseInfo.setAuthState(jobEnterpriseParam.getAuthState());
            jobEnterpriseInfo.setEnterpriseName(jobEnterpriseParam.getEnterpriseName());
            jobEnterpriseInfo.setEnterpriseNature(jobEnterpriseParam.getEnterpriseNature());
            jobEnterpriseInfo.setEnterprisePresentation(jobEnterpriseParam.getEnterprisePresentation());
            jobEnterpriseInfo.setEnterpriseScale(jobEnterpriseParam.getEnterpriseScale());
            jobEnterpriseInfo.setLogo(jobEnterpriseParam.getLogo());
            jobEnterpriseInfo.setPhone(jobEnterpriseParam.getPhone());
            jobEnterpriseInfo.setRecruitAddress(jobEnterpriseParam.getRecruitAddress());
            jobEnterpriseInfo.setRecruitPeople(jobEnterpriseParam.getRecruitPeople());
            jobEnterpriseInfo.setYtAccountId(jobEnterpriseParam.getYtAccountId());
            jobEntepriseInfoRepository.save(jobEnterpriseInfo);
            return jobEnterpriseInfo.getJobEntepriseInfoId();
        }
    }

    @Override
    @Transactional
    public void insertJobEnterprisePay(JobResumeEnterprisePayParam jobResumeEnterprisePayParam) {
        JobResumeEnterprisePay jobResumeEnterprisePay = new JobResumeEnterprisePay();
        jobResumeEnterprisePay.setJobEnterpriseId(jobResumeEnterprisePayParam.getJobEnterpriseId());
        jobResumeEnterprisePay.setInsertTime(jobResumeEnterprisePayParam.getInsertTime());
        jobResumeEnterprisePay.setResumeId(jobResumeEnterprisePayParam.getResumeId());
        jobResumeEnterprisePay.setIsDeleted(0);
        jobResumeEnterprisePay.setInsertTime(new Date());
        jobEntepriseInfoPayRepository.save(jobResumeEnterprisePay);
    }
}
