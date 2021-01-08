package com.wx.modules.book.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wx.common.validator.group.AddGroup;
import com.wx.common.validator.group.UpdateGroup;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-01-07 19:20:02
 */
@Data
@TableName("t_buser")
public class BuserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId
    private Long id;
    /**
     * 用户名
     */
    @NotBlank(message = "用户名必填", groups = {AddGroup.class, UpdateGroup.class})
    @Length(min = 2, max = 16, message = "用户名长度应该在{min}到{max}之间", groups = {AddGroup.class, UpdateGroup.class})
    private String username;
    /**
     * 密码
     */
    @NotBlank(message = "密码必填", groups = {AddGroup.class, UpdateGroup.class})
    @Length(min = 6, max = 18, message = "密码长度应该在{min}到{max}之间", groups = {AddGroup.class, UpdateGroup.class})
    private String password;
    /**
     * 购物车id
     */
    @NotBlank(message = "购物车id必填", groups = {AddGroup.class, UpdateGroup.class})
    private Long carId;

}
