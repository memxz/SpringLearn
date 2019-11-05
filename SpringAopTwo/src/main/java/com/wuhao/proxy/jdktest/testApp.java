package com.wuhao.proxy.jdktest;

public class testApp {
    @Test
    public void test01() {
        UserService us= new UserService();
        UserService  proxyUs=(UserService)ProxyFactory.createProxy(us);
        ProxyUs.add();
    }
}
