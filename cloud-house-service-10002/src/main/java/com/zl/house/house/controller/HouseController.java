package com.zl.house.house.controller;


import com.zl.house.house.entity.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path =  "/house")
public class HouseController {

	@Value("${server.port}")
	private int port;

	@RequestMapping("/sayHello")
	public String sayhello(){
		return "nihao"+port;
	}

	@RequestMapping(value = "/test",method = RequestMethod.POST)
	void test(@RequestBody Test test){
		System.out.println(test);
	}
}
