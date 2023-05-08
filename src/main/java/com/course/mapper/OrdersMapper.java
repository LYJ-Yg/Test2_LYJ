package com.course.mapper;

import com.course.pojo.Orders;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.util.List;

public interface OrdersMapper {

   Orders findOrdersById(Orders id);


}
