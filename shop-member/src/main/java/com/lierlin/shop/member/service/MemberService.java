package com.lierlin.shop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lierlin.common.utils.PageUtils;
import com.lierlin.shop.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author lierlin
 * @email 1690480192@qq.com
 * @date 2020-10-17 17:07:34
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

