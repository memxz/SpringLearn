package com.wuhao.proxy.jdktest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    final static Object creatProxy(final Object us){

        Object obj= Proxy.newProxyInstance(us.getClass(),us.getClass().getInterfaces(), new InvocationHandler(){
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                ms.pre();
                Object obj1=method.invoke(us,args);
                ms.next();
                return obj1;
            }
        });
    return obj;
    }

}
