package com.naf.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.naf.common.utils.PageUtils;
import com.naf.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author Fan
 * @email 3366208071@qq.com
 * @date 2025-03-26 17:54:11
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

