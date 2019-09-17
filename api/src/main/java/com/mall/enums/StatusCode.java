package com.mall.enums;

/**
 * @description: 状态
 * @author: mall
 * @date: 2019-09-16 23:35
 **/
public enum StatusCode {
    sussess(0, "请求成功"),
    error(-1,"请求失败"),
    inva(200,"无效的参数");


    private Integer code;

    private String msg;

    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
