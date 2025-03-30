package com.naf.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.naf.common.utils.PageUtils;
import com.naf.mall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author Fan
 * @email 3366208071@qq.com
 * @date 2025-03-19 17:26:05
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

