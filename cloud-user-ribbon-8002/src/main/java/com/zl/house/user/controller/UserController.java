package com.zl.house.user.controller;

import com.zl.house.user.entity.User;
import com.zl.house.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vo.JSONResult;

@RestController
@RequestMapping(path =  "user",produces = "application/json;charset=utf-8")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@Value("${server.port}")
	private int port;
	
	@GetMapping("/queryById/{id}")
	public JSONResult<User> queryUserById(@PathVariable("id")Integer id) throws Exception{
		JSONResult<User> jsonResult = new JSONResult<>();
		if(id == null) {
			jsonResult.setMsg(port+"接口调用失败,id不能为null");
			jsonResult.setCode(20001);
		}else {
			User user = userService.queryById(id);
			jsonResult.setMsg(port+"接口调成功");
			jsonResult.setCode(20000);
			jsonResult.setData(user);
		}
		return jsonResult;
	}
}
