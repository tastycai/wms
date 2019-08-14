package com.zl.wms.controller.auth;

import com.zl.wms.service.auth.RoleFuncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role-func")
public class RoleFuncController {

    @Autowired
    private RoleFuncService roleFuncService;

    // 关联角色和功能
    @PostMapping("/link")
    public String linkRoleFunc(Integer roleId, List<Integer> funcIdList){

        return roleFuncService.linkRoleFunc(roleId,funcIdList);
    }
}
