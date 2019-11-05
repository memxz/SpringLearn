package com.hardes.model;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class TestAop_2 {
    @Test
    public void runUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopanno.xml");
        User user = (User) context.getBean("user");
        user.add();
    }
}