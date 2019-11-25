package com.hardes;

import com.hardes.mapper.OrdersMapper;
import com.hardes.mapper.UsersMapper;
import com.hardes.pojo.Orders;
import com.hardes.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class TestUsers {
    @Test
    public void userTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        /**
         * 使用resultMap作映射,查询订单orders 并关联users的信息  一对一
         */
        OrdersMapper ordersmapper= (OrdersMapper) ac.getBean("ordersMapper");
        List<Orders> list= ordersmapper.findOrdersAndUsersByOid(1);
        System.out.println(list);

        /**
         * 使用resultMap作映射,查询订单orders 并关联users和orders_detail的信息  一对多
         */
        List<Orders> list3= ordersmapper.findOrdersAndDetailRstMap(1);
        System.out.println(list3);


        /**
         * 使用resultMap作映射,查询users，并关联orders数据,在通过orders关联Orders_detail，Items 多对多
         */
        UsersMapper usersmapper= (UsersMapper) ac.getBean("usersMapper");
        List<Users> list1= usersmapper.findOrdersAndUsersByOid1();
        System.out.println(list1);
    }




}















































