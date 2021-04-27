package com.vicent.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//控制器注解
@Controller
public class TestController {

    @GetMapping("/t")  //访问的相对路径
    @ResponseBody //直接响应输出字符串,不进行跳转
    public String test() {
        return "SUCCESS";
    }

}
