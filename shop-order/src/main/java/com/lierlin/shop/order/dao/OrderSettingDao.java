package com.lierlin.shop.order.dao;

import com.lierlin.shop.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author lierlin
 * @email 1690480192@qq.com
 * @date 2020-10-17 17:19:31
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
