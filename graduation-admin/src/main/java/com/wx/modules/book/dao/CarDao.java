package com.wx.modules.book.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wx.modules.book.entity.CarEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author wangxing
 * @email wangxing@gmail.com
 * @date 2021-01-07 17:29:02
 */
@Mapper
public interface CarDao extends BaseMapper<CarEntity> {
	
}
