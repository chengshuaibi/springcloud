package com.zl.house.house;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("com.zl.house.house.mapper")
@EnableTransactionManagement
@EnableEurekaClient
public class HouseCloudHouseApplicationHouse {

	public static void main(String[] args) {
		SpringApplication.run(HouseCloudHouseApplicationHouse.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
