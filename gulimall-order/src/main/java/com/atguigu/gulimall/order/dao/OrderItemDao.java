package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author zc
 * @email 1027480458@qq.com
 * @date 2024-01-11 16:45:12
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
