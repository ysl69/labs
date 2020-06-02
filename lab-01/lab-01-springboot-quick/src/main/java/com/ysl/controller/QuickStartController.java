package com.ysl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ysl
 * @Date 2020/2/29 20:57
 * @Description: 通过@Value注解将配置文件中的值映射到一个Spring管理的Bean的字段上
 **/

@Controller
public class QuickStartController {


    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private Integer age;


    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "springboot 访问成功! name="+name+",age="+age;
    }
}
