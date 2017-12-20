package com.acsm.ytcollege.service.impl;

import com.acsm.ytcollege.dto.request.JobResumePurposeParam;
import com.acsm.ytcollege.entity.JobResumePurpose;
import com.acsm.ytcollege.repository.JobResumePurposeRepository;
import com.acsm.ytcollege.service.JobResumePurposeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 21:12 2017/12/17
 */
@Service
public class JobResumePurposeServiceImpl implements JobResumePurposeService {
    @Autowired
    JobResumePurposeRepository jobResumePurposeRepository;

    @Override
    public JobResumePurpose findJobResumePurposeOne(int jobResumePurposeId) {
        return jobResumePurposeRepository.findOne(jobResumePurposeId);
    }

    @Override
    @Transactional
    public Integer insertJobResumePurpose(JobResumePurposeParam jobResumePurposeParam) {
        if(null != jobResumePurposeParam.getJobPurposeId()){
            JobResumePurpose jobResumePurpose = jobResumePurposeRepository.findOne(jobResumePurposeParam.getJobPurposeId());
            jobResumePurpose.setJobCategoryId(jobResumePurposeParam.getJobCategoryId());
            jobResumePurpose.setJobState(jobResumePurposeParam.getJobState());
            jobResumePurpose.setJobTypesId(jobResumePurposeParam.getJobTypesId());
            jobResumePurpose.setSalaryMinId(jobResumePurposeParam.getSalaryMinId());
            jobResumePurpose.setSalaryMaxId(jobResumePurposeParam.getSalaryMaxId());
            jobResumePurpose.setWorkLocationId(jobResumePurposeParam.getWorkLocationId());
            jobResumePurposeRepository.saveAndFlush(jobResumePurpose);
            return jobResumePurpose.getJobPurposeId();
        }else{
            JobResumePurpose jobResumePurpose = new JobResumePurpose();
            jobResumePurpose.setJobCategoryId(jobResumePurposeParam.getJobCategoryId());
            jobResumePurpose.setJobState(jobResumePurposeParam.getJobState());
            jobResumePurpose.setJobTypesId(jobResumePurposeParam.getJobTypesId());
            jobResumePurpose.setSalaryMinId(jobResumePurposeParam.getSalaryMinId());
            jobResumePurpose.setSalaryMaxId(jobResumePurposeParam.getSalaryMaxId());
            jobResumePurpose.setWorkLocationId(jobResumePurposeParam.getWorkLocationId());
            jobResumePurpose.setIsDeleted(0);
            jobResumePurpose.setResumeId(jobResumePurposeParam.getResumeId());
            jobResumePurposeRepository.save(jobResumePurpose);
            return jobResumePurpose.getJobPurposeId();
        }
    }

//    @Override
//    @Transactional
//    public void updateJobResumePurpose(JobResumePurpose jobResumePurpose) {
//        jobResumePurposeRepository.saveAndFlush(jobResumePurpose);
//    }

    @Override
    public void deleteJobResumePurpose(JobResumePurpose jobResumePurpose) {
        jobResumePurpose.setIsDeleted(1);
        jobResumePurposeRepository.save(jobResumePurpose);
    }

    @Override
    public JobResumePurpose getJobResumePurpose(Integer jobResumeId) {
        return jobResumePurposeRepository.findByResumeId(jobResumeId);
    }
}
