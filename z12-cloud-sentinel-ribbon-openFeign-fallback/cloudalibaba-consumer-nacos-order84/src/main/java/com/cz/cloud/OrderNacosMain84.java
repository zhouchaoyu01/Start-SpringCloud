package com.cz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zhouchaoyu
 * @time 2023-11-12-15:49
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class OrderNacosMain84
{
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(OrderNacosMain84.class, args);
        for (String beanDefinitionName : run.getBeanDefinitionNames()) {
            if(beanDefinitionName.contains("Payment")){
                System.out.println(beanDefinitionName);
            }
        }
    }
}