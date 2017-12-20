package com.acsm.ytcollege.repository;

import com.acsm.ytcollege.entity.JobResume;
import com.acsm.ytcollege.entity.JobResumePurpose;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 21:12 2017/12/17
 */
public interface JobResumePurposeRepository extends JpaRepository<JobResumePurpose,Integer>{
    JobResumePurpose findByResumeId(Integer resumeId);
}
