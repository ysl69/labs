package com.ysl;

import com.ysl.mapper.UserMapper;
import com.ysl.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author ysl
 * @Date 2020/3/1 14:13
 * @Description:
 **/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MySpringBootApplication {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void test(){
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
    }
}
