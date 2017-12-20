package com.acsm.ytcollege.controller;

import com.acsm.ytcollege.domain.Result;
import com.acsm.ytcollege.dto.respons.JobResumeDto;
import com.acsm.ytcollege.entity.DataDicItem;
import com.acsm.ytcollege.service.DataDicItemService;
import com.acsm.ytcollege.service.DataDicService;
import com.acsm.ytcollege.utils.ResultUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 16:53 2017/12/19
 */
@RestController
@RequestMapping(value = "/dataDic")
public class DataDicController {
    @Autowired
    DataDicService dataDicService;

    @Autowired
    DataDicItemService dataDicItemService;

    @GetMapping("/getJobPositionTypeList/")
    @ApiOperation(value = "获取职位类型")
    public Result getJobPosition(){
        return ResultUtil.success(dataDicService.getPositionTypeList());
    }

    @GetMapping("/getDegreeTypeList/")
    @ApiOperation(value = "获取学位")
    public Result getDegreeTypeList(){
        return ResultUtil.success(dataDicItemService.getDegreeTypeList());
    }

    @GetMapping("/getSocialBenefitsTypeList/")
    @ApiOperation(value = "获取福利待遇")
    public Result getSocialBenefitsTypeList(){
        return ResultUtil.success(dataDicItemService.getSocialBenefitsTypeList());
    }

    @GetMapping("/getSalaryMinTypeList/")
    @ApiOperation(value = "获取薪酬下限")
    public Result getSalaryMinTypeList(){
        return ResultUtil.success(dataDicItemService.getSalaryMinTypeList());
    }

    @GetMapping("/getSalaryMaxTypeList/")
    @ApiOperation(value = "获取薪酬上限")
    public Result getSalaryMaxTypeList(){
        return ResultUtil.success(dataDicItemService.getSalaryMaxTypeList());
    }

    @GetMapping("/getExperienceList/")
    @ApiOperation(value = "获取工作经验")
    public Result getExperienceList(){
        return ResultUtil.success(dataDicItemService.getExperienceList());
    }
}
