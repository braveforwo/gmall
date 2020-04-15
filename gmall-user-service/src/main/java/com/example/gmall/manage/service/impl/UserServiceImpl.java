package com.example.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.gmall.bean.UmsMember;
import com.example.gmall.service.UserService;
import com.example.gmall.manage.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> selectAllUser() {
        return userMapper.selectAll();
    }
}
