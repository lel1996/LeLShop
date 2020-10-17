package com.lierlin.shop.coupon;

import com.lierlin.shop.coupon.entity.CouponEntity;
import com.lierlin.shop.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShopCouponApplicationTests {
    @Autowired
    CouponService couponService;
    @Test
    void contextLoads() {
        CouponEntity couponEntity =new CouponEntity();
        couponEntity.setCouponName("lierlin");
        couponService.save(couponEntity);
        System.out.println("coumon is success!");
    }

}
