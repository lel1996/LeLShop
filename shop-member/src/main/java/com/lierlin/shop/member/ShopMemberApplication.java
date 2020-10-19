package com.lierlin.shop.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.lierlin.shop.member.dao")
@EnableFeignClients(basePackages = "com.lierlin.shop.member.fegin")
@EnableDiscoveryClient
@SpringBootApplication
public class ShopMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopMemberApplication.class, args);
    }

}
