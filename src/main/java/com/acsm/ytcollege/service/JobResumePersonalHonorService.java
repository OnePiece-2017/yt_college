package com.acsm.ytcollege.service;

import com.acsm.ytcollege.dto.request.JobResumePersonalHonorParam;
import com.acsm.ytcollege.entity.JobResumePersonalHonor;

import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 21:41 2017/12/17
 */
public interface JobResumePersonalHonorService {

    public JobResumePersonalHonor findJobResumePersonalHonorOne(int jobResumePersonalHonorId);

    public Integer insertJobResumePersonalHonor(JobResumePersonalHonorParam jobResumePersonalHonorParam);

//    public void updateJobResumePersonalHonor(JobResumePersonalHonor jobResumePersonalHonor);

    public void deleteJobResumePersonalHonor(JobResumePersonalHonor jobResumePersonalHonor);

    public List<JobResumePersonalHonor> getJobResumePersonalHonorList(Integer resumeId);
}
