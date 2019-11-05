package com.hardes.mapper;


import com.hardes.po.User;

import java.util.List;

/**
 *
 */
public interface UserMapper {
    User findUserById(int id) throws Exception;

    List<User> findUserByName(String name) throws Exception;

    void insertUser(User user) throws Exception;

    void deleteUser(int id) throws Exception;
}