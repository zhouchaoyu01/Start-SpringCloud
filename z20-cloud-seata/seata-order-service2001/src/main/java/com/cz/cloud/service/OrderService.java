package com.cz.cloud.service;

import com.cz.cloud.entity.Order;

/**
 * @author zhouchaoyu
 * @time 2023-12-10-14:59
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
