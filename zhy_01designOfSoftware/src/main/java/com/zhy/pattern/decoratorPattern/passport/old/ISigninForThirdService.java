package com.zhy.pattern.decoratorPattern.passport.old;

public interface ISigninForThirdService extends ISigninService {
    /**
     QQ登录
    **/
    ResultMsg loginForQQ(String id);

    /**
     *微信登录
    **/
    ResultMsg loginForWeChart(String id);

    /**
     * 记住登录状态之后自动登录
    **/
    ResultMsg loginForToken(String token);
    /**
     *手机号登录
    **/
    ResultMsg loginForTelphone(String phone,String code);

    /**
     * 注册后自动登录
    **/
    ResultMsg loginForRegist(String username,String passward);



}
