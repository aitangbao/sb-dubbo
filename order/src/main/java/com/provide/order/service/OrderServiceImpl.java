package com.provide.order.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.provide.order.entity.Order;
import com.provide.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public void saveOrder(Order order){
        orderMapper.insert(order);
    }
}
