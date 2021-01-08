package com.wx.modules.book.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wx.common.utils.PageUtils;
import com.wx.modules.book.entity.OrderEntity;

import java.util.Map;

/**
 * @author wangxing
 * @email wangxing@gmail.com
 * @date 2021-01-07 17:29:02
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);

    @Override
    boolean save(OrderEntity entity);
}

