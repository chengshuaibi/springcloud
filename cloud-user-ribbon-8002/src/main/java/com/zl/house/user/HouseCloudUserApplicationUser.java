package com.zl.house.user;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("com.zl.house.user.mapper")
@EnableTransactionManagement
@EnableEurekaClient
//@EnableDiscoveryClient
public class HouseCloudUserApplicationUser {

	public static void main(String[] args) {
		SpringApplication.run(HouseCloudUserApplicationUser.class, args);
	}

	//创建RestTemplate
	@Bean
	@LoadBalanced
	public RestTemplate  createRestTemplate() {
		return new RestTemplate();
	}
	@Bean
	public IRule MyRule(){
		return new RoundRobinRule();
	}
}
