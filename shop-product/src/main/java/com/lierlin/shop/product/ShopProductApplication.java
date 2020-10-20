package com.lierlin.shop.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.SpringVersion;

/*
* 1.整合mybatis-plus
*    1)导入依赖
*       2）导入数据库驱动
*           3）在application.yml配置数据源
*
* */
@MapperScan("com.lierlin.shop.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class ShopProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopProductApplication.class, args);
        String version = SpringVersion.getVersion();
        String version1 = SpringBootVersion.getVersion();
        System.out.println(version+version1);
    }

}
