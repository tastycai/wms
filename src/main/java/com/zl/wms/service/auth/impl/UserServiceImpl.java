package com.zl.wms.service.auth.impl;

import com.zl.wms.constant.CommonConstant;
import com.zl.wms.dao.auth.UserDao;
import com.zl.wms.model.auth.UserModel;
import com.zl.wms.service.auth.UserService;
import com.zl.wms.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public String addUser(UserModel userModel) {

        if (StringUtils.isEmpty(userModel.getUserName())){

            return "用户名称不可以为空！";
        }

        if (StringUtils.isEmpty(userModel.getUserCode())){

            return "用户账号不可以为空！";
        }

        if (StringUtils.isEmpty(userModel.getPassword())){

            return "用户密码不可以为空！";
        }

        UserModel insertModel = new UserModel();

        insertModel.setUserName(userModel.getUserName());
        insertModel.setUserCode(userModel.getUserCode());
        insertModel.setIsValid(true);
        insertModel.setPassword(MD5Util.md5Encode(userModel.getPassword()));
        insertModel.setPhoneNo(userModel.getPhoneNo());

        userDao.insertSelective(insertModel);

        return CommonConstant.SUCCESS;
    }
}
