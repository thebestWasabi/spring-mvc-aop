package com.springmvc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {

    private static final Logger log = LoggerFactory.getLogger(MyLoggingAspect.class);

    @Around("execution(* com.springmvc.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();

        log.info("Begin of " + methodName);
        Object targetMethodResult = proceedingJoinPoint.proceed();
        log.info("End of " + methodName);

        return targetMethodResult;
    }
}
