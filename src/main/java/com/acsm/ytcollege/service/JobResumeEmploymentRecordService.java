package com.acsm.ytcollege.service;

import com.acsm.ytcollege.dto.request.JobResumeEmploymentRecordParam;
import com.acsm.ytcollege.entity.JobResumeEmploymentRecord;

import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 20:59 2017/12/17
 */
public interface JobResumeEmploymentRecordService {

    public JobResumeEmploymentRecord findJobResumeEmploymentRecordOne(int jobEmploymentRecordId);

    public Integer insertJobResumeEmployment(JobResumeEmploymentRecordParam jobResumeEmploymentRecordParam);

//    public void updateJobResumeEmployment(JobResumeEmploymentRecord jobResumeEmploymentRecord);

    public void deleteJobResumeEmployment(JobResumeEmploymentRecord jobResumeEmploymentRecord);

    public List<JobResumeEmploymentRecord> getJobResumeEmploymentRecordList(Integer resumeId);
}
