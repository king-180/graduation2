package com.wx.modules.book.controller;

import com.wx.common.utils.PageUtils;
import com.wx.common.utils.R;
import com.wx.common.validator.group.AddGroup;
import com.wx.common.validator.group.UpdateGroup;
import com.wx.modules.book.entity.OrderEntity;
import com.wx.modules.book.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * @author wangxing
 * @email wangxing@gmail.com
 * @date 2021-01-07 17:29:02
 */
@RestController
@RequestMapping("book/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = orderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id) {
        OrderEntity order = orderService.getById(id);

        return R.ok().put("order", order);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@Validated(AddGroup.class) @RequestBody OrderEntity order) {
        orderService.save(order);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@Validated(UpdateGroup.class) @RequestBody OrderEntity order) {
        orderService.updateById(order);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids) {
        orderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
