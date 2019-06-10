package com.zhy.pattern.adapterPattern.loginadapter.v1;

import com.zhy.pattern.adapterPattern.loginadapter.ResultMsg;
import com.zhy.pattern.adapterPattern.loginadapter.SiginService;

/**
 * @ClassName: SigninForThirdService
 * @Description: 第三方登录service
 * @auther: zhy
 * @Date: 2019/6/10 16:23
 * @Version: 1.0
 **/
public class SigninForThirdService extends SiginService {

    public ResultMsg loginForQQ(String openId){
        //1.openId是全局唯一,我们可以作为一个用户名
        //2密码默认为QQ_EMPTY
        //3.注册
        //4.调用原来的登录方法
        return loginForRegist(openId,null);
    }

    public ResultMsg loginForRegist(String username,String password){
        super.regist(username,null);
        return super.login(username,null);
    }

    public ResultMsg loginForWechat(String openId){
        return null;
    }
    public ResultMsg loginForToken(String token){
        //通过 token 拿到用户信息，然后再重新登陆了一次
        return null;
    }
    public ResultMsg loginForTelphone(String telphone,String code){
        return null;
    }
}
