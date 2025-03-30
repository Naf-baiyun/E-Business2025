package com.naf.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.naf.common.utils.PageUtils;
import com.naf.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author Fan
 * @email 3366208071@qq.com
 * @date 2025-03-26 17:59:00
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

