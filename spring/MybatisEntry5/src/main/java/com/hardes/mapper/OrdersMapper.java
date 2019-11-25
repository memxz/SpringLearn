package com.hardes.mapper;

import com.hardes.pojo.Orders;

import java.util.List;

public interface OrdersMapper {

    List<Orders> findOrdersAndUsersByOid(int i);

    List<Orders> findOrdersAndDetailRstMap(int i);
}
