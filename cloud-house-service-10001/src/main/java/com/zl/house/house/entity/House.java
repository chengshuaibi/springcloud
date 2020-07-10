package com.zl.house.house.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
@KeySequence("seq_id")
public class House implements  Serializable{
	private static final long serialVersionUID = -5656868909617834375L;
	
	@TableId(value = "id",type = IdType.INPUT)
	private Integer id;
	/**发布者id*/
	private Integer userId;
	/**房屋类型*/
	private Integer typeId;
	/**标题*/
	private String title;
	/**描述*/
	private String description;
	/**价格*/
	private Integer price;
	/**面积*/
	private Integer floorage; 
	/**联系方式*/
	private String contact;
	/**所属街道*/
	private Integer streetId;
	
}
