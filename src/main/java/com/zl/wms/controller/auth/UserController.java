package com.zl.wms.controller.auth;

import com.zl.wms.model.auth.UserModel;
import com.zl.wms.service.auth.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 添加用户
    @PostMapping("/add")
    public String addUser(UserModel userModel){

        return userService.addUser(userModel);
    }
}
