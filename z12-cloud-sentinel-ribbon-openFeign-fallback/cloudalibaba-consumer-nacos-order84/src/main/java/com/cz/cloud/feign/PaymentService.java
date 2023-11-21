package com.cz.cloud.feign;


import com.cz.cloud.CommonResult;
import com.cz.cloud.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @auther zzyy
 * @create 2019-12-10 17:17
 * 使用 fallback 方式是无法获取异常信息的，
 * 如果想要获取异常信息，可以使用 fallbackFactory参数
 */

@FeignClient(value = "nacos-payment-provider", fallbackFactory = PaymentFallbackFactoryService.class, primary = false)//调用中关闭9003服务提供者
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
