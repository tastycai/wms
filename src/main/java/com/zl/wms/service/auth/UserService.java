package com.zl.wms.service.auth;

import com.zl.wms.model.auth.UserModel;

public interface UserService {

    // 添加用户
    public String addUser(UserModel userModel);
}
