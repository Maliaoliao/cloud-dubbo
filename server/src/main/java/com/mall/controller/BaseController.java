package com.mall.controller;

import com.mall.api.enums.StatusCode;
import com.mall.api.response.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: baseController
 * @author: mall
 * @date: 2019-09-16 23:46
 **/
@RestController
public class BaseController {


    @GetMapping(name = "/api/hi")
    private BaseResponse hi(String name){
        //发起的第一个请求成功！
        BaseResponse response = new BaseResponse(StatusCode.sussess);
        response.setData(name);
        return response;
    }
}
