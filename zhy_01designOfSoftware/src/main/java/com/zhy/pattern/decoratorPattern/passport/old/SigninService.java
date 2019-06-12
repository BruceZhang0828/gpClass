package com.zhy.pattern.decoratorPattern.passport.old;

/**
 * @ClassName: SigninService
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/12 9:29
 * @Version: 1.0
 **/
public class SigninService implements ISigninService{
    @Override
    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200,"注册成功",new Member());
    }

    @Override
    public ResultMsg login(String username, String password) {
        return null;
    }
}
