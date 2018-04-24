package com.acsm.traceapi.controller;

import com.acsm.traceapi.domain.Result;
import com.acsm.traceapi.dto.request.BatchTraceCodeParam;
import com.acsm.traceapi.service.TraceCodeService;
import com.acsm.traceapi.utils.ResultUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiYu on 2018/3/26.
 */

@RestController
@RequestMapping("/")
public class TraceController {

    @Autowired
    private TraceCodeService traceCodeService;

    /**
     * 按照批次获取追溯码
     * @return
     */
    @GetMapping("/requestTraceCodesInBatch")
    @ApiOperation("按照批次获取追溯码")
    public Result requestTraceCodesInBatch(@Validated BatchTraceCodeParam batchTraceCodeParam) throws Exception{
        return ResultUtil.success(traceCodeService.requestTraceCodesInBatch(batchTraceCodeParam));
    }

}
