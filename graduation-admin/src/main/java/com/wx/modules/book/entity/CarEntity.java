package com.wx.modules.book.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wx.common.validator.group.AddGroup;
import com.wx.common.validator.group.UpdateGroup;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author wangxing
 * @email wangxing@gmail.com
 * @date 2021-01-07 17:29:02
 */
@Data
@TableName("t_car")
public class CarEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId
    private Long id;
    /**
     * 图书id
     */
    @NotNull(message = "图书id必填", groups = {AddGroup.class, UpdateGroup.class})
    private Long bookId;
    /**
     * 数量
     */
    @NotNull(message = "数量必填", groups = {AddGroup.class, UpdateGroup.class})
    @Min(value = 1L, message = "图书数量必须大于{value}", groups = {AddGroup.class, UpdateGroup.class})
    private Integer amount;

}
