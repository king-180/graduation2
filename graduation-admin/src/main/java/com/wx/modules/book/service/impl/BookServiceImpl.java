package com.wx.modules.book.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.common.utils.PageUtils;
import com.wx.common.utils.Query;
import com.wx.modules.book.dao.BookDao;
import com.wx.modules.book.entity.BookEntity;
import com.wx.modules.book.service.BookService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("bookService")
public class BookServiceImpl extends ServiceImpl<BookDao, BookEntity> implements BookService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BookEntity> page = this.page(
                new Query<BookEntity>().getPage(params),
                new QueryWrapper<BookEntity>()
        );

        return new PageUtils(page);
    }

}