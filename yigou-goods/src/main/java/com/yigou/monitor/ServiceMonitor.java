package com.yigou.monitor;

import com.yigou.web.exception.ServerInternalErrorException;
import lombok.extern.apachecommons.CommonsLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * service层监视类
 * Author 川军六十六师
 * Since 2017/6/22 13:23.
 */
@CommonsLog
@Aspect
@Component
public class ServiceMonitor {


    /**
     * A join point is in the service layer if the method is defined
     * in a type in the com.yigou.service package or any sub-package
     * under that.
     */
    @Pointcut("execution(* com.yigou.service..*(..))")
    private void serviceLayer() {
    }

    /**
     * Monitor whether exception is thrown in service layer. If exception
     * has been thrown, in order to detecting it conveniently, log the
     * situation where it happened. Then create a server internal error
     * exception and throw it out.
     */
    @AfterThrowing(pointcut = "com.yigou.monitor.ServiceMonitor.serviceLayer()", throwing = "e")
    public void monitorException(JoinPoint joinPoint, Throwable e) {
        // Log the situation where exception happened
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        log.error("[" + signature.toShortString() + "]" + Arrays.toString(args) + "[" + e.toString() + "]");
        log.error(e.toString(),e);

        // Throw a new server internal error exception
        throw new ServerInternalErrorException();
    }

}
