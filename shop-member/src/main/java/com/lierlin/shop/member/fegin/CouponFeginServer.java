package com.lierlin.shop.member.fegin;

import com.lierlin.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("shop-coupon")//д��nacos��Ҫ���÷��������
public interface CouponFeginServer {
    @RequestMapping("coupon/coupon/member/list")
    public R test();
}