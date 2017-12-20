package com.acsm.ytcollege.service.impl;

import com.acsm.ytcollege.dto.request.JobResumeParam;
import com.acsm.ytcollege.dto.respons.JobResumeDto;
import com.acsm.ytcollege.entity.JobResume;
import com.acsm.ytcollege.entity.JobResumeEmploymentRecord;
import com.acsm.ytcollege.entity.JobResumePersonalHonor;
import com.acsm.ytcollege.repository.JobResumeRepository;
import com.acsm.ytcollege.service.*;
import com.acsm.ytcollege.utils.DateHelpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 20:05 2017/12/17
 */
@Service
public class JobResumeServiceImpl implements JobResumeService {
    @Autowired
    JobResumeRepository jobResumeRepository;

    @Autowired
    JobResumePurposeService jobResumePurposeService;

    @Autowired
    JobResumeEducationExperienceService jobResumeEducationExperienceService;

    @Autowired
    JobResumePersonalHonorService jobResumePersonalHonorService;

    @Autowired
    JobResumeEmploymentRecordService jobResumeEmploymentRecordService;

    @Override
    public JobResume findJobResumeOne(int jobResumeId) {
        return jobResumeRepository.findOne(jobResumeId);
    }

    @Override
    @Transactional
    public Integer insertJobResume(JobResumeParam jobResumeParam) {
        if(null != jobResumeParam.getResumeId()){
            JobResume jobResume = jobResumeRepository.findOne(jobResumeParam.getResumeId());
            jobResume.setResumeName(jobResumeParam.getResumeName());
            jobResume.setFullName(jobResume.getFullName());
            jobResume.setEmail(jobResumeParam.getEmail());
            jobResume.setIco(jobResumeParam.getIco());
            jobResume.setLivingCityId(jobResumeParam.getLivingCityId());
            jobResume.setSelfEvaluation(jobResumeParam.getSelfEvaluation());
            jobResume.setSex(jobResumeParam.getSex());
            jobResume.setBirthdate(DateHelpUtil.strToDatetime(jobResumeParam.getBirthdate(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobResume.setTimeToWork(DateHelpUtil.strToDatetime(jobResumeParam.getTimeToWork(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobResume.setUserId(jobResumeParam.getUserId());
            jobResume.setIsDeleted(0);
            jobResumeRepository.saveAndFlush(jobResume);
            return jobResume.getResumeId();
        }else{
            JobResume jobResume = new JobResume();
            jobResume.setResumeName(jobResumeParam.getResumeName());
            jobResume.setFullName(jobResume.getFullName());
            jobResume.setEmail(jobResumeParam.getEmail());
            jobResume.setIco(jobResumeParam.getIco());
            jobResume.setLivingCityId(jobResumeParam.getLivingCityId());
            jobResume.setSelfEvaluation(jobResumeParam.getSelfEvaluation());
            jobResume.setSex(jobResumeParam.getSex());
            jobResume.setBirthdate(DateHelpUtil.strToDatetime(jobResumeParam.getBirthdate(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobResume.setTimeToWork(DateHelpUtil.strToDatetime(jobResumeParam.getTimeToWork(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobResume.setUserId(jobResumeParam.getUserId());
            jobResume.setIsDeleted(0);
            jobResumeRepository.save(jobResume);
            return jobResume.getResumeId();
        }
    }

//    @Override
//    @Transactional
//    public void updateJobResume(JobResume jobResume) {
//        jobResumeRepository.saveAndFlush(jobResume);
//    }

    @Override
    @Transactional
    public void deleteJobResume(JobResume jobResume) {
        jobResume.setIsDeleted(1);
        jobResumeRepository.saveAndFlush(jobResume);
    }

    @Override
    public JobResumeDto getJobResumeDetails(Integer jobResumeId) {
        JobResume jobResume = jobResumeRepository.findOne(jobResumeId);
        JobResumeDto jobResumeDto = new JobResumeDto();
        jobResumeDto.setBirthdate(jobResume.getBirthdate());
        jobResumeDto.setEmail(jobResume.getEmail());
        jobResumeDto.setFullName(jobResume.getFullName());
        jobResumeDto.setIco(jobResume.getIco());
        jobResumeDto.setLivingCityId(jobResume.getLivingCityId());
        jobResumeDto.setResidentCityId(jobResume.getResidentCityId());
        jobResumeDto.setResumeId(jobResume.getResumeId());
        jobResumeDto.setResumeName(jobResume.getResumeName());
        jobResumeDto.setSelfEvaluation(jobResume.getSelfEvaluation());
        jobResumeDto.setSex(jobResume.getSex());
        jobResumeDto.setTimeToWork(jobResume.getTimeToWork());
        jobResumeDto.setUserId(jobResume.getUserId());
        //求职信息
        jobResumeDto.setJobResumePurpose(jobResumePurposeService.getJobResumePurpose(jobResumeId));
        //教育信息
        jobResumeDto.setJobResumeEducationExperienceList(jobResumeEducationExperienceService.getJobResumeEducationExperienceList(jobResumeId));
        //工作经历
        jobResumeDto.setJobResumeEmploymentRecordList(jobResumeEmploymentRecordService.getJobResumeEmploymentRecordList(jobResumeId));
        //个人荣誉
        jobResumeDto.setJobResumePersonalHonorList(jobResumePersonalHonorService.getJobResumePersonalHonorList(jobResumeId));
        return jobResumeDto;
    }
}
