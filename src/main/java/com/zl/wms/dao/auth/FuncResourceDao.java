package com.zl.wms.dao.auth;

import com.zl.wms.model.auth.FuncResourceModel;
import com.zl.wms.model.auth.FuncResourceModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FuncResourceDao {
    long countByExample(FuncResourceModelExample example);

    int deleteByExample(FuncResourceModelExample example);

    int deleteByPrimaryKey(Integer funcResourceId);

    int insert(FuncResourceModel record);

    int insertSelective(FuncResourceModel record);

    List<FuncResourceModel> selectByExample(FuncResourceModelExample example);

    FuncResourceModel selectByPrimaryKey(Integer funcResourceId);

    int updateByExampleSelective(@Param("record") FuncResourceModel record, @Param("example") FuncResourceModelExample example);

    int updateByExample(@Param("record") FuncResourceModel record, @Param("example") FuncResourceModelExample example);

    int updateByPrimaryKeySelective(FuncResourceModel record);

    int updateByPrimaryKey(FuncResourceModel record);
}