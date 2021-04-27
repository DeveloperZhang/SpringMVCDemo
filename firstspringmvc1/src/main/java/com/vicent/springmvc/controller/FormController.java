package com.vicent.springmvc.controller;


import com.vicent.springmvc.entity.Form;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FormController {

    @PostMapping("/apply")
    @ResponseBody
    public String submitMethod(String name, String course, Integer[] purpose){

        return "SUCCESS";
    }


    @PostMapping("/apply1")
    @ResponseBody
    public String submitMethod1(String name, String course, @RequestParam List<Integer> purpose){

        return "SUCCESS";
    }

    @PostMapping("/apply2")
    @ResponseBody
    public String submitMethod2(Form form){

        return "SUCCESS";
    }

}
