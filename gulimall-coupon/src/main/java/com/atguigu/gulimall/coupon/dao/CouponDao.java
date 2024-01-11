package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zc
 * @email 1027480458@qq.com
 * @date 2024-01-10 17:22:20
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
