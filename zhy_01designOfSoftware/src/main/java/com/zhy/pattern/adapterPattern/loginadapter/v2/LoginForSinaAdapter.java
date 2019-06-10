package com.zhy.pattern.adapterPattern.loginadapter.v2;

import com.zhy.pattern.adapterPattern.loginadapter.ResultMsg;

/**
 * @ClassName: LoginForSinaAdapter
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/10 16:50
 * @Version: 1.0
 **/
public class LoginForSinaAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
