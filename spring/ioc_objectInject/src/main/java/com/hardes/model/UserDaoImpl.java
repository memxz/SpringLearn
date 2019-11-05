package com.hardes.model;


/**
 * 接口UserDao的具体实现
 * Created by DreamBoy on 2018/3/17.
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDaoImpl Add...");
    }
}