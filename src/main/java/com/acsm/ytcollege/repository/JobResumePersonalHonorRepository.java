package com.acsm.ytcollege.repository;

import com.acsm.ytcollege.entity.JobResumePersonalHonor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 21:46 2017/12/17
 */
public interface JobResumePersonalHonorRepository extends JpaRepository<JobResumePersonalHonor,Integer>{
    List<JobResumePersonalHonor> findByResumeId(Integer resuleId);
}
