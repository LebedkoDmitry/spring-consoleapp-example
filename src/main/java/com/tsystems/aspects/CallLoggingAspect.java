package com.tsystems.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class CallLoggingAspect {

    @Around("within(com.tsystems.services.*)")
    public void logMethodCall(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.print("Log " + joinPoint);
        joinPoint.proceed();
    }

}
