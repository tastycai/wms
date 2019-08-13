package com.zl.wms.dao.order;

import com.zl.wms.model.order.OrderModel;
import com.zl.wms.model.order.OrderModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDao {
    long countByExample(OrderModelExample example);

    int deleteByExample(OrderModelExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderModel record);

    int insertSelective(OrderModel record);

    List<OrderModel> selectByExample(OrderModelExample example);

    OrderModel selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") OrderModel record, @Param("example") OrderModelExample example);

    int updateByExample(@Param("record") OrderModel record, @Param("example") OrderModelExample example);

    int updateByPrimaryKeySelective(OrderModel record);

    int updateByPrimaryKey(OrderModel record);
}