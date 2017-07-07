package com.yigou.monitor;

import lombok.extern.apachecommons.CommonsLog;
import org.apache.commons.lang3.time.StopWatch;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * controller层监视类
 * Author 川军六十六师
 * Since 2017/6/22 13:23.
 */
@CommonsLog
@Aspect
@Component
public class PerformanceMonitor {

    /**
     * A join point is in the controller layer if the method is
     * modified by public and defined in a type in the
     * com.yigou.service package or any sub-package under that
     * and modified by public.
     */
    @Pointcut("execution(public * com.yigou.web.controller..*(..))")
    private void controllerLayer() {
    }

    @Before("controllerLayer()")
    public void before(){

        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        /**
         * 解决跨域的问题
         */
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Headers", "content-type");
        response.addHeader("Access-Control-Allow-Credentials", "true");

    }

    /**
     * 监测方法的运行时间控制器层,
     * 以便尽快检测性能问题。
     * 如果运行时间> 1 s,日志是一个错误。否则,需要进行日志记录
     * 作为一个信息。
     * Monitor the elapsed time of method on controller layer, in
     * order to detect performance problems as soon as possible.
     * If elapsed time > 1 s, log it as an error. Otherwise, log it
     * as an info.
     */
    @Around("controllerLayer()")
    public Object monitorElapsedTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // Timing the method in controller layer
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object result = proceedingJoinPoint.proceed();
        stopWatch.stop();

        // Log the elapsed time
        double elapsedTime = stopWatch.getTime() / 1000.0;
        Signature signature = proceedingJoinPoint.getSignature();
        String infoString = "[" + signature.toShortString() + "][Elapsed time: " + elapsedTime + " s]";

        if (elapsedTime > 1) {
            log.error(infoString + "[Note that it's time consuming!]");
        } else {
            log.info(infoString);
        }

        // Return the result
        return result;
    }

}
