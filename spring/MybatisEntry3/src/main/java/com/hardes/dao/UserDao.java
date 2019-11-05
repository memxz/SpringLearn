package com.hardes.dao;

import com.hardes.po.User;

public interface UserDao {

        User findUserById(int id) throws Exception;

        void insertUser(User user) throws Exception;

        void deleteUser(int id) throws Exception;

}
