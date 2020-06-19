package com.lvym.mycat.service;


import com.lvym.mycat.entity.My;
import com.lvym.mycat.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
 
    public List<My> findUser() {
        return userMapper.findUser();
    }
 
    public int insertUser(String name) {
        return userMapper.insertUser(name);
    }
 
}
