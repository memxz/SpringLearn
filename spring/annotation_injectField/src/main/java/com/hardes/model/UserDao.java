package com.hardes.model;

import org.springframework.stereotype.Repository;

@Repository(value="userDao")
public class UserDao {

    public void add() {
        System.out.println("UserDao Add Method.");
    }
}