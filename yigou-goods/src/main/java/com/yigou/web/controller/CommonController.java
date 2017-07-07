package com.yigou.web.controller;

import com.yigou.base.BaseController;
import com.yigou.constant.Constant;
import com.yigou.util.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * Author 川军六十六师
 * Since 2017/7/5 11:23.
 */
@RestController
public class CommonController extends BaseController {

    @Value("${web.upload-path}")
    private String path;

    /**
     * 图片上传
     * 前端AJAX调用
     * 接收值:文件PICTURE
     * 返回值:json数据串，result=success标识成功
     */
    @RequestMapping("PicUpload")
    public Object PicUpload(@RequestParam(value = "files",required = false) MultipartFile files){
        Map<String,String> map = new HashMap<>();
        String  ffile = DateUtil.getDays(), fileName = "";
        //String filePath = PathUtil.getClasspath() + Constant.FILEPATHIMG + ffile;
        String filePath = path + Constant.FILEPATHIMG + ffile;
        fileName = FileUpload.fileUp(files, filePath, UuidUtil.get32UUID());
        /**
         * 路径
         */
        map.put("PicPath",ffile+"/"+fileName);
        map.put("result","success");
        return ResultUtil.successObject(map);
    }
}
