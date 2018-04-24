package com.acsm.traceapi.controller;

import com.acsm.traceapi.domain.Result;
import com.acsm.traceapi.dto.request.CommodityParam;
import com.acsm.traceapi.dto.request.FilterParam;
import com.acsm.traceapi.dto.response.CommodityDto;
import com.acsm.traceapi.service.CommodityService;
import com.acsm.traceapi.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by LiYu on 2018/4/12.
 */
@RestController
@RequestMapping("/commodity")
@CrossOrigin
@Api("商品相关")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    @ApiOperation("上传货品内容")
    @PostMapping("/submit")
    public Result submitCommodityInfo(@Validated CommodityParam commodityParam) throws Exception{
        return ResultUtil.success();
    }


    @ApiOperation("获取商品列表（含搜索条件）")
    @GetMapping("/list")
    public Result getCommodityList(FilterParam filterParam){
        return ResultUtil.success(commodityService.getCommodityList(filterParam));
    }

    @ApiOperation("根据追溯码查询商品追溯信息")
    @GetMapping("/trace/{traceCode}")
    public Result getTraceNodeByTraceCode(@PathVariable("traceCode") String traceCode){
        return ResultUtil.success(commodityService.getTraceNodeByTraceCode(traceCode));
    }


    /*@ApiOperation("根据溯源码搜索")
    @GetMapping("/trace/search")
    public Result searchCommodity(@Validated FilterParam filterParam){
        return ResultUtil.success(commodityService.searchCommodity(filterParam));
    }*/

}
