package cn.itcast.order.client;

import cn.itcast.order.config.DefaultFeignConfiguration;
import cn.itcast.order.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @time 2022-12-22-20:09
 */
//局部生效
@FeignClient(value = "userservice", configuration = DefaultFeignConfiguration.class)
//@FeignClient("userservice")
public interface UserClient {
    /**
     * 此处必须和controller一致
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}
