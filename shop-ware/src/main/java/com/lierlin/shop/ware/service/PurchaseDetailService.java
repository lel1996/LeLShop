package com.lierlin.shop.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lierlin.common.utils.PageUtils;
import com.lierlin.shop.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author lierlin
 * @email 1690480192@qq.com
 * @date 2020-10-17 17:27:48
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

