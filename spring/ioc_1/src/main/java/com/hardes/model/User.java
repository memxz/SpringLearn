package com.hardes.model;

/**
 * IoC入门案例
 *
 */
public class User {
    public void add() {
        System.out.println("User Add Method.");
    }

    @Override
    public String toString() {
        return "This is a user object.";
    }
}
