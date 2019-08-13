package com.zl.wms.dao.order;

import com.zl.wms.model.order.OrderAddressModel;
import com.zl.wms.model.order.OrderAddressModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderAddressDao {
    long countByExample(OrderAddressModelExample example);

    int deleteByExample(OrderAddressModelExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderAddressModel record);

    int insertSelective(OrderAddressModel record);

    List<OrderAddressModel> selectByExample(OrderAddressModelExample example);

    OrderAddressModel selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") OrderAddressModel record, @Param("example") OrderAddressModelExample example);

    int updateByExample(@Param("record") OrderAddressModel record, @Param("example") OrderAddressModelExample example);

    int updateByPrimaryKeySelective(OrderAddressModel record);

    int updateByPrimaryKey(OrderAddressModel record);
}