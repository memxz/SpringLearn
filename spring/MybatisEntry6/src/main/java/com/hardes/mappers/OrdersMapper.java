package com.hardes.mappers;

import com.hardes.pojos.OrdersExt;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.util.List;

public interface OrdersMapper {

    List<OrdersExt> findOrdersAndUsersByOid(int i);
}
