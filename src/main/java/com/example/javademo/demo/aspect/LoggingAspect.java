package com.example.javademo.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // This will apply the advice to all methods in the UserService class
    @Before("execution(* com.example.javademo.demo.Service.UserService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before executing method: " + joinPoint.getSignature().getName());
    }
    @After("execution(* com.example.javademo.demo.Service.UserService.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After executing method: " + joinPoint.getSignature().getName());
    }
}
