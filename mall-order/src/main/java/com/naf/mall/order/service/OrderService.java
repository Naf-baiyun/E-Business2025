package com.naf.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.naf.common.utils.PageUtils;
import com.naf.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author Fan
 * @email 3366208071@qq.com
 * @date 2025-03-26 17:59:00
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

