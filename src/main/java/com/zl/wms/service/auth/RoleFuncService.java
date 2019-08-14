package com.zl.wms.service.auth;

import java.util.List;

public interface RoleFuncService {

    // 关联角色和功能
    public String linkRoleFunc(Integer roleId, List<Integer> funcIdList);
}
