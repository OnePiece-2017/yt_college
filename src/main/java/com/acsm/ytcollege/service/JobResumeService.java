package com.acsm.ytcollege.service;

import com.acsm.ytcollege.dto.request.JobResumeParam;
import com.acsm.ytcollege.dto.respons.JobResumeDto;
import com.acsm.ytcollege.entity.JobResume;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 20:01 2017/12/17
 */
public interface JobResumeService {
    public JobResume findJobResumeOne(int jobResumeId);

    public Integer insertJobResume(JobResumeParam jobResumeParam);

//    public void updateJobResume(JobResume jobResume);

    public void deleteJobResume(JobResume jobResume);

    public JobResumeDto getJobResumeDetails(Integer jobResumeId);
}
