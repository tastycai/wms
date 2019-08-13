package com.zl.wms.dao.stock;

import com.zl.wms.model.stock.OutstockModel;
import com.zl.wms.model.stock.OutstockModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutstockDao {
    long countByExample(OutstockModelExample example);

    int deleteByExample(OutstockModelExample example);

    int deleteByPrimaryKey(Integer outstockId);

    int insert(OutstockModel record);

    int insertSelective(OutstockModel record);

    List<OutstockModel> selectByExample(OutstockModelExample example);

    OutstockModel selectByPrimaryKey(Integer outstockId);

    int updateByExampleSelective(@Param("record") OutstockModel record, @Param("example") OutstockModelExample example);

    int updateByExample(@Param("record") OutstockModel record, @Param("example") OutstockModelExample example);

    int updateByPrimaryKeySelective(OutstockModel record);

    int updateByPrimaryKey(OutstockModel record);
}