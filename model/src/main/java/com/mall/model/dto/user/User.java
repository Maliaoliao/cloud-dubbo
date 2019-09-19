package com.mall.model.dto.user;

import lombok.Data;

import java.util.Date;

/**
 * @description: 用户信息
 * @author: mall
 * @date: 2019-09-19 21:50
 **/
@Data
public class User {

    private long userId;
    private String userCode;
    private String userName;
    private String userNickName;
    private String userPwd;
    private String userPhone;
    private String userEmail;
    private String userSignature;
    private String userCard;
    private Date userCreateDate;
    private Date userUpdateDate;
    private Date userLastLogDate;
    private String userLastLogIp;
    private String userIsValidity;
    private long userLogCount;
    private String note;
    private String alternate1;
    private String alternate2;
    private String alternate3;
    private String alternate4;
}
