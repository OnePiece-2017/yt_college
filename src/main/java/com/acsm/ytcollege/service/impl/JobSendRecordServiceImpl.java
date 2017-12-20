package com.acsm.ytcollege.service.impl;

import com.acsm.ytcollege.dto.request.JobSendRecordParam;
import com.acsm.ytcollege.entity.JobSendRecord;
import com.acsm.ytcollege.repository.JobSendRecordRepository;
import com.acsm.ytcollege.service.JobSendRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 22:28 2017/12/17
 */
@Service
public class JobSendRecordServiceImpl implements JobSendRecordService{
    @Autowired
    JobSendRecordRepository jobSendRecordRepository;
    @Override
    public JobSendRecord findJobSendRecordOne(int JobSendRecordId) {
        return null;
    }

    @Override
    public void insertJobSendRecord(JobSendRecordParam jobSendRecordParam) {
        JobSendRecord jobSendRecord = new JobSendRecord();
        jobSendRecord.setResumeId(jobSendRecordParam.getResumeId());
        jobSendRecord.setInsertTime(new Date());
        jobSendRecord.setPositionId(jobSendRecordParam.getPositionId());
        jobSendRecord.setSendTime(new Date());
        jobSendRecord.setState(0);
        jobSendRecordRepository.save(jobSendRecord);
    }

    @Override
    public void updateJobSendRecord(JobSendRecord jobSendRecord) {

    }

    @Override
    public void deleteJobSendRecord(JobSendRecord jobSendRecord) {

    }
}
