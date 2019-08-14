package com.zl.wms.dao.auth;

import com.zl.wms.model.auth.UserModel;
import com.zl.wms.model.auth.UserModelExample;
import java.util.List;

import com.zl.wms.vo.auth.SessionUserVO;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    long countByExample(UserModelExample example);

    int deleteByExample(UserModelExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserModel record);

    int insertSelective(UserModel record);

    List<UserModel> selectByExample(UserModelExample example);

    UserModel selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserModel record, @Param("example") UserModelExample example);

    int updateByExample(@Param("record") UserModel record, @Param("example") UserModelExample example);

    int updateByPrimaryKeySelective(UserModel record);

    int updateByPrimaryKey(UserModel record);

    public SessionUserVO selectSessionUserVO(String userName);
}