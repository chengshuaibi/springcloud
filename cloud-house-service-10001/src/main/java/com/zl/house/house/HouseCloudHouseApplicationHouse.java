package com.zl.house.house;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.zl.house.house.mapper")
@EnableTransactionManagement
@EnableEurekaClient
@EnableFeignClients
public class HouseCloudHouseApplicationHouse {

	public static void main(String[] args) {
		SpringApplication.run(HouseCloudHouseApplicationHouse.class, args);
	}

	//创建RestTemplate

}
