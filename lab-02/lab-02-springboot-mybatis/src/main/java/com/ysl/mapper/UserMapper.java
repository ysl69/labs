package com.ysl.mapper;

import com.ysl.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author ysl
 * @Date 2020/2/29 22:11
 * @Description:
 **/

@Mapper
public interface UserMapper {

    /**
     * 查询
     * @return
     */
    public List<User> queryUserList();
}
