package com.acsm.traceapi.controller;

import com.acsm.traceapi.domain.Result;
import com.acsm.traceapi.service.WeatherService;
import com.acsm.traceapi.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

/**
 * Created by LiYu on 2018/4/23.
 */
@RestController
@RequestMapping("/")
@CrossOrigin
@Api("气象相关接口")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @ApiOperation("获取灾害气象")
    @GetMapping("/disaster")
    public Result getDisasterList() throws ParseException {
        return ResultUtil.success(weatherService.getWeatherDisaster());
    }
}
