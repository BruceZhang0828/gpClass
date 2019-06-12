package com.zhy.pattern.decoratorPattern.passport.old;

/**
 * @ClassName: Member
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/12 9:16
 * @Version: 1.0
 **/
public class Member {
    private String username;
    private String password;
    private String mid;
    private String info;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
