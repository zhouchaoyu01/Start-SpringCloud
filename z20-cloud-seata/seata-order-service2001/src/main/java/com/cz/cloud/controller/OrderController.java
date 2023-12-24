package com.cz.cloud.controller;

import com.cz.cloud.common.CommonResult;
import com.cz.cloud.entity.Order;
import com.cz.cloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *  http://localhost:2001/order/create?userId=1&productId=1&count=10&money=10
 * @author zhouchaoyu
 * @time 2023-12-10-15:01
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }
}
