package com.yigou;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author 川军六十六师
 * Since 2017/7/4 17:53.
 */
@RefreshScope
@SpringBootApplication
@EnableDiscoveryClient //向服务中心注册 类似于 @EnableClient
@RestController
public class ConfigClientApplication {

    public static void main(String[] args){
        SpringApplication.run(ConfigClientApplication.class, args);
        System.out.println("yigou-config-client.....服务启动成功....");
    }

    @Value("${yigou-config-client}")
    String foo;
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
