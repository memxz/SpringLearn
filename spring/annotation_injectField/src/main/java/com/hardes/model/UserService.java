package com.hardes.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 在Service类中定义UserDao类型的属性，并使用注解完成对象的注入
 * @Autowired：自动注入或自动装配，是根据类名去找到类对应的对象来完成注入的。
 *
 * @Autowired
 * private UserDao userDao;
 * 1
 * 2
 * 或者 @Resource
 *
 * @Resource(name="userDao")
 * private UserDao userDao;
 *
 */

@Service(value="userService")
public class UserService {
    @Autowired
    private UserDao userDao;
    public void add() {
        System.out.println("UserService Add Method.");
        userDao.add();
    }
}