package com.lierlin.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lierlin.common.utils.PageUtils;
import com.lierlin.shop.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author lierlin
 * @email 1690480192@qq.com
 * @date 2020-10-16 17:09:42
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenus(List<Long> asList);
}

