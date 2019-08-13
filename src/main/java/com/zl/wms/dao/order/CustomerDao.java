package com.zl.wms.dao.order;

import com.zl.wms.model.order.CustomerModel;
import com.zl.wms.model.order.CustomerModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerDao {
    long countByExample(CustomerModelExample example);

    int deleteByExample(CustomerModelExample example);

    int deleteByPrimaryKey(Integer customerId);

    int insert(CustomerModel record);

    int insertSelective(CustomerModel record);

    List<CustomerModel> selectByExample(CustomerModelExample example);

    CustomerModel selectByPrimaryKey(Integer customerId);

    int updateByExampleSelective(@Param("record") CustomerModel record, @Param("example") CustomerModelExample example);

    int updateByExample(@Param("record") CustomerModel record, @Param("example") CustomerModelExample example);

    int updateByPrimaryKeySelective(CustomerModel record);

    int updateByPrimaryKey(CustomerModel record);
}