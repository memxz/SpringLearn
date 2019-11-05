package com.hardes.model;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class UserServiceTest {
    @Test
    public void runUserService() {
        // 1. 加载Spring配置文件，根据创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        // 2. 得到配置创建的对象
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}