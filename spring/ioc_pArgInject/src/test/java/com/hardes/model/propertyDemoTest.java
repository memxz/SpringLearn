package com.hardes.model;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class propertyDemoTest
{
    @Test
    public void runPropertyDemo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        propertyDemo  pd = (propertyDemo) context.getBean("prop");
        System.out.println(pd);
        System.out.println(Arrays.toString(pd.getArrs()));
        System.out.println(pd.getList());
        System.out.println(pd.getMap());
        System.out.println(pd.getProperties());
    }
}
