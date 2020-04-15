package com.example.gmall.manage.controller;

import com.example.gmall.util.GmallRedissonConfig;
import com.example.gmall.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {
    @Autowired
    RedisUtil redisUtil;
    @Autowired
    GmallRedissonConfig gmallRedissonConfig;
    @RequestMapping("/test")
    @ResponseBody
    String k(){
        System.out.println(gmallRedissonConfig);
        return "hhhhhh";
    }
}
