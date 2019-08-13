package com.zl.wms.dao.product;

import com.zl.wms.model.product.ProductModel;
import com.zl.wms.model.product.ProductModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductDao {
    long countByExample(ProductModelExample example);

    int deleteByExample(ProductModelExample example);

    int deleteByPrimaryKey(Integer productId);

    int insert(ProductModel record);

    int insertSelective(ProductModel record);

    List<ProductModel> selectByExample(ProductModelExample example);

    ProductModel selectByPrimaryKey(Integer productId);

    int updateByExampleSelective(@Param("record") ProductModel record, @Param("example") ProductModelExample example);

    int updateByExample(@Param("record") ProductModel record, @Param("example") ProductModelExample example);

    int updateByPrimaryKeySelective(ProductModel record);

    int updateByPrimaryKey(ProductModel record);
}