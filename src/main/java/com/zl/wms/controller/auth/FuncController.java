package com.zl.wms.controller.auth;

import com.zl.wms.model.auth.FuncModel;
import com.zl.wms.service.auth.FuncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/func")
public class FuncController {

    @Autowired
    private FuncService funcService;

    // 添加功能
    @PostMapping("/add")
    public String addFunc(FuncModel funcModel){

        return funcService.addFunc(funcModel);
    }
}
