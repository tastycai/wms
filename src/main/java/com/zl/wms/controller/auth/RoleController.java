package com.zl.wms.controller.auth;

import com.zl.wms.model.auth.RoleModel;
import com.zl.wms.service.auth.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    // 添加角色
    @PostMapping("/add")
    public String addRole(RoleModel roleModel){

        return roleService.addRole(roleModel);
    }
}
