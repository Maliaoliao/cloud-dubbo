package com.mall.server.dubbo;

import com.mall.api.enums.StatusCode;
import com.mall.api.response.BaseResponse;
import com.mall.api.service.UserService;
import com.mall.model.dto.user.User;
import com.mall.model.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 用户实现类
 * @author: mall
 * @date: 2019-09-19 22:21
 **/
@Service
public class DubboUserService implements UserService {

    private Logger logger = LoggerFactory.getLogger(DubboUserService.class);
    @Autowired
    UserMapper mapper;


    public BaseResponse addUser(String name) {
        BaseResponse response = new BaseResponse(StatusCode.sussess);
        User u = new User();
        u.setUserName(name);
        int res = mapper.addUser(u);
        response.setData(res);
        return response;
    }

    public BaseResponse selectUserAll() {
        BaseResponse response = new BaseResponse(StatusCode.sussess);
        try {
            List<User> userList = mapper.selectUser();
            response.setData(userList);
        } catch (Exception e) {
            logger.error("查询用户失败！", e);
            response = new BaseResponse(StatusCode.error);
        }
        return response;
    }
}
