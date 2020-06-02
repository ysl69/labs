package com.ysl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ysl
 * @Date 2020/5/20 23:05
 * @Description: 自定义 Spring Security 的配置，实现权限控制
 **/

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/echo")
    public String demo(){
        return "示例返回";
    }


    @GetMapping("/home")
    public String home(){
        return "我是首页";
    }


    @GetMapping("/admin")
    public String admin(){
        return "我是管理员";
    }


    @GetMapping("normal")
    public String normal(){
        return "我是普通用户";
    }
}
