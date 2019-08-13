package com.zl.wms.dao.stock;

import com.zl.wms.model.stock.AddstockModel;
import com.zl.wms.model.stock.AddstockModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddstockDao {
    long countByExample(AddstockModelExample example);

    int deleteByExample(AddstockModelExample example);

    int deleteByPrimaryKey(Integer addstockId);

    int insert(AddstockModel record);

    int insertSelective(AddstockModel record);

    List<AddstockModel> selectByExample(AddstockModelExample example);

    AddstockModel selectByPrimaryKey(Integer addstockId);

    int updateByExampleSelective(@Param("record") AddstockModel record, @Param("example") AddstockModelExample example);

    int updateByExample(@Param("record") AddstockModel record, @Param("example") AddstockModelExample example);

    int updateByPrimaryKeySelective(AddstockModel record);

    int updateByPrimaryKey(AddstockModel record);
}