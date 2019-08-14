package com.zl.wms.service.login;

public interface LoginService {

    /**
     * 登录
     *
     * @param userName
     * @param password
     * @return
     */
    public String login(String userName,String password);
}
