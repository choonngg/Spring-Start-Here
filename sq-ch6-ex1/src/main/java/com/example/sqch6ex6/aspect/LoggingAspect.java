package com.example.sqch6ex4.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(com.example.sqch6ex4.annotation.ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        String methodName = joinPoint.getSignature().getName();
        Object[] argument = joinPoint.getArgs();
        logger.info("Method " + methodName + " with parameters " + Arrays.asList(argument)
                + " will execute");

        Object returnedByMethod = joinPoint.proceed();
        logger.info("Method executed and returned " + returnedByMethod);
        return "FAILED";
    }
}
