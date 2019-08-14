package com.zl.wms.service.auth;

import java.util.List;

public interface UserRoleService {

    // 用户关联角色
    public String linkUserRole(Integer userId, List<Integer> roleIdList);
}
