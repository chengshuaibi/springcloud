package com.zl.house.user.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;

/**
 * Hello服务
 * @author suke
 */
@RestController
@RequestMapping("/hello")
public class InfoController {
	@Resource
	private EurekaClient client;

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@GetMapping("/discovery")
	public Object discovery() {
		// 获取Eureka中所有的服务节点
		List<Application> applications = client.getApplications().getRegisteredApplications();
		if (applications != null) {
			for (Application application : applications) {
				// 对外暴露的服务名称
				String name = application.getName();
				// 只看hello服务信息
				if ("house-userService".equalsIgnoreCase(name)) {
					// 服务有多少个实例，比如订单服务可能部署了多个，有多个订单服务注册到了eureka
					List<InstanceInfo> instances = application.getInstances();
					LOGGER.info("所有的hello服务：{}", instances);
					if (instances != null) {
						for (InstanceInfo info : instances) {
							LOGGER.info("服务id：{}", info.getInstanceId());
							LOGGER.info("服务主机：{}", info.getHostName());
							LOGGER.info("服务端口：{}", info.getPort());
						}
					}
					return instances;
				}
			}
		}
		return null;
	}
}