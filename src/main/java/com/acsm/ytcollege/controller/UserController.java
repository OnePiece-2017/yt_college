package com.acsm.ytcollege.controller;

import com.acsm.ytcollege.domain.Result;
import com.acsm.ytcollege.dto.request.DeliveryProgressDto;
import com.acsm.ytcollege.dto.request.JobResumeParam;
import com.acsm.ytcollege.dto.request.JobSendRecordParam;
import com.acsm.ytcollege.dto.request.JobUserParam;
import com.acsm.ytcollege.entity.JobSendRecord;
import com.acsm.ytcollege.entity.JobUser;
import com.acsm.ytcollege.service.JobSendRecordService;
import com.acsm.ytcollege.service.UserService;
import com.acsm.ytcollege.utils.ResultUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by LiYu on 2017/12/16.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    JobSendRecordService jobSendRecordService;

    @GetMapping("/{id}")
    @ApiOperation(value = "查询用户")
    public Result userFindOne(@ApiParam(value = "用户id") @PathVariable int id){
        return ResultUtil.success(userService.userFindOne(id));
    }

    @PostMapping("/saveJobResumeUser")
    @ApiOperation(value = "添加或修改用户信息")
    public Result saveJobResumeUser(@Validated JobUserParam jobUserParam){
        return ResultUtil.success(userService.insertJobUser(jobUserParam));
    }

    @PostMapping("/saveJobSendRecord")
    @ApiOperation(value = "添加投递信息")
    public Result saveJobSendRecord(@Validated JobSendRecordParam jobSendRecordParam){
        jobSendRecordService.insertJobSendRecord(jobSendRecordParam);
        return ResultUtil.success();
    }
//    @GetMapping ("/deliveryProgress")
//    @ApiOperation(value = "测试dto")
//    public Result deliveryProgress(@Validated DeliveryProgressDto deliveryProgressDto){
//        return ResultUtil.success();
//    }

}
