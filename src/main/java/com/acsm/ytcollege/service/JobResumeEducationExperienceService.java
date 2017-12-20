package com.acsm.ytcollege.service;

import com.acsm.ytcollege.dto.request.JobResumeEducationExperienceParam;
import com.acsm.ytcollege.entity.JobResumeEducationExperience;

import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 21:04 2017/12/17
 */
public interface JobResumeEducationExperienceService {
    public JobResumeEducationExperience findJobResumeEducationExperienceOne(int jobResumeEducationExperienceId);

    public Integer insertJobResumeEducationExperience(JobResumeEducationExperienceParam jobResumeEducationExperienceParam);

//    public void updateJobResumeEducationExperience(JobResumeEducationExperience jobResumeEducationExperience);

    public void deleteJobResumeEducationExperience(JobResumeEducationExperience jobResumeEducationExperience);

    public List<JobResumeEducationExperience> getJobResumeEducationExperienceList(Integer resumeId);
}
