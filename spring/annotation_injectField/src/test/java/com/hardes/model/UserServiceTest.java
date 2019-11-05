package com.hardes.model;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class UserServiceTest
{
    @Test
    public void runUserService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
