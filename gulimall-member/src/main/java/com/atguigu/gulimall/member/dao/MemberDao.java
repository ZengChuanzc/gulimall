package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zc
 * @email 1027480458@qq.com
 * @date 2024-01-11 16:18:00
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
