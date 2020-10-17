package com.lierlin.shop.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* 1.整合mybatis-plus
*    1)导入依赖
*       2）导入数据库驱动
*           3）在application.yml配置数据源
*
* */
@MapperScan("com.lierlin.shop.product.dao")
@SpringBootApplication
public class ShopProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopProductApplication.class, args);
    }

}
