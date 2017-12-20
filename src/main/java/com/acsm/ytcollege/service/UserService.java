package com.acsm.ytcollege.service;

import com.acsm.ytcollege.dto.request.JobUserParam;
import com.acsm.ytcollege.entity.JobUser;
import org.springframework.stereotype.Service;

/**
 * Created by HASEE on 2017/12/16.
 */
public interface UserService {

    public JobUser userFindOne(int userId);

    public Integer insertJobUser(JobUserParam jobUserParam);

//    public void updateJobUser(JobUser jobUser);

    public void deletedJobUser(JobUser jobUser);
}
