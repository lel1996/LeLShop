package com.lierlin.shop.product;

import com.lierlin.shop.product.entity.BrandEntity;
import com.lierlin.shop.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ShopProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("lierlin");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
