package com.zl.house.user.client;

import com.zl.house.user.entity.Test;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient("house-houseService")
public interface HouseServiceClient {
    @RequestMapping("/aaa/house/sayHello")
    public String  sayhello();

    @RequestMapping(value = "/aaa/house/test",method = RequestMethod.POST)
        void test(Test test);
}
