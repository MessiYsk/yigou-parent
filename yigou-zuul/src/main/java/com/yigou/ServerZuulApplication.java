package com.yigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //配置开启zuul的功能
@EnableEurekaClient
public class ServerZuulApplication {

	public static void main(String[] args) {

		SpringApplication.run(ServerZuulApplication.class, args);
		System.out.println("API网关......启动成功.......");
	}
}
