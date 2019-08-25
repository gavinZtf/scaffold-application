package com.gavin.sh.intf;

import com.gavin.sh.dmo.User;

/**
 * @author : 张腾飞
 * @version V1.0
 * @Project: scaffold-application
 * @Package com.gavin.sh.intf
 * @Description: TODO
 * @date Date : 2019年08月24日 23:33
 */
public interface UserService {

    /**
     * @param id
     * @return
     */
    public User getUser(Integer id);

    void insertUser(User user);
}
