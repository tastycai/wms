package com.zl.wms.dao.stock;

import com.zl.wms.model.stock.OutstockDetailModel;
import com.zl.wms.model.stock.OutstockDetailModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutstockDetailDao {
    long countByExample(OutstockDetailModelExample example);

    int deleteByExample(OutstockDetailModelExample example);

    int deleteByPrimaryKey(Integer outstockDetailId);

    int insert(OutstockDetailModel record);

    int insertSelective(OutstockDetailModel record);

    List<OutstockDetailModel> selectByExample(OutstockDetailModelExample example);

    OutstockDetailModel selectByPrimaryKey(Integer outstockDetailId);

    int updateByExampleSelective(@Param("record") OutstockDetailModel record, @Param("example") OutstockDetailModelExample example);

    int updateByExample(@Param("record") OutstockDetailModel record, @Param("example") OutstockDetailModelExample example);

    int updateByPrimaryKeySelective(OutstockDetailModel record);

    int updateByPrimaryKey(OutstockDetailModel record);
}