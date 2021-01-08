package com.wx.modules.book.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wx.common.utils.PageUtils;
import com.wx.modules.book.entity.BuserEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-01-07 19:20:02
 */
public interface BuserService extends IService<BuserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

