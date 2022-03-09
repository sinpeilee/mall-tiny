package com.noah.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis配置类
 * Created by Noah on 2022/3/9.
 */
@Configuration
@MapperScan("com.noah.mall.tiny.mbg.mapper")
public class MyBatisConfig {
}
