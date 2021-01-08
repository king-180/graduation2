package com.wx.modules.book.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wx.common.validator.group.AddGroup;
import com.wx.common.validator.group.UpdateGroup;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author wangxing
 * @email wangxing@gmail.com
 * @date 2021-01-07 17:29:02
 */
@Data
@TableName("t_book")
public class BookEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId
    private Long id;
    /**
     * 图书名称
     */
    @NotBlank(message = "图书名称必填", groups = {AddGroup.class, UpdateGroup.class})
    private String bookName;
    /**
     * 库存
     */
    @NotNull(message = "库存不能为空", groups = {AddGroup.class, UpdateGroup.class})
    @Min(value = 0, message = "库存必须大于{value}", groups = {AddGroup.class, UpdateGroup.class})
    private Integer stock;
    /**
     * 单价
     */
    @NotNull(message = "单价不能为空", groups = {AddGroup.class, UpdateGroup.class})
    @Min(value = 0, message = "单价必须大于{value}", groups = {AddGroup.class, UpdateGroup.class})
    private BigDecimal price;

}
