package com.acsm.ytcollege.service.impl;

import com.acsm.ytcollege.dto.request.JobResumePersonalHonorParam;
import com.acsm.ytcollege.entity.JobResumePersonalHonor;
import com.acsm.ytcollege.repository.JobResumePersonalHonorRepository;
import com.acsm.ytcollege.service.JobResumePersonalHonorService;
import com.acsm.ytcollege.utils.DateHelpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 21:41 2017/12/17
 */
@Service
public class JobResumePersonalHonorServiceImpl implements JobResumePersonalHonorService {
    @Autowired
    JobResumePersonalHonorRepository jobResumePersonalHonorRepository;

    @Override
    public JobResumePersonalHonor findJobResumePersonalHonorOne(int jobResumePersonalHonorId) {
        return jobResumePersonalHonorRepository.findOne(jobResumePersonalHonorId);
    }

    @Override
    @Transactional
    public Integer insertJobResumePersonalHonor(JobResumePersonalHonorParam jobResumePersonalHonorParam) {
        if(null != jobResumePersonalHonorParam.getPersonalHonorId()){
            JobResumePersonalHonor jobResumePersonalHonor = jobResumePersonalHonorRepository.findOne(jobResumePersonalHonorParam.getPersonalHonorId());
            jobResumePersonalHonor.setAcquireTime(DateHelpUtil.strToDatetime(jobResumePersonalHonorParam.getAcquireTime(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobResumePersonalHonor.setCertificateName(jobResumePersonalHonorParam.getCertificateName());
            jobResumePersonalHonor.setCertificateType(jobResumePersonalHonorParam.getCertificateType());
            jobResumePersonalHonor.setIssued(jobResumePersonalHonorParam.getIssued());
            jobResumePersonalHonorRepository.saveAndFlush(jobResumePersonalHonor);
            return jobResumePersonalHonor.getPersonalHonorId();
        }else{
            JobResumePersonalHonor jobResumePersonalHonor = new JobResumePersonalHonor();
            jobResumePersonalHonor.setCertificateName(jobResumePersonalHonorParam.getCertificateName());
            jobResumePersonalHonor.setCertificateType(jobResumePersonalHonorParam.getCertificateType());
            jobResumePersonalHonor.setIssued(jobResumePersonalHonorParam.getIssued());
            jobResumePersonalHonor.setAcquireTime(DateHelpUtil.strToDatetime(jobResumePersonalHonorParam.getAcquireTime(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobResumePersonalHonor.setIsDeleted(0);
            jobResumePersonalHonor.setResumeId(jobResumePersonalHonorParam.getResumeId());
            jobResumePersonalHonorRepository.save(jobResumePersonalHonor);
            return jobResumePersonalHonor.getPersonalHonorId();
        }
    }

//    @Override
//    @Transactional
//    public void updateJobResumePersonalHonor(JobResumePersonalHonor jobResumePersonalHonor) {
//        jobResumePersonalHonorRepository.saveAndFlush(jobResumePersonalHonor);
//    }

    @Override
    public void deleteJobResumePersonalHonor(JobResumePersonalHonor jobResumePersonalHonor) {
        jobResumePersonalHonor.setIsDeleted(1);
        jobResumePersonalHonorRepository.save(jobResumePersonalHonor);
    }

    @Override
    public List<JobResumePersonalHonor> getJobResumePersonalHonorList(Integer resumeId) {
        return jobResumePersonalHonorRepository.findByResumeId(resumeId);
    }
}
