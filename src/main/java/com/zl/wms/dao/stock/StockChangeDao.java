package com.zl.wms.dao.stock;

import com.zl.wms.model.stock.StockChangeModel;
import com.zl.wms.model.stock.StockChangeModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockChangeDao {
    long countByExample(StockChangeModelExample example);

    int deleteByExample(StockChangeModelExample example);

    int deleteByPrimaryKey(Integer stockChangeId);

    int insert(StockChangeModel record);

    int insertSelective(StockChangeModel record);

    List<StockChangeModel> selectByExample(StockChangeModelExample example);

    StockChangeModel selectByPrimaryKey(Integer stockChangeId);

    int updateByExampleSelective(@Param("record") StockChangeModel record, @Param("example") StockChangeModelExample example);

    int updateByExample(@Param("record") StockChangeModel record, @Param("example") StockChangeModelExample example);

    int updateByPrimaryKeySelective(StockChangeModel record);

    int updateByPrimaryKey(StockChangeModel record);
}