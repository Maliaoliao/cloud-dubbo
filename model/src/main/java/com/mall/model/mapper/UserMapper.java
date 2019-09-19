package com.mall.model.mapper;

import com.mall.model.dto.user.User;

import java.util.List;

/**
 * @description: 用户mapper
 * @author: mall
 * @date: 2019-09-19 21:50
 **/
public interface UserMapper {

    List<User> selectUser();

    int addUser(User user);
}
