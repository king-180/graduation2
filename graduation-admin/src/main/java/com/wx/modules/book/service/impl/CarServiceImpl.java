package com.wx.modules.book.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.common.utils.PageUtils;
import com.wx.common.utils.Query;
import com.wx.modules.book.dao.CarDao;
import com.wx.modules.book.entity.CarEntity;
import com.wx.modules.book.service.CarService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("carService")
public class CarServiceImpl extends ServiceImpl<CarDao, CarEntity> implements CarService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CarEntity> page = this.page(
                new Query<CarEntity>().getPage(params),
                new QueryWrapper<CarEntity>()
        );

        return new PageUtils(page);
    }

}