package com.gavin.sh.impl;

import com.gavin.sh.dmo.User;
import com.gavin.sh.intf.UserService;
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

    @Override
    public User getUser(Long id) {
        return null;
    }
}
