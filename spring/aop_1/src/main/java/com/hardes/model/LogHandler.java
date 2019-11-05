package com.hardes.model;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogHandler {
    public void before() {
        System.out.println("Start Write Log.");
    }

    public void after() {
        System.out.println("End Write Log.");
    }
    public void around(ProceedingJoinPoint joinPoint) {
        try {
            before();
            joinPoint.proceed();
            after();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
