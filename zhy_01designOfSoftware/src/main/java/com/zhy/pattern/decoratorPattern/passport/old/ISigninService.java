package com.zhy.pattern.decoratorPattern.passport.old;

/**
 * @ClassName: ISigninService
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/12 9:28
 * @Version: 1.0
 **/
public interface ISigninService {

    ResultMsg regist(String username, String password);
    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String password);
}
