package com.acsm.ytcollege.controller;

import com.acsm.ytcollege.domain.Result;
import com.acsm.ytcollege.service.UserService;
import com.acsm.ytcollege.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HASEE on 2017/12/16.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Result userFindOne(@PathVariable int id){
        return ResultUtil.success(userService.userFindOne(id));
    }
}
