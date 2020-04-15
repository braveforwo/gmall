package com.example.gmall.manage.controller;

import com.example.gmall.service.UserService;
import com.example.gmall.bean.UmsMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/index")
    @ResponseBody
    public List<UmsMember> index(){

        return userService.selectAllUser();
    }

}
