package com.zhy.pattern.proxyPattern.dynamicproxy.gpJdkProxy;

import java.lang.reflect.Method;

/**
 * @Author zhy
 * @Description 代理类执行方法接口
 * @Date 11:41 2019/5/5
 * @Param
 * @return
**/
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
