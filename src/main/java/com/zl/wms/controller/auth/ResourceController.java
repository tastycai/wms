package com.zl.wms.controller.auth;

import com.zl.wms.model.auth.ResourceModel;
import com.zl.wms.service.auth.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resource")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    // 添加资源
    @PostMapping("/add")
    public String addResource(ResourceModel resourceModel){

        return resourceService.addResource(resourceModel);
    }
}