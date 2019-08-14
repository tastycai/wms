package com.zl.wms.service.auth.impl;

import com.zl.wms.constant.CommonConstant;
import com.zl.wms.dao.auth.ResourceDao;
import com.zl.wms.model.auth.ResourceModel;
import com.zl.wms.service.auth.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceDao resourceDao;

    @Override
    @Transactional
    public String addResource(ResourceModel resourceModel) {

        if (StringUtils.isEmpty(resourceModel.getResourceUrl())){

            return "资源url不允许为空！";
        }

        if (StringUtils.isEmpty(resourceModel.getResourceKey())){

            return "资源key不允许为空！";
        }

        ResourceModel insertModel = new ResourceModel();

        insertModel.setResourceKey(resourceModel.getResourceKey());
        insertModel.setResourceUrl(resourceModel.getResourceUrl());
        insertModel.setResourceDesc(resourceModel.getResourceDesc());

        resourceDao.insertSelective(insertModel);

        return CommonConstant.SUCCESS;
    }

}
