package com.zl.wms.service.login.impl;

import com.zl.wms.constant.AuthConstant;
import com.zl.wms.dao.auth.UserDao;
import com.zl.wms.service.login.LoginService;
import com.zl.wms.util.MD5Util;
import com.zl.wms.util.ServletUtil;
import com.zl.wms.vo.auth.SessionUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpSession;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userDao;

    public String login(String userName,String password){

        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)){

            return "用户名和密码不允许为空！";
        }

        // 根据用户名查询出用户信息
        SessionUserVO sessionUserVO = userDao.selectSessionUserVO(userName);

        if (sessionUserVO == null){

            return "用户不存在！";
        }

        if (!sessionUserVO.getIsValid()){

            return "用户已被禁用！";
        }

        if (!MD5Util.md5Encode(password).equals(sessionUserVO.getPassword())){

            return "密码不正确！";
        }

        // 验证通过，设置到session
        HttpSession session = ServletUtil.getSession();

        // 覆盖掉密码
        sessionUserVO.setPassword(null);

        session.setAttribute(AuthConstant.SESSION_USER,sessionUserVO);

        return "success";
    }
}
