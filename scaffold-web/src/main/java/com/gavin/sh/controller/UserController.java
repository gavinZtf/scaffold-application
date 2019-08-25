package com.gavin.sh.controller;

import com.gavin.sh.dmo.User;
import com.gavin.sh.intf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : 张腾飞
 * @version V1.0
 * @Project: scaffold-application
 * @Package com.gavin.sh.controller
 * @Description: TODO
 * @date Date : 2019年08月24日 23:24
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUser(@RequestParam(value = "id") Integer id) {
        return userService.getUser(id);
    }

    @RequestMapping(value = "insertUser", method = RequestMethod.POST)
    public String insertUser(@RequestBody User user) {
        userService.insertUser(user);
        return "SUCCESS";
    }
}
