package com.zl.wms.dao.stock;

import com.zl.wms.model.stock.AddstockDetailModel;
import com.zl.wms.model.stock.AddstockDetailModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddstockDetailDao {
    long countByExample(AddstockDetailModelExample example);

    int deleteByExample(AddstockDetailModelExample example);

    int deleteByPrimaryKey(Integer addstockDetailId);

    int insert(AddstockDetailModel record);

    int insertSelective(AddstockDetailModel record);

    List<AddstockDetailModel> selectByExample(AddstockDetailModelExample example);

    AddstockDetailModel selectByPrimaryKey(Integer addstockDetailId);

    int updateByExampleSelective(@Param("record") AddstockDetailModel record, @Param("example") AddstockDetailModelExample example);

    int updateByExample(@Param("record") AddstockDetailModel record, @Param("example") AddstockDetailModelExample example);

    int updateByPrimaryKeySelective(AddstockDetailModel record);

    int updateByPrimaryKey(AddstockDetailModel record);
}