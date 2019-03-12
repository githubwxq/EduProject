package com.yuxiu.edu.web.controller;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login(){
        System.out.println(".....");
        return "Default";
    }

    @RequestMapping("find")
    public String find(Integer id){
        System.out.println(".....");
        User user = userService.findById(id);
        System.out.println(user);
        return null;
    }

    @RequestMapping("manage")
    public String manage(){
        return "user/manage";
    }

    @RequestMapping("info")
    public String info(){
        return "user/info";
    }

    @RequestMapping("edit")
    public String edit(){
        return "user/edit";
    }


//         插入数据测试
    @RequestMapping("insert")
    @ResponseBody
    public String insert() {
        System.out.println("11111");
        User user=new User();
        user.setId(2);
        user.setUsername("qwer");
        user.setPassword("123123");
        System.out.println(user.getUsername()+"");
        userService.insert(user);
        return user.getPassword();
    }






}
