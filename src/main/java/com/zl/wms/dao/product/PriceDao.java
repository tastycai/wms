package com.zl.wms.dao.product;

import com.zl.wms.model.product.PriceModel;
import com.zl.wms.model.product.PriceModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriceDao {
    long countByExample(PriceModelExample example);

    int deleteByExample(PriceModelExample example);

    int deleteByPrimaryKey(Integer priceId);

    int insert(PriceModel record);

    int insertSelective(PriceModel record);

    List<PriceModel> selectByExample(PriceModelExample example);

    PriceModel selectByPrimaryKey(Integer priceId);

    int updateByExampleSelective(@Param("record") PriceModel record, @Param("example") PriceModelExample example);

    int updateByExample(@Param("record") PriceModel record, @Param("example") PriceModelExample example);

    int updateByPrimaryKeySelective(PriceModel record);

    int updateByPrimaryKey(PriceModel record);
}