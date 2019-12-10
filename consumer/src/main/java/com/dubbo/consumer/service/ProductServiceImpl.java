package com.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.provider.service.CostService;
import com.provide.order.entity.Order;
import com.provide.order.service.OrderService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 产品service
 */
@Service
public class ProductServiceImpl implements ProductService {


    /**
     * 使用dubbo的注解 com.alibaba.dubbo.config.annotation.Reference。进行远程调用service
     */
    @Reference
    private CostService costService;

    @Reference
    private OrderService orderService;

    @Override
    public Integer getCost(int a) {
        return costService.add(a);
    }

    @Override
    public void saveOrder() {
        Order order = new Order();
        order.setOrderNo("11");
        order.setCommodityCode("11");
        order.setCount(11);
        order.setUserId("11");
        order.setAmount(BigDecimal.TEN);
        orderService.saveOrder(order);
    }
}

