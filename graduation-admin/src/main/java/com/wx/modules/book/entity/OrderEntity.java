package com.wx.modules.book.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wx.common.validator.group.AddGroup;
import com.wx.common.validator.group.UpdateGroup;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wangxing
 * @email wangxing@gmail.com
 * @date 2021-01-07 17:29:02
 */
@Data
@TableName("t_order")
public class OrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId
    private String id;
    /**
     * 用户id
     */
    @NotNull(message = "用户id必填", groups = {AddGroup.class, UpdateGroup.class})
    private Long userId;
    /**
     * 订单金额
     */
    @NotNull(message = "订单金额必填", groups = {AddGroup.class, UpdateGroup.class})
    @Min(value = 0, message = "订单金额必须大于{value}", groups = {AddGroup.class, UpdateGroup.class})
    private BigDecimal money;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 逻辑删除
     */
    private Integer isDelete;
    /**
     * 图书id
     */
    @NotNull(message = "图书id必填", groups = {AddGroup.class, UpdateGroup.class})
    private Long bookId;

}
