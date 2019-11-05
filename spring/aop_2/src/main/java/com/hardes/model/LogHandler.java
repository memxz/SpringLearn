package com.hardes.model;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by DreamBoy on 2018/3/18.
 */
@Aspect
public class LogHandler {
    @Before(value="execution(* com.hardes.User.*(..))")
    public void before() {
        System.out.println("Start Write Log.");
    }

    @After(value="execution(* com.hardes.User.*(..))")
    public void after() {
        System.out.println("End Write Log.");
    }
}