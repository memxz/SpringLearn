package com.hardes;

import com.hardes.mappers.OrdersMapper;
import com.hardes.pojos.Orders;
import com.hardes.pojos.OrdersExt;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestUsers1 {
    @Test
    public void userTest1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        /**
         * 使用resultType作映射,查询订单orders 并关联users的信息
         */
        OrdersMapper ordersmapper= (OrdersMapper) ac.getBean("ordersMapper");

        List<OrdersExt> list = ordersmapper.findOrdersAndUsersByOid(2);

        System.out.println(list);


        /**
         * 使用resultType作映射,lazy loading
         */
        List<Orders> list1 = ordersmapper.findOrdersAndUserLazyloading();

        System.out.println(list1);

    }

}















































