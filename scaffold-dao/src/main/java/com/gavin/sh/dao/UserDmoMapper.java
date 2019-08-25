package com.gavin.sh.dao;

import com.gavin.sh.dmo.UserDmo;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDmoMapper {

    UserDmo selectByPrimaryKey(Integer id);
}