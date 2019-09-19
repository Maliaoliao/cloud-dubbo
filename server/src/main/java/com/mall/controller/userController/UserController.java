package com.mall.controller.userController;

import com.mall.api.enums.StatusCode;
import com.mall.model.dto.user.User;
import com.mall.api.response.BaseResponse;
import com.mall.server.dubbo.DubboUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 用户控制器
 * @author: mall
 * @date: 2019-09-19 22:00
 **/
@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    DubboUserService service;
    @GetMapping(value = "/api/add/user")
    public BaseResponse userRegistered(User user){
        BaseResponse response = service.selectUserAll();
        return response;
    }
}
