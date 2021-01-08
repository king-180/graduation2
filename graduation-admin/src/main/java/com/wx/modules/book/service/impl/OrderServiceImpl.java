package com.wx.modules.book.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.common.utils.PageUtils;
import com.wx.common.utils.Query;
import com.wx.modules.book.dao.OrderDao;
import com.wx.modules.book.entity.OrderEntity;
import com.wx.modules.book.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.UUID;


@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderDao, OrderEntity> implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderEntity> page = this.page(
                new Query<OrderEntity>().getPage(params),
                new QueryWrapper<OrderEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public boolean save(OrderEntity entity) {
        String id = UUID.randomUUID().toString().substring(0, 20);
        entity.setId(id);
        Date createTime = new Date();
        entity.setCreateTime(createTime);
        entity.setIsDelete(0);
        log.debug("entity --> " + entity);
        int result = orderDao.insert(entity);
        return result > 0;
    }

}