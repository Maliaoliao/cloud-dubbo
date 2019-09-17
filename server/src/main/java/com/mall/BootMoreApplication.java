package com.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


/**
 * @description: 启动类
 * @author: mall
 * @date: 2019-09-15 23:18
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan(basePackages = "com.mall.model.mapper")
public class BootMoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMoreApplication.class, args);
    }
}
