package com.zl.wms.service.auth;

import java.util.List;

public interface FuncResourceService {

    // 关联功能和资源
    public String linkFuncResource(Integer funcId, List<Integer> resourceIdList);

}
