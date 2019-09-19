package com.mall.api.response;

import com.mall.api.enums.StatusCode;
import lombok.Data;

/**
 * @description: 通用响应对象
 * @author: mall
 * @date: 2019-09-16 23:30
 **/
@Data
public class BaseResponse<T> {

    private Integer code;

    private String mag;

    private T data;

    public BaseResponse() {
    }

    public BaseResponse(Integer code, String mag, T data) {
        this.code = code;
        this.mag = mag;
        this.data = data;
    }

    public BaseResponse(Integer code, String mag) {
        this.code = code;
        this.mag = mag;
    }

    public BaseResponse(StatusCode code) {
        this.code = code.getCode();
        this.mag = code.getMsg();
    }
}
