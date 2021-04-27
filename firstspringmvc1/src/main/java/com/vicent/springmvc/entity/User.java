package com.vicent.springmvc.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
    private String userName;
    private String password;

//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;


    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
