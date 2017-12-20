package com.acsm.ytcollege.service.impl;

import com.acsm.ytcollege.dto.request.JobResumeEmploymentRecordParam;
import com.acsm.ytcollege.entity.JobResumeEmploymentRecord;
import com.acsm.ytcollege.repository.JobResumeEmploymentRecordRepository;
import com.acsm.ytcollege.service.JobResumeEmploymentRecordService;
import com.acsm.ytcollege.utils.DateHelpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 20:54 2017/12/17
 */
@Service
public class JobResumeEmploymentRecordServiceImpl implements JobResumeEmploymentRecordService{

    @Autowired
    JobResumeEmploymentRecordRepository jobResumeEmploymentRecordRepository;

    @Override
    public JobResumeEmploymentRecord findJobResumeEmploymentRecordOne(int jobEmploymentRecordId) {
        return jobResumeEmploymentRecordRepository.findOne(jobEmploymentRecordId);
    }

    @Override
    @Transactional
    public Integer insertJobResumeEmployment(JobResumeEmploymentRecordParam jobResumeEmploymentRecordParam) {
        if(null != jobResumeEmploymentRecordParam.getEmploymentRecordId()){
            JobResumeEmploymentRecord jobResumeEmploymentRecord = jobResumeEmploymentRecordRepository.findOne(jobResumeEmploymentRecordParam.getEmploymentRecordId());
            jobResumeEmploymentRecord.setCompanyName(jobResumeEmploymentRecordParam.getCompanyName());
            jobResumeEmploymentRecord.setBeginTime(DateHelpUtil.strToDatetime(jobResumeEmploymentRecordParam.getBeginTime(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobResumeEmploymentRecord.setEndTime(DateHelpUtil.strToDatetime(jobResumeEmploymentRecordParam.getEndTime(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobResumeEmploymentRecord.setSalaryMinId(jobResumeEmploymentRecordParam.getSalaryMinId());
            jobResumeEmploymentRecord.setSalaryMaxId(jobResumeEmploymentRecordParam.getSalaryMaxId());
            jobResumeEmploymentRecord.setStationId(jobResumeEmploymentRecordParam.getStationId());
            jobResumeEmploymentRecord.setWorkDescribe(jobResumeEmploymentRecordParam.getWorkDescribe());
            jobResumeEmploymentRecordRepository.saveAndFlush(jobResumeEmploymentRecord);
            return jobResumeEmploymentRecord.getEmploymentRecordId();
        }else{
            JobResumeEmploymentRecord jobResumeEmploymentRecord = new JobResumeEmploymentRecord();
            jobResumeEmploymentRecord.setCompanyName(jobResumeEmploymentRecordParam.getCompanyName());
            jobResumeEmploymentRecord.setBeginTime(DateHelpUtil.strToDatetime(jobResumeEmploymentRecordParam.getBeginTime(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobResumeEmploymentRecord.setEndTime(DateHelpUtil.strToDatetime(jobResumeEmploymentRecordParam.getEndTime(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobResumeEmploymentRecord.setSalaryMinId(jobResumeEmploymentRecordParam.getSalaryMinId());
            jobResumeEmploymentRecord.setSalaryMaxId(jobResumeEmploymentRecordParam.getSalaryMaxId());
            jobResumeEmploymentRecord.setStationId(jobResumeEmploymentRecordParam.getStationId());
            jobResumeEmploymentRecord.setWorkDescribe(jobResumeEmploymentRecordParam.getWorkDescribe());
            jobResumeEmploymentRecord.setResumeId(jobResumeEmploymentRecordParam.getResumeId());
            jobResumeEmploymentRecord.setIsDeleted(0);
            jobResumeEmploymentRecordRepository.save(jobResumeEmploymentRecord);
            return jobResumeEmploymentRecord.getEmploymentRecordId();
        }
    }

//    @Override
//    @Transactional
//    public void updateJobResumeEmployment(JobResumeEmploymentRecord jobResumeEmploymentRecord) {
//        jobResumeEmploymentRecordRepository.saveAndFlush(jobResumeEmploymentRecord);
//    }

    @Override
    @Transactional
    public void deleteJobResumeEmployment(JobResumeEmploymentRecord jobResumeEmploymentRecord) {
        jobResumeEmploymentRecord.setIsDeleted(1);
        jobResumeEmploymentRecordRepository.saveAndFlush(jobResumeEmploymentRecord);
    }

    @Override
    public List<JobResumeEmploymentRecord> getJobResumeEmploymentRecordList(Integer resumeId) {
        return jobResumeEmploymentRecordRepository.findByResumeId(resumeId);
    }
}
