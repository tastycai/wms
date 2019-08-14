package com.zl.wms.controller.auth;

import com.zl.wms.service.auth.FuncResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/func-resource")
public class FuncResourceController {

    @Autowired
    private FuncResourceService funcResourceService;

    // 关联功能和资源
    @PostMapping("/link")
    public String linkFuncResource(@RequestParam Integer funcId, @RequestParam List<Integer> resourceIdList){

        return funcResourceService.linkFuncResource(funcId,resourceIdList);
    }
}
