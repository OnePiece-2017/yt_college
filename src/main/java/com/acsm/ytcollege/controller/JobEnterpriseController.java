package com.acsm.ytcollege.controller;

import com.acsm.ytcollege.domain.Result;
import com.acsm.ytcollege.dto.request.*;
import com.acsm.ytcollege.service.JobEnterpriseInfoService;
import com.acsm.ytcollege.service.JobPositionService;
import com.acsm.ytcollege.utils.ResultUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 19:26 2017/12/18
 */
@RestController
@RequestMapping(value = "/jobEnterprise")
public class JobEnterpriseController {
    @Autowired
    JobEnterpriseInfoService jobEnterpriseInfoService;

    @Autowired
    JobPositionService jobPositionService;

    @PostMapping("/saveJobEnterpriseInfo")
    @ApiOperation(value = "添加或修改企业基本信息")
    public Result saveJobEnterpriseInfo(@Validated JobEnterpriseParam jobEnterpriseParam){
        return ResultUtil.success(jobEnterpriseInfoService.insertJobEntepriseInfo(jobEnterpriseParam));
    }

    @PostMapping("/saveJobResumeEnterprisePay")
    @ApiOperation(value = "添加或修改支付信息")
    public Result saveJobResumeEnterprisePay(@Validated JobResumeEnterprisePayParam jobResumeEnterprisePayParam){
        jobEnterpriseInfoService.insertJobEnterprisePay(jobResumeEnterprisePayParam);
        return ResultUtil.success();
    }

    @PostMapping("/saveJobPosition")
    @ApiOperation(value = "发布或修改职位")
    public Result saveJobPosition(@Validated JobPositionParam jobPositionParam){
        jobPositionService.insertJobPosition(jobPositionParam);
        return ResultUtil.success();
    }

    @PostMapping("/rePublish")
    @ApiOperation(value = "重新发布职位")
    public Result rePublish(@Validated JobPositionRePublishParam jobPositionRePublishParam){
        jobPositionService.updateJobPositionRePublish(jobPositionRePublishParam);
        return ResultUtil.success();
    }

    @PostMapping("/getJobPositionList")
    @ApiOperation(value = "获取职位列表")
    public Result getJobPositionList(@Validated JobPositionListParam jobPositionListParam){
        return ResultUtil.success(jobPositionService.getJobPositionList(jobPositionListParam));
    }

    @GetMapping("/getJobPositionDetails/{positionId}")
    @ApiOperation(value = "职位详情")
    public Result getJobPositionDetails(@ApiParam(value = "职位信息ID") @PathVariable int positionId){
        return ResultUtil.success(jobPositionService.findJobPositionOne(positionId));
    }
}
