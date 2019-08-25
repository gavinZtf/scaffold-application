package com.gavin.sh.impl;

import com.gavin.sh.dao.UserDmoMapper;
import com.gavin.sh.dmo.User;
import com.gavin.sh.dmo.UserDmo;
import com.gavin.sh.intf.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : 张腾飞
 * @version V1.0
 * @Project: scaffold-application
 * @Package com.gavin.sh.impl
 * @Description: TODO
 * @date Date : 2019年08月24日 23:33
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDmoMapper userDmoMapper;

    @Override
    public User getUser(Integer id) {
        UserDmo userDmo = userDmoMapper.selectByPrimaryKey(id);
        User user = new User();
        BeanUtils.copyProperties(userDmo, user);
        return user;
    }

    @Override
    public void insertUser(User user) {
        UserDmo userDmo = new UserDmo();
        BeanUtils.copyProperties(user, userDmo);
        userDmoMapper.insert(userDmo);
    }
}
