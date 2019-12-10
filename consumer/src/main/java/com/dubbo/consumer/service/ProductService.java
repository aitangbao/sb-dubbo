package com.dubbo.consumer.service;

import com.provide.order.entity.Order;

public interface ProductService {

    /**
     * 获得总消费
     * @param a
     * @return
     */
    Integer getCost(int a);

    void saveOrder();

}
