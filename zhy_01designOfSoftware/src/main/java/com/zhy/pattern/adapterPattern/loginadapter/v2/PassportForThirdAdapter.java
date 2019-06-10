package com.zhy.pattern.adapterPattern.loginadapter.v2;

import com.zhy.pattern.adapterPattern.loginadapter.ResultMsg;
import com.zhy.pattern.adapterPattern.loginadapter.SiginService;

/**
 * @ClassName: PassportForThirdAdapter
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/10 17:00
 * @Version: 1.0
 **/
public class PassportForThirdAdapter extends SiginService implements IPassportForThird {

    @Override
    public ResultMsg loginForQQ(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForSina(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForTel(String phoneNum, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String password) {
        return null;
    }

    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz){
        try {
            LoginAdapter loginAdapter = clazz.newInstance();
            if (loginAdapter.support(loginAdapter)) {
                return loginAdapter.login(key, loginAdapter);
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
