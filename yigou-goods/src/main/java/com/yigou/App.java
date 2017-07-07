package com.yigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @explain 在这里我们使用@SpringBootApplication指定这是一个 spring boot的应用程序.
 * @author 川军六十六师
 * @date 2017年6月12日 上午11:18:19
 */
@SpringBootApplication
@EnableDiscoveryClient //向服务中心注册 类似于 @EnableClient
//@EnableFeignClients //启用注解调用服务
//@EnableEurekaClient
//@EnableHystrix //断路器
//@EnableHystrixDashboard //断路器表
public class App {
	
	/**
	 * 在这里我们使用 @Bean注入 fastJsonHttpMessageConvert
	 * @return
	 * 当使用Foreign调用其他服务的时候，整合了fastjson返回的数据会出现问题
	 */
	/*@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		// 1、需要先定义一个 convert 转换消息的对象;
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();

		//2、添加fastJson 的配置信息，比如：是否要格式化返回的json数据;
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		*//**
		 * 处理中文乱码的问题
		 * 配置了这个话会导致异常处理类返回的数据出现乱码
		 *//*
        *//*List<MediaType> fastMediaTypes = new ArrayList<>();
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        fastConverter.setSupportedMediaTypes(fastMediaTypes);*//*

		//3、在convert中添加配置信息.
		fastConverter.setFastJsonConfig(fastJsonConfig);

		HttpMessageConverter<?> converter = fastConverter;

		return new HttpMessageConverters(converter);
	}*/
	
	public static void main(String[] args) {
		/**
		 * 在main方法中启动我们的应用程序
		 */
		SpringApplication.run(App.class, args);
		
		System.out.println("yigou-goods服务启动成功........");
		
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
