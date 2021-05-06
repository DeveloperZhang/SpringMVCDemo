package com.vicent.controller;


import com.vicent.entity.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/rest")
//@CrossOrigin(origins = {"http://localhost:8080","http://www.baidu.com"})
//@CrossOrigin(origins = "*",maxAge = 3600)
public class RestfulController {
    //查询
    @GetMapping("/s")
    public String doGetStudent() {
        return "{\"message\":\"返回查询结果\"}";
    }

    //添加
    @PostMapping("/s/{sid}")
    public String doPostStudent(@PathVariable("sid") Integer requestId, Person person) {
        System.out.println("name:" + person.getName() + ",age:" + person.getAge() );
        String result = "{\"message\":\"返回新建结果\",\"requestId\":" + requestId + "}";
        return result;
    }

    //修改
    @PutMapping("/s")
    public String doPutStudent() {
        String result = "{\"message\":\"返回修改结果\"}";

        return result;
    }


    //删除
    @DeleteMapping("/s")
    public String doDeleteStudent() {
        return "{\"message\":\"返回删除结果\"}";
    }

    @GetMapping("/students")
    public List<Person> findPersons(){
        List list = new ArrayList();
        Person p1 = new Person();
        p1.setName("lily");
        p1.setAge("23");
        p1.setBirthday(new Date());

        Person p2 = new Person();
        p2.setName("smith");
        p2.setAge("22");
        p2.setBirthday(new Date());
        list.add(p1);
        list.add(p2);
        return list;
    }

}
