package com.zl.wms.service.auth.impl;

import com.zl.wms.constant.CommonConstant;
import com.zl.wms.dao.auth.FuncDao;
import com.zl.wms.dao.auth.FuncResourceDao;
import com.zl.wms.dao.auth.ResourceDao;
import com.zl.wms.model.auth.*;
import com.zl.wms.service.auth.FuncResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FuncResourceServiceImpl implements FuncResourceService {

    @Autowired
    private FuncResourceDao funcResourceDao;

    @Autowired
    private FuncDao funcDao;

    @Autowired
    private ResourceDao resourceDao;

    @Override
    @Transactional
    public String linkFuncResource(Integer funcId, List<Integer> resourceIdList) {

        // 查询funcId是否存在  resourceId是否存在
        FuncModel funcModel = funcDao.selectByPrimaryKey(funcId);

        if (funcModel == null){

            return "功能不存在！";
        }

        ResourceModelExample resourceModelExample = new ResourceModelExample();

        resourceModelExample.createCriteria()
                .andResourceIdIn(resourceIdList);

        long count = resourceDao.countByExample(resourceModelExample);

        if (count != resourceIdList.size()){

            return "有资源不存在,判定为非法请求！";
        }

        // 删除这个功能所有关联
        FuncResourceModelExample example = new FuncResourceModelExample();

        example.createCriteria()
                .andFuncIdEqualTo(funcId);

        funcResourceDao.deleteByExample(example);

        // 关联起来 todo 暂时用循环插入，后面改为批量插入
        for (Integer resourceId:resourceIdList){

            FuncResourceModel insertModel = new FuncResourceModel();

            insertModel.setFuncId(funcId);
            insertModel.setResourceId(resourceId);

            funcResourceDao.insertSelective(insertModel);
        }

        return CommonConstant.SUCCESS;
    }
}
