package com.ysl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ysl
 * @Date 2020/5/20 21:15
 * @Description:
 **/

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/demo")
    public String demo(){
        return "实例返回";
    }
}
