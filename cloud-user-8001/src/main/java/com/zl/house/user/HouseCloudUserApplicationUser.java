package com.zl.house.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.zl.house.user.mapper")
@EnableTransactionManagement
@EnableEurekaClient
@EnableFeignClients
//@EnableDiscoveryClient
public class HouseCloudUserApplicationUser {

	public static void main(String[] args) {
		SpringApplication.run(HouseCloudUserApplicationUser.class, args);
	}


}
