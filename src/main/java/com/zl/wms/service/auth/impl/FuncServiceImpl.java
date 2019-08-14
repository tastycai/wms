package com.zl.wms.service.auth.impl;

import com.zl.wms.constant.CommonConstant;
import com.zl.wms.dao.auth.FuncDao;
import com.zl.wms.model.auth.FuncModel;
import com.zl.wms.service.auth.FuncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class FuncServiceImpl implements FuncService {

    @Autowired
    private FuncDao funcDao;

    @Override
    public String addFunc(FuncModel funcModel) {

        if (StringUtils.isEmpty(funcModel.getFuncName())){

            return "功能名称不允许为空！";
        }

        FuncModel insertModel = new FuncModel();
        insertModel.setFuncDesc(funcModel.getFuncDesc());
        insertModel.setFuncName(funcModel.getFuncName());

        funcDao.insertSelective(insertModel);

        return CommonConstant.SUCCESS;
    }
}
