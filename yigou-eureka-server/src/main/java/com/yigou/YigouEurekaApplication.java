package com.yigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YigouEurekaApplication {

	public static void main(String[] args) {

		SpringApplication.run(YigouEurekaApplication.class, args);
		System.out.println("服务注册中心启动成功.........");
	}
}
