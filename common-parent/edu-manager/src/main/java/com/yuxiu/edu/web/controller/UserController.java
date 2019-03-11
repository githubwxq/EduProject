package com.yuxiu.edu.web.controller;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private IUserService userService;


    @RequestMapping("/login")
    public String login() {
        System.out.println("11111");
        return null;
    }


    @RequestMapping("/find/{id}")
    @ResponseBody
    public String find(@PathVariable("id") Integer id) {
        System.out.println("11111");
        User user=userService.findById(id);
        System.out.println(user.getUsername()+"");
        return user.getPassword();
    }

    @RequestMapping("/insert")
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
