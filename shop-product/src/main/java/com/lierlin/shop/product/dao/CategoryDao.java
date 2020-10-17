package com.lierlin.shop.product.dao;

import com.lierlin.shop.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lierlin
 * @email 1690480192@qq.com
 * @date 2020-10-16 17:09:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
