package com.zhy.pattern.adapterPattern.loginadapter.v2;

import com.zhy.pattern.adapterPattern.loginadapter.ResultMsg;

/**
 * @ClassName: PassportTest
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/10 17:13
 * @Version: 1.0
 **/
public class PassportTest {
    public static void main(String[] args) {
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        ResultMsg resultMsg = passportForThird.loginForQQ("");
        System.out.println(resultMsg.getCode());
    }
}
