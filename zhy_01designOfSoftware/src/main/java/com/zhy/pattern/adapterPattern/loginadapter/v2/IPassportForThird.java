package com.zhy.pattern.adapterPattern.loginadapter.v2;

import com.zhy.pattern.adapterPattern.loginadapter.ResultMsg;

public interface IPassportForThird {
    /**
     QQ登录
    **/
    ResultMsg loginForQQ(String id);

    /**
     微信登录
    **/
    ResultMsg loginForWechat(String id);

    /**
     微博登录
    **/
    ResultMsg loginForSina(String id);

    /**
     手机登录
    **/
    ResultMsg loginForTel(String phoneNum,String code);

    /**
     手机登录
     **/
    ResultMsg loginForToken(String token);
    /**
     * 注册后自动登录
    **/
    ResultMsg loginForRegist(String username,String password);
}
