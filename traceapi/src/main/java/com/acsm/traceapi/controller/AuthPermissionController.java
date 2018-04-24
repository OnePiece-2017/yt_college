package com.acsm.traceapi.controller;

import com.acsm.traceapi.domain.Result;
import com.acsm.traceapi.dto.request.RequestTracePermissionParm;
import com.acsm.traceapi.service.AuthPermissionService;
import com.acsm.traceapi.utils.ResultUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiYu on 2018/4/11.
 */
@RestController
@RequestMapping("/auth")
public class AuthPermissionController {

    @Autowired
    private AuthPermissionService authPermissionService;


    /**
     * 获取平台的appid和appsecret
     * @param requestTracePermissionParm
     * @return
     */
    @GetMapping("/request_permission")
    @ApiOperation("申请平台权限")
    public Result requestTracePermission(@Validated RequestTracePermissionParm requestTracePermissionParm){
        return ResultUtil.success(authPermissionService.requestTracePermission(requestTracePermissionParm));
    }
}
