package com.yigou.constant;

import com.yigou.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * foreign调用服务时断路器返回的错误结果类
 * Author 川军六十六师
 * Since 2017/6/16 19:47.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
