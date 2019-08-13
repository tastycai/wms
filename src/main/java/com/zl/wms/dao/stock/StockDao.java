package com.zl.wms.dao.stock;

import com.zl.wms.model.stock.StockModel;
import com.zl.wms.model.stock.StockModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockDao {
    long countByExample(StockModelExample example);

    int deleteByExample(StockModelExample example);

    int deleteByPrimaryKey(Integer stockId);

    int insert(StockModel record);

    int insertSelective(StockModel record);

    List<StockModel> selectByExample(StockModelExample example);

    StockModel selectByPrimaryKey(Integer stockId);

    int updateByExampleSelective(@Param("record") StockModel record, @Param("example") StockModelExample example);

    int updateByExample(@Param("record") StockModel record, @Param("example") StockModelExample example);

    int updateByPrimaryKeySelective(StockModel record);

    int updateByPrimaryKey(StockModel record);
}