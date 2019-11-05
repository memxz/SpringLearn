package com.hardes.model;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void runUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        User user = (User) context.getBean("user");
        user.add();
    }
}