package com.ysl.controller;

import com.ysl.mapper.UserMapper;
import com.ysl.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author ysl
 * @Date 2020/2/29 22:14
 * @Description:
 **/

@Controller
//@RestController
public class MapperController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/queryUser")
    @ResponseBody
    public List<User> queryUser() {
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
