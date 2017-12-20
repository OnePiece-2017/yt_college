package com.acsm.ytcollege.service;

import com.acsm.ytcollege.dto.request.JobPositionListParam;
import com.acsm.ytcollege.dto.request.JobPositionParam;
import com.acsm.ytcollege.dto.request.JobPositionRePublishParam;
import com.acsm.ytcollege.entity.EnterprisePosition;
import org.springframework.data.domain.Page;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 22:21 2017/12/17
 */
public interface JobPositionService {
    public EnterprisePosition findJobPositionOne(int JobPositionId);

    public Integer insertJobPosition(JobPositionParam jobPositionParam);

    public void updateJobPositionRePublish(JobPositionRePublishParam jobPositionRePublishParam);

    public void deleteJobPosition(EnterprisePosition enterprisePosition);

    public Page<EnterprisePosition> getJobPositionList(JobPositionListParam jobPositionListParam );
}
