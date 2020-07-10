package com.zl.house.house.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import vo.JSONResult;


@RestController
@RequestMapping(path =  "/house",produces = "application/json;charset=utf-8")
public class HouseController {
	@Autowired
	private RestTemplate restTemplate;
	@Value("${house.url}")
	private String queryUri;

	@ResponseBody
	@RequestMapping("/queryUserHouse/{id}")
	public JSONResult queryUserHouse(@PathVariable("id")Integer id)throws Exception{
		System.err.println("house");
		JSONResult jsonResult = restTemplate.getForObject(queryUri+id, JSONResult.class);
		return jsonResult;
	}

	
}
