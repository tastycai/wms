package com.zl.wms.dao.order;

import com.zl.wms.model.order.OrderDetailModel;
import com.zl.wms.model.order.OrderDetailModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailDao {
    long countByExample(OrderDetailModelExample example);

    int deleteByExample(OrderDetailModelExample example);

    int deleteByPrimaryKey(Integer orderDetailId);

    int insert(OrderDetailModel record);

    int insertSelective(OrderDetailModel record);

    List<OrderDetailModel> selectByExample(OrderDetailModelExample example);

    OrderDetailModel selectByPrimaryKey(Integer orderDetailId);

    int updateByExampleSelective(@Param("record") OrderDetailModel record, @Param("example") OrderDetailModelExample example);

    int updateByExample(@Param("record") OrderDetailModel record, @Param("example") OrderDetailModelExample example);

    int updateByPrimaryKeySelective(OrderDetailModel record);

    int updateByPrimaryKey(OrderDetailModel record);
}