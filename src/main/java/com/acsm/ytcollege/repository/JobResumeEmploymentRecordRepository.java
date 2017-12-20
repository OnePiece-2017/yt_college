package com.acsm.ytcollege.repository;

import com.acsm.ytcollege.entity.JobResumeEmploymentRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 20:57 2017/12/17
 */
public interface JobResumeEmploymentRecordRepository extends JpaRepository<JobResumeEmploymentRecord,Integer> {
    List<JobResumeEmploymentRecord> findByResumeId(Integer resumeId);
}
