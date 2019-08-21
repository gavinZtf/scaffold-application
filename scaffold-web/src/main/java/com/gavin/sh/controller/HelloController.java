package com.gavin.sh.controller;

import com.gavin.sh.facade.TestRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 张腾飞
 * @version V1.0
 * @Project: scaffold-application
 * @Package com.gavin.sh.controller
 * @Description: TODO
 * @date Date : 2019年08月21日 21:56
 */
@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testHello() {
        return "Hello Gavin";
    }

    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    private String createUser(@RequestBody TestRequest testRequest) {

        // 校验参数

        return "SUCCESS";
    }
}
