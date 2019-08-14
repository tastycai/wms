package com.zl.wms.service.auth.impl;

import com.zl.wms.constant.CommonConstant;
import com.zl.wms.dao.auth.FuncDao;
import com.zl.wms.dao.auth.RoleDao;
import com.zl.wms.dao.auth.RoleFuncDao;
import com.zl.wms.model.auth.*;
import com.zl.wms.service.auth.RoleFuncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleFuncServiceImpl implements RoleFuncService {

    @Autowired
    private RoleFuncDao roleFuncDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private FuncDao funcDao;

    @Override
    @Transactional
    public String linkRoleFunc(Integer roleId, List<Integer> funcIdList) {

        // roleId是否存在
        RoleModel roleModel = roleDao.selectByPrimaryKey(roleId);

        if (roleModel == null){

            return "角色不存在！";
        }

        FuncModelExample funcModelExample = new FuncModelExample();

        funcModelExample.createCriteria()
                .andFuncIdIn(funcIdList);

        long funcCount = funcDao.countByExample(funcModelExample);

        if (funcCount != funcIdList.size()){

            return "某些功能不存在，判断为非法请求！";
        }

        // 删掉原来的关联
        RoleFuncModelExample example = new RoleFuncModelExample();

        example.createCriteria()
                .andRoleIdEqualTo(roleId);

        roleFuncDao.deleteByExample(example);


        // 建立关联关系  todo 先暂时循环插入吧，后面改为批量插入
        for (Integer funcId:funcIdList){

            RoleFuncModel insertModel = new RoleFuncModel();

            insertModel.setRoleId(roleId);
            insertModel.setFuncId(funcId);

            roleFuncDao.insertSelective(insertModel);
        }

        return CommonConstant.SUCCESS;
    }
}
