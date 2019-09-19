package com.mall.api.service;

import com.mall.api.response.BaseResponse;

import java.util.List;

/**
 * @description: 用户服务类
 * @author: mall
 * @date: 2019-09-19 22:17
 **/
public interface UserService {


    /**
     * 创建用户
     * @param name
     * @return
     */
    BaseResponse addUser(String name);

    /**
     * 查询全部用户
     * @return
     */
    BaseResponse selectUserAll();
}
