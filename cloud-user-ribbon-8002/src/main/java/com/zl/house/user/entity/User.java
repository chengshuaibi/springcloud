package com.zl.house.user.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("USERS")
@KeySequence(value = "seq_house_user" )
public class User implements Serializable {
	private static final long serialVersionUID = -1485702022261613807L;
	/**用户编号*/
	@TableId(value = "id",type =IdType.INPUT )
	private Integer id;
	/**用户登录名*/
	private String name;
	/**用户登录密码*/
	private String password;
	/**用户手机号码*/
	private String telephone;
	/**用户名*/
	private String username;
	/**是否是管理员*/
	//MmybatisPlus  默认的生成列, 如果属性名是驼峰命名法, 对应列, is_admin
	@TableField("isAdmin")
	private String isAdmin;
	
}
