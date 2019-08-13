package com.zl.wms.dao.auth;

import com.zl.wms.model.auth.RoleModel;
import com.zl.wms.model.auth.RoleModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleDao {
    long countByExample(RoleModelExample example);

    int deleteByExample(RoleModelExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(RoleModel record);

    int insertSelective(RoleModel record);

    List<RoleModel> selectByExample(RoleModelExample example);

    RoleModel selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") RoleModel record, @Param("example") RoleModelExample example);

    int updateByExample(@Param("record") RoleModel record, @Param("example") RoleModelExample example);

    int updateByPrimaryKeySelective(RoleModel record);

    int updateByPrimaryKey(RoleModel record);
}