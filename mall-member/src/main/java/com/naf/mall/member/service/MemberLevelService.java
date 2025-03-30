package com.naf.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.naf.common.utils.PageUtils;
import com.naf.mall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author Fan
 * @email 3366208071@qq.com
 * @date 2025-03-26 17:54:10
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

