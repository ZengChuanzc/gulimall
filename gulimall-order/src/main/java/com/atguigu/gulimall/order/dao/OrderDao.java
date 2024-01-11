package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zc
 * @email 1027480458@qq.com
 * @date 2024-01-11 16:45:12
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
