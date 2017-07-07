package com.yigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Author 川军六十六师
 * Since 2017/7/4 17:31.
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient //向服务中心注册 类似于 @EnableClient
public class ConfigServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConfigServerApplication.class, args);
        System.out.println("yigou-config-server.....服务启动成功....");
    }
}
