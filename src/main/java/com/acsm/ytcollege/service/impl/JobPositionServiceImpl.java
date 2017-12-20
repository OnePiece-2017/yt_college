package com.acsm.ytcollege.service.impl;

import com.acsm.ytcollege.dto.request.JobPositionListParam;
import com.acsm.ytcollege.dto.request.JobPositionParam;
import com.acsm.ytcollege.dto.request.JobPositionRePublishParam;
import com.acsm.ytcollege.entity.EnterprisePosition;
import com.acsm.ytcollege.repository.JobEnterprisePositionRepository;
import com.acsm.ytcollege.service.JobPositionService;
import com.acsm.ytcollege.utils.DateHelpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 22:21 2017/12/17
 */
@Service
public class JobPositionServiceImpl implements JobPositionService{
    @Autowired
    JobEnterprisePositionRepository jobEnterprisePositionRepository;

    @Override
    public EnterprisePosition findJobPositionOne(int JobPositionId) {
        return jobEnterprisePositionRepository.findOne(JobPositionId);
    }

    @Override
    public Integer insertJobPosition(JobPositionParam jobPositionParam) {
        if(null != jobPositionParam.getPositionId()){
            EnterprisePosition jobPosition = jobEnterprisePositionRepository.findOne(jobPositionParam.getPositionId());
            jobPosition.setBenefits(jobPositionParam.getBenefits());
            jobPosition.setDegreeId(jobPositionParam.getDegreeId());
            jobPosition.setExperience(jobPositionParam.getExperience());
//            jobPosition.setJobEnterpriseId(jobPositionParam.getJobEnterpriseId());
            jobPosition.setTypesId(jobPositionParam.getJobTypesId());
            jobPosition.setPositionDescribe(jobPositionParam.getPositionDescribe());
            jobPosition.setPositionName(jobPositionParam.getPositionName());
            jobPosition.setRecruitNum(jobPositionParam.getRecruitNum());
            jobPosition.setSalaryMinId(jobPositionParam.getSalaryMinId());
            jobPosition.setSalaryMaxId(jobPositionParam.getSalaryMaxId());
            jobPosition.setState(jobPositionParam.getState());
            jobPosition.setInsertTime(DateHelpUtil.strToDatetime(jobPositionParam.getInsertTime(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobPosition.setExpirationTime(DateHelpUtil.strToDatetime(jobPositionParam.getDueTime(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobPosition.setWorkAddress(jobPositionParam.getWorkAddress());
            jobEnterprisePositionRepository.saveAndFlush(jobPosition);
            return jobPosition.getPositionId();
        }else{
            EnterprisePosition jobPosition = new EnterprisePosition();
            jobPosition.setBenefits(jobPositionParam.getBenefits());
            jobPosition.setDegreeId(jobPositionParam.getDegreeId());
            jobPosition.setExperience(jobPositionParam.getExperience());
            jobPosition.setEnterpriseId(jobPositionParam.getJobEnterpriseId());
            jobPosition.setTypesId(jobPositionParam.getJobTypesId());
            jobPosition.setPositionDescribe(jobPositionParam.getPositionDescribe());
            jobPosition.setPositionName(jobPositionParam.getPositionName());
            jobPosition.setRecruitNum(jobPositionParam.getRecruitNum());
            jobPosition.setSalaryMinId(jobPositionParam.getSalaryMinId());
            jobPosition.setSalaryMaxId(jobPositionParam.getSalaryMaxId());
            jobPosition.setState(jobPositionParam.getState());
            jobPosition.setInsertTime(new Date());
            jobPosition.setInsertTime(DateHelpUtil.strToDatetime(jobPositionParam.getInsertTime(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobPosition.setExpirationTime(DateHelpUtil.strToDatetime(jobPositionParam.getDueTime(),DateHelpUtil.DEFAULT_DATE_FORMATE));
            jobPosition.setWorkAddress(jobPositionParam.getWorkAddress());
            jobPosition.setIsDeleted(0);
            jobEnterprisePositionRepository.save(jobPosition);
            return jobPosition.getPositionId();
        }
    }

    @Override
    @Transactional
    public void updateJobPositionRePublish(JobPositionRePublishParam jobPositionRePublishParam) {
        EnterprisePosition enterprisePosition = jobEnterprisePositionRepository.findOne(jobPositionRePublishParam.getJobPositionId());
        if(null != jobPositionRePublishParam.getExpirationTime()){
            enterprisePosition.setExpirationTime(DateHelpUtil.strToDatetime(jobPositionRePublishParam.getExpirationTime(),DateHelpUtil.DEFAULT_DATE_FORMATE));
        }else{
            enterprisePosition.setExpirationTime(DateHelpUtil.getFetureDate(7));
        }
        jobEnterprisePositionRepository.saveAndFlush(enterprisePosition);
    }

    @Override
    public void deleteJobPosition(EnterprisePosition enterprisePosition) {
        jobEnterprisePositionRepository.save(enterprisePosition);
    }

    @Override
    public Page<EnterprisePosition> getJobPositionList(JobPositionListParam jobPositionListParam ) {
        Sort sort = new Sort(Sort.Direction.DESC,"positionId");
        Pageable pageable = new PageRequest(jobPositionListParam.getPageIndex() - 1, jobPositionListParam.getPageSize(), sort);
        Integer stateDue = 1;
        if(jobPositionListParam.getPositionState() == 0){
           return jobEnterprisePositionRepository.findByEnterpriseIdAndState(jobPositionListParam.getJobEnterpriseId(),jobPositionListParam.getPositionState(),pageable);
        }else if (jobPositionListParam.getPositionState() == 1){
            return jobEnterprisePositionRepository.findByEnterpriseIdAndStateAndExpirationTimeLessThanEqual(jobPositionListParam.getJobEnterpriseId(),jobPositionListParam.getPositionState(),new Date(),pageable);
        }else if(jobPositionListParam.getPositionState() == 2){
            return jobEnterprisePositionRepository.findByEnterpriseIdAndStateAndExpirationTimeGreaterThanEqual(jobPositionListParam.getJobEnterpriseId(),stateDue,new Date(),pageable);
        }
        return null;
    }
}
