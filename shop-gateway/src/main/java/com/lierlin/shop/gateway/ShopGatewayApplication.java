package com.lierlin.shop.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/*
* 1.开启服务注册发现
* 2.配置nacos注册中心地址* */

@EnableDiscoveryClient//让网关知道其它微服务在哪
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})//网关没有用到数据源，排除与数据源相关的配置
public class ShopGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopGatewayApplication.class, args);
    }

}
