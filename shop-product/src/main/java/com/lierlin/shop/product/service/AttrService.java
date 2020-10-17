package com.lierlin.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lierlin.common.utils.PageUtils;
import com.lierlin.shop.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author lierlin
 * @email 1690480192@qq.com
 * @date 2020-10-16 17:09:42
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

