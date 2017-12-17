package com.acsm.ytcollege.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Liyu on 2017/12/17.
 */
@Aspect
@Component
public class LogAspect {

    private final static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Around("execution(* com.acsm.ytcollege.controller.*.*(..))")
    public Object handleControllerLog(ProceedingJoinPoint pjp) throws Throwable {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //参数获取
        Object[] args = pjp.getArgs();
        for (Object arg : args){
            logger.info("arg={}" + arg);
        }
        logger.info("kind={}", pjp.getKind());

        //获取controller rest url
        logger.info("url={}", request.getRequestURL());

        //method
//        logger.info("method={}", request.getMethod());

        //ip
        logger.info("ip={}", request.getRemoteAddr());

        //类方法
        logger.info("class_method={}", pjp.getSignature().getDeclaringTypeName() + "." + pjp.getSignature().getName());

        long start = new Date().getTime();
        Object object = pjp.proceed();
        logger.info("耗时： " + (new Date().getTime() - start) + "ms");
        return object;
    }
}
