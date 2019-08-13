package com.zl.wms.dao.auth;

import com.zl.wms.model.auth.RoleFuncModel;
import com.zl.wms.model.auth.RoleFuncModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleFuncDao {
    long countByExample(RoleFuncModelExample example);

    int deleteByExample(RoleFuncModelExample example);

    int deleteByPrimaryKey(Integer roleFuncId);

    int insert(RoleFuncModel record);

    int insertSelective(RoleFuncModel record);

    List<RoleFuncModel> selectByExample(RoleFuncModelExample example);

    RoleFuncModel selectByPrimaryKey(Integer roleFuncId);

    int updateByExampleSelective(@Param("record") RoleFuncModel record, @Param("example") RoleFuncModelExample example);

    int updateByExample(@Param("record") RoleFuncModel record, @Param("example") RoleFuncModelExample example);

    int updateByPrimaryKeySelective(RoleFuncModel record);

    int updateByPrimaryKey(RoleFuncModel record);
}