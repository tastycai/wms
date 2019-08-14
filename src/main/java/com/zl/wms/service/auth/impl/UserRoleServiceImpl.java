package com.zl.wms.service.auth.impl;

import com.zl.wms.constant.CommonConstant;
import com.zl.wms.dao.auth.RoleDao;
import com.zl.wms.dao.auth.UserDao;
import com.zl.wms.dao.auth.UserRoleDao;
import com.zl.wms.model.auth.RoleModelExample;
import com.zl.wms.model.auth.UserModel;
import com.zl.wms.model.auth.UserRole;
import com.zl.wms.model.auth.UserRoleExample;
import com.zl.wms.service.auth.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public String linkUserRole(Integer userId, List<Integer> roleIdList) {

        // 用户是否存在
        UserModel userModel = userDao.selectByPrimaryKey(userId);

        if (userModel == null){

            return "用户不存在！";
        }

        // 角色是否都存在
        RoleModelExample roleExample = new RoleModelExample();

        roleExample.createCriteria().andRoleIdIn(roleIdList);

        long roleCount = roleDao.countByExample(roleExample);

        if (roleCount != roleIdList.size()){

            return "某些角色不存在！判定为非法请求！";
        }

        // 删除掉原来的关联关系
        UserRoleExample userRoleExample = new UserRoleExample();

        userRoleExample.createCriteria()
                .andUserIdEqualTo(userId);

        userRoleDao.deleteByExample(userRoleExample);

        // 重新插入关联关系 次数有限，暂时直接放到循环里面插入
        for (Integer roleId:roleIdList){

            UserRole userRole = new UserRole();

            userRole.setUserId(userId);
            userRole.setRoleId(roleId);

            userRoleDao.insertSelective(userRole);
        }

        return CommonConstant.SUCCESS;
    }
}
