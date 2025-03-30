package com.naf.mall.order.dao;

import com.naf.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Fan
 * @email 3366208071@qq.com
 * @date 2025-03-26 17:59:00
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
