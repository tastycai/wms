package com.zl.wms.dao.order;

import com.zl.wms.model.order.AddressModel;
import com.zl.wms.model.order.AddressModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressDao {
    long countByExample(AddressModelExample example);

    int deleteByExample(AddressModelExample example);

    int deleteByPrimaryKey(Integer addressId);

    int insert(AddressModel record);

    int insertSelective(AddressModel record);

    List<AddressModel> selectByExample(AddressModelExample example);

    AddressModel selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") AddressModel record, @Param("example") AddressModelExample example);

    int updateByExample(@Param("record") AddressModel record, @Param("example") AddressModelExample example);

    int updateByPrimaryKeySelective(AddressModel record);

    int updateByPrimaryKey(AddressModel record);
}