package com.wx.modules.book.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.common.utils.PageUtils;
import com.wx.common.utils.Query;
import com.wx.modules.book.dao.BuserDao;
import com.wx.modules.book.entity.BuserEntity;
import com.wx.modules.book.service.BuserService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("buserService")
public class BuserServiceImpl extends ServiceImpl<BuserDao, BuserEntity> implements BuserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BuserEntity> page = this.page(
                new Query<BuserEntity>().getPage(params),
                new QueryWrapper<BuserEntity>()
        );

        return new PageUtils(page);
    }

}