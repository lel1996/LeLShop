package com.lierlin.shop.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* 1.����mybatis-plus
*    1)��������
*       2���������ݿ�����
*           3����application.yml��������Դ
*
* */
@MapperScan("com.lierlin.shop.product.dao")
@SpringBootApplication
public class ShopProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopProductApplication.class, args);
    }

}
