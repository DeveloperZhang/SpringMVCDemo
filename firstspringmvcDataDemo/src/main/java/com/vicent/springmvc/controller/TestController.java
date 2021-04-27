package com.vicent.springmvc.controller;


import com.vicent.springmvc.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

//控制器注解
@Controller
//配置该Controller下的全局路径
@RequestMapping("/test")
public class TestController {

    //Get请求映射
    @GetMapping("/g")  //访问的相对路径
    @ResponseBody //直接响应输出字符串,不进行跳转
    public String testGet() {
        return "get mapping";
    }

    //Post请求映射
    @PostMapping("/p")
    @ResponseBody
    public String testPost() {
        return "post mapping";
    }

    //Get请求参数
    @GetMapping("/gp")  //访问的相对路径
    @ResponseBody //直接响应输出字符串,不进行跳转
    public String testGetParam(String name) {
        String pName = name;
        System.out.println("name = [" + name + "]");
        return "name is:" + pName;
    }


    //Post请求参数
    @PostMapping("/pp")  //访问的相对路径
    @ResponseBody //直接响应输出字符串,不进行跳转
    public String testPostParam(String name, Integer[] hobby) {
        String pName = name;
        Integer[] pHobby = hobby;
        StringBuffer hobbySb = new StringBuffer();
        for (Integer hobbyValue:hobby
             ) {
            hobbySb.append(hobbyValue + ",");
        }
        String result = "name = [" + name + "], hobby = [" + hobbySb + "]";
        System.out.println(result);
        return result;
    }

    //Post请求参数,model类型
    @PostMapping("/ppm")  //访问的相对路径
    @ResponseBody //直接响应输出字符串,不进行跳转
    public String testPostParamModel(User user) {
        String pName = user.getName();
        List<Integer> pHobby = user.getHobby();
        StringBuffer hobbySb = new StringBuffer();
        for (Integer hobbyValue:pHobby
                ) {
            hobbySb.append(hobbyValue + ",");
        }
        String result = "name = [" + pName + "], hobby = [" + hobbySb + "], cotract.name =[" + user.getContract().getName() + "]";
        System.out.println(result);
        return result;
    }


    //Post请求参数,日期类型转换
    @PostMapping("/pd")  //访问的相对路径
    @ResponseBody //直接响应输出字符串,不进行跳转
    public String testPostParamDate(@RequestParam(value = "create_date") @DateTimeFormat(pattern = "yyyyMMdd") Date createDate) {
        String result = "createDate is:" + createDate;
        return result;
    }

    //Post请求参数,日期类型转换
    @PostMapping("/pd1")  //访问的相对路径
    @ResponseBody //直接响应输出字符串,不进行跳转
    public String testPostParamDate1(@RequestParam(value = "create_date") Date createDate) {
        String result = "createDate is:" + createDate;
        return result;
    }

    //Get请求映射
    @GetMapping("/gr")  //访问的相对路径
    @ResponseBody //直接响应输出字符串,不进行跳转
    public ModelAndView testGet(String name) {
        ModelAndView mav = new ModelAndView("view.jsp");
        User user = new User();
        user.setName(name);
        mav.addObject("u", user);
        return mav;
    }


}
