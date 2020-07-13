package com.zl.house.house;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.zl.house.house.mapper")
@EnableTransactionManagement
@EnableEurekaClient

public class house10003 {
	public static void main(String[] args) {
		SpringApplication.run(house10003.class, args);
	}

	//创建RestTemplate

}
