package com.acsm.ytcollege.service.impl;

import com.acsm.ytcollege.entity.JobUser;
import com.acsm.ytcollege.repository.JobUserRepository;
import com.acsm.ytcollege.service.UserService;
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
}
