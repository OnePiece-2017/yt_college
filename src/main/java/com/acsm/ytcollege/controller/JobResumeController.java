package com.acsm.ytcollege.controller;

import com.acsm.ytcollege.domain.Result;
import com.acsm.ytcollege.dto.request.*;
import com.acsm.ytcollege.dto.respons.JobResumeDto;
import com.acsm.ytcollege.entity.*;
import com.acsm.ytcollege.service.*;
import com.acsm.ytcollege.utils.ResultUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 14:59 2017/12/18
 */
@RestController
@RequestMapping(value = "/jobResume")
public class JobResumeController {
    @Autowired
    JobResumeService jobResumeService;

    @Autowired
    JobEnterpriseInfoService jobEnterpriseInfoService;

    @Autowired
    JobResumeEducationExperienceService jobResumeEducationExperienceService;

    @Autowired
    JobResumeEmploymentRecordService jobResumeEmploymentRecordService;

    @Autowired
    JobResumePersonalHonorService jobResumePersonalHonorService;

    @Autowired
    JobResumePurposeService jobResumePurposeService;

    @Autowired
    JobSendRecordService jobSendRecordService;

    @GetMapping("/getJobResume/{jobResumeId}")
    @ApiOperation(value = "获取简历信息")
    public Result getJobResume(@ApiParam(value = "简历信息id") @PathVariable int jobResumeId){
        JobResumeDto jobResumeDto = jobResumeService.getJobResumeDetails(jobResumeId);
        return ResultUtil.success(jobResumeDto);
    }


    @PostMapping("/saveResume")
    @ApiOperation(value = "添加或修改简历基本信息")
    public Result saveJobResume(@Validated JobResumeParam jobResumeParam){
        return ResultUtil.success(jobResumeService.insertJobResume(jobResumeParam));
    }

    @GetMapping("/deletedResume/{jobResumeId}")
    @ApiOperation(value = "删除简历信息")
    public Result deletedJobResume(@ApiParam(value = "简历信息id") @PathVariable int jobResumeId){
        JobResume jobResume = jobResumeService.findJobResumeOne(jobResumeId);
        jobResumeService.deleteJobResume(jobResume);
        return ResultUtil.success();
    }

    @PostMapping("/saveResumeEmploymentRecord")
    @ApiOperation(value = "添加或修改工作经历/实习经历")
    public Result saveJobResumeEmploymentRecord(@Validated JobResumeEmploymentRecordParam jobResumeEmploymentRecordParam){
        return ResultUtil.success(jobResumeEmploymentRecordService.insertJobResumeEmployment(jobResumeEmploymentRecordParam));
    }

    @GetMapping("/deletedResumeEmploymentRecord/{jobResumeEmploymentRecordId}")
    @ApiOperation(value = "删除工作经历/实习经历")
    public Result deletedJobResumeEmploymentRecord(@ApiParam(value = "工作经历/实习经历id") @PathVariable int jobResumeEmploymentRecordId){
        JobResumeEmploymentRecord jobResumeEmploymentRecord = jobResumeEmploymentRecordService.findJobResumeEmploymentRecordOne(jobResumeEmploymentRecordId);
        jobResumeEmploymentRecordService.deleteJobResumeEmployment(jobResumeEmploymentRecord);
        return ResultUtil.success();
    }

    @PostMapping("/saveJobResumeEducationExperience")
    @ApiOperation(value = "添加或编辑教育背景")
    public Result saveJobResumeEducationExperience(@Validated JobResumeEducationExperienceParam jobResumeEducationExperienceParam){
        return ResultUtil.success(jobResumeEducationExperienceService.insertJobResumeEducationExperience(jobResumeEducationExperienceParam));
    }

    @GetMapping("/deletedJobResumeEducationExperience/{jobResumeEducationExperienceId}")
    @ApiOperation(value = "删除教育背景")
    public Result deletedJobResumeEducationExperience(@ApiParam(value = "教育背景id") @PathVariable int jobResumeEducationExperienceId){
        JobResumeEducationExperience jobResumeEducationExperience = jobResumeEducationExperienceService.findJobResumeEducationExperienceOne(jobResumeEducationExperienceId);
        jobResumeEducationExperienceService.deleteJobResumeEducationExperience(jobResumeEducationExperience);
        return ResultUtil.success();
    }

    @PostMapping("/saveJobResumePurpose")
    @ApiOperation(value = "添加或编辑求职意向")
    public Result saveJobResumePurpose(@Validated JobResumePurposeParam jobResumePurposeParam){
        return ResultUtil.success(jobResumePurposeService.insertJobResumePurpose(jobResumePurposeParam));
    }

    @GetMapping("/deletedJobResumePurpose/{JobResumePurposeId}")
    @ApiOperation(value = "删除求职意向")
    public Result deletedJobResumePurpose(@ApiParam(value = "求职意向id") @PathVariable int JobResumePurposeId){
        JobResumePurpose jobResumePurpose = jobResumePurposeService.findJobResumePurposeOne(JobResumePurposeId);
        jobResumePurposeService.deleteJobResumePurpose(jobResumePurpose);
        return ResultUtil.success();
    }

    @PostMapping("/saveJobResumePersonalHonor")
    @ApiOperation(value = "添加或编辑个人荣誉")
    public Result saveJobResumePersonalHonor(@Validated JobResumePersonalHonorParam jobResumePersonalHonorParam){
        return ResultUtil.success(jobResumePersonalHonorService.insertJobResumePersonalHonor(jobResumePersonalHonorParam));
    }

    @GetMapping("/deletedJobResumePersonalHonor/{JobResumePersonalHonorId}")
    @ApiOperation(value = "删除个人荣誉")
    public Result deletedJobResumePersonalHonor(@ApiParam(value = "求职意向id") @PathVariable int jobResumePersonalHonor){
        JobResumePersonalHonor jobResumePersonalHonor1 = jobResumePersonalHonorService.findJobResumePersonalHonorOne(jobResumePersonalHonor);
        jobResumePersonalHonorService.deleteJobResumePersonalHonor(jobResumePersonalHonor1);
        return ResultUtil.success();
    }
}
