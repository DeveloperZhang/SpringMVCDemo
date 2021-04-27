package com.vicent.springmvc.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

public class User {
    private String name;
    private List<Integer> hobby;
    private Contract contract;

    @DateTimeFormat(pattern = "yyyyMMdd")
    private Date createDate;



    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getHobby() {
        return hobby;
    }

    public void setHobby(List<Integer> hobby) {
        this.hobby = hobby;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
