package com.naf.mall.member.dao;

import com.naf.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Fan
 * @email 3366208071@qq.com
 * @date 2025-03-26 17:54:11
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
