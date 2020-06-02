package com.ysl;

import com.ysl.dao.UserRepository;
import com.ysl.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author ysl
 * @Date 2020/3/1 16:00
 * @Description:
 **/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class JpaTest {



    @Autowired
    private UserRepository userRepository;


    @Test
    public void  test(){
        List<User> users = userRepository.findAll();
        System.out.println(users);
    }
}
