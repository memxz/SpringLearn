package com.hardes.ssm;

import com.hardes.ssm.mapper.PersonMapper;
import com.hardes.ssm.pojo.Person;
import com.hardes.ssm.pojo.PersonExample;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Person_test  {
    @Test
    public void test02(){
    //问题描述：查询出Peron中name中有"zhang"字的记录，模糊查询，使用查询条件(xxxExample)
    //获取applicationContext.xml配置并加载
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    //获取PersonMapper代码对象
    PersonMapper pm = (PersonMapper) ac.getBean("personMapper");
    //封装查询条件的对象在该类(PersonExample)中，所以先构造该对象/
    PersonExample pe=new PersonExample();
    //通过PersonExample的对象获取封装查询条件的对象Criteria
    PersonExample.Criteria c = pe.createCriteria();
    //构建查询条件，这里使用方法将其内部实现封装了，其实做的事情就是在
    //sql语句的where后面加入: and name like "%zhang%"
        c.andUsernameLike("%zhang%");
    //通过pm将查询条件传送进去。
        List<Person> list = pm.selectByExample(pe);
    //查询出name为zhang这条记录
        System.out.println(list.get(0).getUsername());
    }
}




