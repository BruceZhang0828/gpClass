package com.zhy.pattern.adapterPattern.loginadapter.v1;

import com.zhy.pattern.adapterPattern.loginadapter.ResultMsg;

/**
 * @ClassName: SigninForThirdServiceTest
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/10 16:33
 * @Version: 1.0
 **/
public class SigninForThirdServiceTest {
    public static void main(String[] args) {
        SigninForThirdService signinForThirdService = new SigninForThirdService();
        ResultMsg resultMsg = signinForThirdService.loginForQQ("sdfgdgfwresdf9123sdf");
        System.out.println(resultMsg.getCode());
    }
}
