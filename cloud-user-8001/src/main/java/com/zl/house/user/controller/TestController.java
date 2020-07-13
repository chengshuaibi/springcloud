package com.zl.house.user.controller;

import com.zl.house.user.client.HouseServiceClient;
import com.zl.house.user.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    HouseServiceClient houseServiceClient;


    @RequestMapping("/entity")
    @ResponseBody
    public String test( Test test){
        System.out.println(test);
        houseServiceClient.test(test);
    return "ok";
    }
}
