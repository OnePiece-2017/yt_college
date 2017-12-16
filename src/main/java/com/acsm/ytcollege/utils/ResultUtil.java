package com.acsm.ytcollege.utils;


import com.acsm.ytcollege.domain.Result;
import com.acsm.ytcollege.enums.ExceptionEnum;

/**
 * Created by LiYu
 * 2017-06-14 13:39
 */
public class ResultUtil {

    /**
     * 返回成功，传出具体出参
     * @param object
     * @return
     */
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    /**
     * 提供给部分不需要出参的接口
     * @return
     */
    public static Result success() {
        return success(null);
    }


    /**
     * 自定义错误信息
     * @param code
     * @param msg
     * @return
     */
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    /**
     * 返回已知范围的异常信息
     * @param exceptionEnum
     * @return
     */
    public static Result error(ExceptionEnum exceptionEnum){
        Result result = new Result();
        result.setCode(exceptionEnum.getCode());
        result.setMsg(exceptionEnum.getMsg());
        return result;
    }
}
