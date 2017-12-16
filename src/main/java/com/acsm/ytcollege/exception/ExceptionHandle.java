package com.acsm.ytcollege.exception;

import com.acsm.ytcollege.domain.Result;
import com.acsm.ytcollege.enums.ExceptionEnum;
import com.acsm.ytcollege.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Liyu on 2017/7/3.
 */
@ControllerAdvice
public class ExceptionHandle {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result exceptionGet(Exception e){
        /*if (e instanceof BusinessException){
            BusinessException myException = (BusinessException) e;
            return ResultUtil.error(myException.getCode(), myException.getMessage());
        }else if (e instanceof InterfaceException){
            InterfaceException myException = (InterfaceException) e;
            return ResultUtil.error(myException.getCode(), myException.getMessage());
        }*/

        logger.error("【系统异常】{}", e);
        return ResultUtil.error(ExceptionEnum.UNKNOW_ERROR);
    }
}
