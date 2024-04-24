package com.demospring.demo.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestServiceAspect {

    @Pointcut("within(com.demospring.demo.Controller..*)")
    public void applicationPackagePointcut() {}
    @Before("applicationPackagePointcut()")
    public void beforeMethodExecution(JoinPoint joinPoint) {
        System.out.println("Before executing method: " + joinPoint.getSignature().getName());
    }
    @After("applicationPackagePointcut()")
    public void afterMethodExecution(JoinPoint joinPoint) {
        System.out.println("After executing method: " + joinPoint.getSignature().getName());
    }
    @AfterReturning("applicationPackagePointcut()")
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println("afterReturning called: " + joinPoint.getSignature().getName());
    }

    @AfterThrowing("applicationPackagePointcut()")
    public void afterThrowing(JoinPoint joinPoint) {
        System.out.println("afterThrowing called: " + joinPoint.getSignature().getName());
    }

    @Around("applicationPackagePointcut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {

        Long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        joinPoint.proceed();
        Long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println(timeTaken);

    }
}
