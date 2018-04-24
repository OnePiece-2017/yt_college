package com.acsm.traceapi.exception;

import com.acsm.traceapi.domain.Result;
import com.acsm.traceapi.enums.ExceptionEnum;
import com.acsm.traceapi.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by  on 2017/7/3.
 */
@ControllerAdvice
public class ExceptionHandle {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result exceptionGet(Exception e){
        if (e instanceof BindException){
            BindException myException = (BindException) e;
            return ResultUtil.error(ExceptionEnum.ARGUMENT_INVALID_ERROR.getCode(), myException.getMessage());
        }else if (e instanceof BusinessException){
            BusinessException myException = (BusinessException) e;
            return ResultUtil.error(myException.getCode(), myException.getMessage());
        }

        logger.error("【系统异常】{}", e);
        return ResultUtil.error(ExceptionEnum.UNKNOW_ERROR);
    }
}
