package com.ysl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ysl
 * @Date 2020/2/29 20:55
 * @Description: 要通过SpringBoot提供的引导类起步SpringBoot才可以进行访问
 **/

@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class);
    }
}
