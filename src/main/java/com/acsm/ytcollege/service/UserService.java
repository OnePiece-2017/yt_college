package com.acsm.ytcollege.service;

import com.acsm.ytcollege.entity.JobUser;
import org.springframework.stereotype.Service;

/**
 * Created by HASEE on 2017/12/16.
 */
public interface UserService {

    public JobUser userFindOne(int userId);
}
