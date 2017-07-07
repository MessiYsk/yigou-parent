package com.yigou.web.controller;

import com.yigou.service.HelloService;
import com.yigou.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Author 川军六十六师
 * Since 2017/6/16 16:21.
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }

    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        Object object = schedualServiceHi.sayHiFromClientOne(name);
        return (String)object;
    }



}
