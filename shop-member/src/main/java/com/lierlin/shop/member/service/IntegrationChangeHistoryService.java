package com.lierlin.shop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lierlin.common.utils.PageUtils;
import com.lierlin.shop.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author lierlin
 * @email 1690480192@qq.com
 * @date 2020-10-17 17:07:33
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

