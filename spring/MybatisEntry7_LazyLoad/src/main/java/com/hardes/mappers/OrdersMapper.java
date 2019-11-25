package com.hardes.mappers;

import com.hardes.pojos.Orders;
import com.hardes.pojos.OrdersExt;
import com.hardes.pojos.Users;

import java.util.List;

public interface OrdersMapper {

    List<OrdersExt> findOrdersAndUsersByOid(int i);
    List<Orders> findOrdersAndUserLazyloading();

}
