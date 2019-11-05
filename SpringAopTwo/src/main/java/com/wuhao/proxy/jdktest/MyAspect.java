package com.wuhao.proxy.jdktest;

public class MyAspect {
    public void pre(){
        System.out.println("前");
    }
    public void next(){
        System.out.println("后");
    }
}
