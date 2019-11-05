package com.hardes.SpringAop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = (Book) applicationContext.getBean("book");
        book.add();
    }
}