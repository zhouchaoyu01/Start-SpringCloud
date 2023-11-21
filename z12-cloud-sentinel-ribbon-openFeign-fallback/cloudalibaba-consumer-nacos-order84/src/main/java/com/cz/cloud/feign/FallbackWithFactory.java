package com.cz.cloud.feign;

import com.cz.cloud.CommonResult;
import com.cz.cloud.Payment;

/**
 * @author zhouchaoyu
 * @time 2023-11-21-21:32
 */
public class FallbackWithFactory implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回,没有该流水信息", new Payment(id, "errorSerial......"));
    }
}