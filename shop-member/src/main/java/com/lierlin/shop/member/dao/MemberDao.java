package com.lierlin.shop.member.dao;

import com.lierlin.shop.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lierlin
 * @email 1690480192@qq.com
 * @date 2020-10-17 17:07:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
