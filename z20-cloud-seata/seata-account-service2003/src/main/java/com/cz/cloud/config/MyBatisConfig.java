package com.cz.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhouchaoyu
 * @time 2023-12-10-15:22
 */
@Configuration
@MapperScan({"com.cz.cloud.dao"})
public class MyBatisConfig {
}
