package com.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.consumer.service.ProductService;
import com.provide.order.entity.Order;
import com.provide.order.service.OrderService;
import com.sun.tools.corba.se.idl.constExpr.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * 产品controller
 */
@RestController
public class ProductController {



    @Autowired
    private ProductService productService;

    /**
     * 添加完 返回总共消费
     * @param a
     * @return
     */
    @RequestMapping("/add")
    public String getCost(int a){
        return "该产品总共消费 ："+productService.getCost(a);
    }

    /**
     * 添加完 返回success
     * @return
     */
    @RequestMapping("/order/add")
    public String orderAdd(){
        productService.saveOrder();
        return "success";
    }


}
