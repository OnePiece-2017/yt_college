package com.acsm.ytcollege.service;

import com.acsm.ytcollege.dto.request.JobSendRecordParam;
import com.acsm.ytcollege.entity.JobSendRecord;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 22:27 2017/12/17
 */
public interface JobSendRecordService {
    public JobSendRecord findJobSendRecordOne(int JobSendRecordId);

    public void insertJobSendRecord(JobSendRecordParam jobSendRecordParam);

    public void updateJobSendRecord(JobSendRecord jobSendRecord);

    public void deleteJobSendRecord(JobSendRecord jobSendRecord);
}
