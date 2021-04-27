package com.vicent.springmvc.controller;


import com.vicent.springmvc.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/mapping")
public class MappingController {

    @GetMapping("/g")
    @ResponseBody
    public String getRequest(@RequestParam(value = "manager_name") String managerName){
        System.out.println("managerName is:" + managerName);
        return "This is get request";
    }


    @PostMapping("/p")
    @ResponseBody
    public String postRequest(String userName, String password,@DateTimeFormat(pattern = "yyyy-MM-dd") Date createDate){
        System.out.println(userName + ":" + password + ":" + createDate);
        return "This is get request";
    }

    @PostMapping("/p1")
    @ResponseBody
    public String postEntity(User user){
        String outStr = user.getUserName() + ":" + user.getPassword() + "-" + user.getCreateDate();
        System.out.println(outStr);
        return outStr;
    }

    @PostMapping("/p2")
    @ResponseBody
    public String postMap(@RequestParam Map map){
        return "SUCCESS";
    }

    @GetMapping("/view")
    public ModelAndView showView(Integer userId){
        ModelAndView mav = new ModelAndView("/view.jsp");
        User user = new User();
        if (userId == 1){
             user.setUserName("Tom");
        }else {
            user.setUserName("张三");
        }
        mav.addObject("u",user);
        return mav;
    }

    @GetMapping("/view1")
    public ModelAndView showView1(){
        ModelAndView mav = new ModelAndView("redirect:/view.jsp");
        return mav;
    }

    @GetMapping("/view2")
    public ModelAndView showView2(){
        ModelAndView mav = new ModelAndView("redirect:/mapping/view.jsp");
        return mav;
    }


    @GetMapping("/view3")
    public String showView3(Integer userId, ModelMap modelMap){
        User user = new User();
        if (userId == 1){
            user.setUserName("Tom");
        }else {
            user.setUserName("张三");
        }
        modelMap.addAttribute("u", user);
        return "view.jsp";
    }


}
