package com.hardes.dao;

import com.hardes.entity.User;

/**
 * DAO接口,mybatis动态完成Impl
 */
public interface UserDao {

    Integer addUser(User u);

    User findByAppid(String appid);

    User findById(Integer id);

    Integer deleteById(Integer id);
}