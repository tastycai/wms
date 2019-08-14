package com.zl.wms.service.auth.impl;

import com.zl.wms.constant.CommonConstant;
import com.zl.wms.dao.auth.RoleDao;
import com.zl.wms.model.auth.RoleModel;
import com.zl.wms.service.auth.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    @Transactional
    public String addRole(RoleModel roleModel) {

        if (StringUtils.isEmpty(roleModel.getRoleName())){

            return "角色名称不可以为空!";
        }

        RoleModel insertModel = new RoleModel();
        insertModel.setRoleName(roleModel.getRoleName());
        insertModel.setRoleDesc(roleModel.getRoleDesc());

        roleDao.insertSelective(insertModel);

        return CommonConstant.SUCCESS;
    }
}
