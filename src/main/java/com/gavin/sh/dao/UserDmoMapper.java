package com.gavin.sh.dao;

import com.gavin.sh.dmo.UserDmo;
import com.gavin.sh.dmo.UserDmoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDmoMapper {
    long countByExample(UserDmoExample example);

    int deleteByExample(UserDmoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDmo record);

    int insertSelective(UserDmo record);

    List<UserDmo> selectByExample(UserDmoExample example);

    UserDmo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserDmo record, @Param("example") UserDmoExample example);

    int updateByExample(@Param("record") UserDmo record, @Param("example") UserDmoExample example);

    int updateByPrimaryKeySelective(UserDmo record);

    int updateByPrimaryKey(UserDmo record);
}