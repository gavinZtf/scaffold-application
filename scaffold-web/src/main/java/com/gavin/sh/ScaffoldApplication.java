package com.gavin.sh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : 张腾飞
 * @version V1.0
 * @Project: scaffold-application
 * @Package com.gavin.sh
 * @Description: TODO
 * @date Date : 2019年08月21日 21:49
 */
@SpringBootApplication
@MapperScan("com.gavin.sh.dao")
public class ScaffoldApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScaffoldApplication.class, args);
    }
}
