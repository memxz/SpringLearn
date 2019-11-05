package com.hardes;

public class User {
    public void add() {
        System.out.println("User Instance Add Method.");
    }

    @Override
    public String toString() {
        return "This is a user object.";
    }
}