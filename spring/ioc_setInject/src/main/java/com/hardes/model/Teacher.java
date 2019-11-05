package com.hardes.model;

/**
 * Hello world!
 *
 */
public class Teacher {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}