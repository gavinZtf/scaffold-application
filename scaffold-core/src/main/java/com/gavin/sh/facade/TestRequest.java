package com.gavin.sh.facade;

/**
 * @author : 张腾飞
 * @version V1.0
 * @Project: scaffold-application
 * @Package com.gavin.sh.facade
 * @Description: TODO
 * @date Date : 2019年08月21日 22:07
 */
public class TestRequest {

    private String userName;

    private String sex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "TestRequest{" +
                "userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
