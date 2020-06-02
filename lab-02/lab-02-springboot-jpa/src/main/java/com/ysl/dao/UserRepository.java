package com.ysl.dao;

import com.ysl.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author ysl
 * @Date 2020/3/1 15:57
 * @Description:
 **/


public interface UserRepository extends JpaRepository<User,Long> {

    public List<User> findAll();
}
