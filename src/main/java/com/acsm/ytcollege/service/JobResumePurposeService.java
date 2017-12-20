package com.acsm.ytcollege.service;

import com.acsm.ytcollege.dto.request.JobResumePurposeParam;
import com.acsm.ytcollege.entity.JobResumePurpose;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 21:12 2017/12/17
 */
public interface JobResumePurposeService {
    public JobResumePurpose findJobResumePurposeOne(int jobResumePurposeId);

    public Integer insertJobResumePurpose(JobResumePurposeParam jobResumePurposeParam);

//    public void updateJobResumePurpose(JobResumePurpose jobResumePurpose);

    public void deleteJobResumePurpose(JobResumePurpose jobResumePurpose);

    public JobResumePurpose getJobResumePurpose(Integer jobResumeId);
}
