package com.hardes.ssm.test;

import com.hardes.ssm.mapper.PersonMapper;
import com.hardes.ssm.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Person_test {
    @Test
    public void test01(){
        ApplicationContext  ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonMapper pm= (PersonMapper) ac.getBean("personMapper");
        Person person =pm.selectByPrimaryKey(112);
        System.out.println(person.getUsername());
    }

}
