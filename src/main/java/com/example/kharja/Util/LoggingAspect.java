package com.example.kharja.Util;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.example.kharja.Services.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("I'm in " + name);
    }

    @After("execution(* com.example.kharja.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("I'm in " + name);
    }

    @Around("execution(* com.example.kharja.Controllers.*.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime + " milliseconds.");
        return obj;
    }
}
