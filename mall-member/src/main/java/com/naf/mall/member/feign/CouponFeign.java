package com.naf.mall.member.feign;

import com.naf.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public interface CouponFeign {

    @GetMapping("/coupon/coupon/member/list")
     R memberCoupon();
}
