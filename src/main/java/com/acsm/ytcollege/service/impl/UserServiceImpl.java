package com.acsm.ytcollege.service.impl;

import com.acsm.ytcollege.dto.request.JobUserParam;
import com.acsm.ytcollege.entity.JobUser;
import com.acsm.ytcollege.repository.JobUserRepository;
import com.acsm.ytcollege.service.UserService;
import jdk.nashorn.internal.scripts.JO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by HASEE on 2017/12/16.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private JobUserRepository jobUserRepository;

    @Override
    public JobUser userFindOne(int userId) {
        return jobUserRepository.findOne(userId);
    }

    @Override
    public Integer insertJobUser(JobUserParam jobUserParam) {
        if(null != jobUserParam.getUserId()){
            JobUser jobUser = jobUserRepository.findOne(jobUserParam.getUserId());
            jobUser.setIco(jobUserParam.getIco());
            jobUser.setPhone(jobUserParam.getPhone());
            jobUserRepository.saveAndFlush(jobUser);
            return jobUser.getUserId();
        }else{
            JobUser jobUser = new JobUser();
            jobUser.setIco(jobUserParam.getIco());
            jobUser.setPhone(jobUserParam.getPhone());
            jobUser.setIsDeleted(0);
            jobUserRepository.save(jobUser);
            return jobUser.getUserId();
        }
    }

//    @Override
//    public void updateJobUser(JobUser user) {
//        JobUser jobUser = jobUserRepository.findOne(user.getUserId());
//        jobUser.setIco(user.getIco());
//        jobUser.setPhone(user.getPhone());
//        jobUserRepository.save(jobUser);
//    }

    @Override
    public void deletedJobUser(JobUser jobUser) {

    }
}
