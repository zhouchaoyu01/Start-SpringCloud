package com.cz.cloud.feign;


import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;



/**
 * @author zhouchaoyu
 * @time 2023-11-12-17:27
 */
@Component
public class PaymentFallbackFactoryService implements FallbackFactory<FallbackWithFactory> {
    @Override
    public FallbackWithFactory create(Throwable cause) {
        return new FallbackWithFactory();
    }
}




