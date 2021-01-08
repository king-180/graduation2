package com.wx.modules.book.controller;

import com.wx.common.utils.PageUtils;
import com.wx.common.utils.R;
import com.wx.common.validator.group.AddGroup;
import com.wx.common.validator.group.UpdateGroup;
import com.wx.modules.book.entity.BuserEntity;
import com.wx.modules.book.service.BuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-01-07 19:20:02
 */
@RestController
@RequestMapping("book/buser")
public class BuserController {
    @Autowired
    private BuserService buserService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = buserService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		BuserEntity buser = buserService.getById(id);

        return R.ok().put("buser", buser);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@Validated(AddGroup.class) @RequestBody BuserEntity buser){
		buserService.save(buser);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@Validated(UpdateGroup.class) @RequestBody BuserEntity buser){
		buserService.updateById(buser);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		buserService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
