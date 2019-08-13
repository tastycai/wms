package com.zl.wms.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthAspect {

    @Around("execution(* com.zl.wms.controller..*(..))")
    public Object arroundMethod(ProceedingJoinPoint pjp){

        String methodName = pjp.getSignature().getName();

        System.out.println(methodName);
        try {

            return pjp.proceed();

        }catch (Throwable e){

        }

        return null;
    }
}
