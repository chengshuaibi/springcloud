package com.zl.house.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient("house-houseService")
public interface HouseServiceClient {
    @ResponseBody
    @RequestMapping("/house/sayHello")
    public String  sayhello();
}
