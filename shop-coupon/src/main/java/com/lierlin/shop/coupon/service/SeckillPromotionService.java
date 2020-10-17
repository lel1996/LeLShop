package com.lierlin.shop.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lierlin.common.utils.PageUtils;
import com.lierlin.shop.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author lierlin
 * @email 1690480192@qq.com
 * @date 2020-10-17 16:47:46
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

