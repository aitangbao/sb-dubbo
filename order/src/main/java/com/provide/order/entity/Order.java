package com.provide.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@TableName(value = "t_order")
public class Order implements Serializable {
    private int id;
    private String orderNo;
    private String userId;
    private String commodityCode;
    private int count;
    private BigDecimal amount;

    public Order(){}
}
