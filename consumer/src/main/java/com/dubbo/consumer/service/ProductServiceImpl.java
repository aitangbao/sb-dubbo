package com.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.service.CostService;
import org.springframework.stereotype.Service;

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

    @Override
    public Integer getCost(int a) {
        return costService.add(a);
    }
}

