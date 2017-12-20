package com.acsm.ytcollege.repository;

import com.acsm.ytcollege.entity.JobResumeEducationExperience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 21:04 2017/12/17
 */
public interface JobResumeEducationExperienceRepository extends JpaRepository<JobResumeEducationExperience,Integer> {
    List<JobResumeEducationExperience> findByResumeId(Integer resumeId);
}
