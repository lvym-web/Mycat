package com.lvym.mycat.controller;


import com.lvym.mycat.entity.My;
import com.lvym.mycat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
 
    @Autowired
    private UserService userService;
 
    @RequestMapping("/findUser")
    public List<My> findUser() {
        List<My> user = userService.findUser();
        return user;
    }
 
    @RequestMapping("/insertUser")
    public int insertUser(String name) {
        int mies = userService.insertUser(name);
        return mies;
    }
 
}
