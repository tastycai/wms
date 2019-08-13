package com.zl.wms.dao.auth;

import com.zl.wms.model.auth.FuncModel;
import com.zl.wms.model.auth.FuncModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FuncDao {
    long countByExample(FuncModelExample example);

    int deleteByExample(FuncModelExample example);

    int deleteByPrimaryKey(Integer funcId);

    int insert(FuncModel record);

    int insertSelective(FuncModel record);

    List<FuncModel> selectByExample(FuncModelExample example);

    FuncModel selectByPrimaryKey(Integer funcId);

    int updateByExampleSelective(@Param("record") FuncModel record, @Param("example") FuncModelExample example);

    int updateByExample(@Param("record") FuncModel record, @Param("example") FuncModelExample example);

    int updateByPrimaryKeySelective(FuncModel record);

    int updateByPrimaryKey(FuncModel record);
}