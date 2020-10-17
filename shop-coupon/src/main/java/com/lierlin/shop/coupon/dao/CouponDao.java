package com.lierlin.shop.coupon.dao;

import com.lierlin.shop.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lierlin
 * @email 1690480192@qq.com
 * @date 2020-10-17 16:47:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
