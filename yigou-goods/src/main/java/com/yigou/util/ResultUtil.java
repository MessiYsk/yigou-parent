package com.yigou.util;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Author 川军六十六师
 * Since 2017/6/24 15:36.
 */
public class ResultUtil {

    /**
     * 生成返回到前端页面正确的格式数据，code = 0;
     * @param object
     * @return
     */
    public static Map<String,Object> successObject(Object object){
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("code","0");
        map.put("data",object);
        return map;
    }

    /**
     * 返回操作成功的状态码，code = 0;
     * @param
     * @return
     */
    public static Map<String,Object> successObject(){
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("code","0");
        return map;
    }

}
