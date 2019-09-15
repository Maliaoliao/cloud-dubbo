package com.mall.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @description: 启动类
 * @author: mall
 * @date: 2019-09-15 23:18
 **/
@SpringBootApplication
@ImportResource(value = {"classpash:spring/spring-jdbc.xml"})
@MapperScan(basePackages = "com.mall.model.mapper")
@EnableScheduling
public class BootMoreApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootMoreApplication.class);
    }
}
