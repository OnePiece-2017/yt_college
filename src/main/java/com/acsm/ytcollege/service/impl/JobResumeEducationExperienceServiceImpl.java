package com.acsm.ytcollege.service.impl;

import com.acsm.ytcollege.dto.request.JobResumeEducationExperienceParam;
import com.acsm.ytcollege.entity.JobResumeEducationExperience;
import com.acsm.ytcollege.repository.JobResumeEducationExperienceRepository;
import com.acsm.ytcollege.service.JobResumeEducationExperienceService;
import com.acsm.ytcollege.utils.DateHelpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 21:04 2017/12/17
 */
@Service
public class JobResumeEducationExperienceServiceImpl implements JobResumeEducationExperienceService{
    @Autowired
    JobResumeEducationExperienceRepository jobResumeEducationExperienceRepository;

    @Override
    public JobResumeEducationExperience findJobResumeEducationExperienceOne(int jobResumeEducationExperienceId) {
        return jobResumeEducationExperienceRepository.findOne(jobResumeEducationExperienceId);
    }

    @Override
    @Transactional
    public Integer insertJobResumeEducationExperience(JobResumeEducationExperienceParam jobResumeEducationExperienceParam) {
        if(null != jobResumeEducationExperienceParam.getEducationExperienceId()){
            JobResumeEducationExperience jobResumeEducationExperience = jobResumeEducationExperienceRepository.findOne(jobResumeEducationExperienceParam.getEducationExperienceId());
            jobResumeEducationExperience.setDegreeId(jobResumeEducationExperienceParam.getDegreeId());
            jobResumeEducationExperience.setBeginTime(DateHelpUtil.strToDatetime(jobResumeEducationExperienceParam.getBeginTime(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobResumeEducationExperience.setEndTime(DateHelpUtil.strToDatetime(jobResumeEducationExperienceParam.getEndTime(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobResumeEducationExperience.setMajorId(jobResumeEducationExperienceParam.getMajorId());
            jobResumeEducationExperience.setSchoolId(jobResumeEducationExperienceParam.getSchoolId());
            jobResumeEducationExperienceRepository.saveAndFlush(jobResumeEducationExperience);
            return jobResumeEducationExperience.getEducationExperienceId();
        }else{
            JobResumeEducationExperience jobResumeEducationExperience = new JobResumeEducationExperience();
            jobResumeEducationExperience.setDegreeId(jobResumeEducationExperienceParam.getDegreeId());
            jobResumeEducationExperience.setBeginTime(DateHelpUtil.strToDatetime(jobResumeEducationExperienceParam.getBeginTime(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobResumeEducationExperience.setEndTime(DateHelpUtil.strToDatetime(jobResumeEducationExperienceParam.getEndTime(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobResumeEducationExperience.setMajorId(jobResumeEducationExperienceParam.getMajorId());
            jobResumeEducationExperience.setSchoolId(jobResumeEducationExperienceParam.getSchoolId());
            jobResumeEducationExperience.setIsDeleted(0);
            jobResumeEducationExperience.setResumeId(jobResumeEducationExperienceParam.getResumeId());
            jobResumeEducationExperienceRepository.save(jobResumeEducationExperience);
            return jobResumeEducationExperience.getEducationExperienceId();
        }
    }

//    @Override
//    @Transactional
//    public void updateJobResumeEducationExperience(JobResumeEducationExperience jobResumeEducationExperience) {
//        jobResumeEducationExperienceRepository.saveAndFlush(jobResumeEducationExperience);
//    }

    @Override
    @Transactional
    public void deleteJobResumeEducationExperience(JobResumeEducationExperience jobResumeEducationExperience) {
        jobResumeEducationExperience.setIsDeleted(1);
        jobResumeEducationExperienceRepository.save(jobResumeEducationExperience);
    }

    @Override
    public List<JobResumeEducationExperience> getJobResumeEducationExperienceList(Integer resumeId) {
       return  jobResumeEducationExperienceRepository.findByResumeId(resumeId);

    }
}
