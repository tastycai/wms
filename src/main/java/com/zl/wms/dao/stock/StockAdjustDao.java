package com.zl.wms.dao.stock;

import com.zl.wms.model.stock.StockAdjustModel;
import com.zl.wms.model.stock.StockAdjustModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockAdjustDao {
    long countByExample(StockAdjustModelExample example);

    int deleteByExample(StockAdjustModelExample example);

    int deleteByPrimaryKey(Integer stockAdjustId);

    int insert(StockAdjustModel record);

    int insertSelective(StockAdjustModel record);

    List<StockAdjustModel> selectByExample(StockAdjustModelExample example);

    StockAdjustModel selectByPrimaryKey(Integer stockAdjustId);

    int updateByExampleSelective(@Param("record") StockAdjustModel record, @Param("example") StockAdjustModelExample example);

    int updateByExample(@Param("record") StockAdjustModel record, @Param("example") StockAdjustModelExample example);

    int updateByPrimaryKeySelective(StockAdjustModel record);

    int updateByPrimaryKey(StockAdjustModel record);
}