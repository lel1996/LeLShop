package com.lierlin.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lierlin.common.utils.PageUtils;
import com.lierlin.shop.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author lierlin
 * @email 1690480192@qq.com
 * @date 2020-10-16 17:09:41
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

