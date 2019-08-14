package com.zl.wms.vo.auth;

import com.zl.wms.model.auth.UserModel;

import java.util.List;

public class SessionUserVO extends UserModel {

    private List<String> urlList;

    public List<String> getUrlList() {
        return urlList;
    }

    public void setUrlList(List<String> urlList) {
        this.urlList = urlList;
    }
}
