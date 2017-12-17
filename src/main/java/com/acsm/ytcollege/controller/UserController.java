package com.acsm.ytcollege.controller;

import com.acsm.ytcollege.domain.Result;
import com.acsm.ytcollege.dto.DeliveryProgressDto;
import com.acsm.ytcollege.service.UserService;
import com.acsm.ytcollege.utils.ResultUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by HASEE on 2017/12/16.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    @ApiOperation(value = "查询用户")
    public Result userFindOne(@ApiParam(value = "用户id") @PathVariable int id){
        return ResultUtil.success(userService.userFindOne(id));
    }

    @PostMapping ("/deliveryProgress")
    @ApiOperation(value = "测试dto")
    public Result deliveryProgress(@RequestBody DeliveryProgressDto deliveryProgressDto){
        return ResultUtil.success();
    }
}
