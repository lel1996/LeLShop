package com.lierlin.shop.order.dao;

import com.lierlin.shop.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lierlin
 * @email 1690480192@qq.com
 * @date 2020-10-17 17:19:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
