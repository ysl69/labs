package com.ysl.aspect;

import java.lang.annotation.*;

/**
 * @Author ysl
 * @Date 2020/5/7 22:47
 * @Description: 自定义注解
 **/

@Retention(RetentionPolicy.RUNTIME) //什么时候使用该注解，我们定义为运行时
@Target({ElementType.METHOD}) //注解用于什么地方，我们定义为作用于方法上
@Documented //注解用于什么地方，我们定义为作用于方法上
public @interface WebLog { //注解称为WebLog

    /**
     * 日志描述信息
     * @return
     */
    String description() default ""; //定义一个属性，默认为空字符串
}
