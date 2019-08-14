package com.zl.wms.controller.auth;

import com.zl.wms.service.auth.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user-role")
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

    // 用户关联角色
    @PostMapping("/link")
    public String linkUserRole(Integer userId, List<Integer> roleIdList){

        return userRoleService.linkUserRole(userId,roleIdList);
    }
}
