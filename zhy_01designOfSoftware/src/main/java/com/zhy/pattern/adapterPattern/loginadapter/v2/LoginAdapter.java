package com.zhy.pattern.adapterPattern.loginadapter.v2;

import com.zhy.pattern.adapterPattern.loginadapter.ResultMsg;

/**
 * @ClassName: LoginAdapter
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/10 16:47
 * @Version: 1.0
 **/
public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id,Object adapter);
}
