package com.zl.wms.dao.auth;

import com.zl.wms.model.auth.ResourceModel;
import com.zl.wms.model.auth.ResourceModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceDao {
    long countByExample(ResourceModelExample example);

    int deleteByExample(ResourceModelExample example);

    int deleteByPrimaryKey(Integer resourceId);

    int insert(ResourceModel record);

    int insertSelective(ResourceModel record);

    List<ResourceModel> selectByExample(ResourceModelExample example);

    ResourceModel selectByPrimaryKey(Integer resourceId);

    int updateByExampleSelective(@Param("record") ResourceModel record, @Param("example") ResourceModelExample example);

    int updateByExample(@Param("record") ResourceModel record, @Param("example") ResourceModelExample example);

    int updateByPrimaryKeySelective(ResourceModel record);

    int updateByPrimaryKey(ResourceModel record);


}