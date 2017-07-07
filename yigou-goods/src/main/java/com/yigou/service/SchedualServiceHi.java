package com.yigou.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * foreign去调服务的接口类
 * @FeignClient(value = "service-hi",
 * fallback = SchedualServiceHiHystric.class)
 * 这个主要是声明了foreign的客户端
 * 并且声明了断路器使用的类
 * Author 川军六十六师
 * Since 2017/6/16 17:26.
 */
//@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
