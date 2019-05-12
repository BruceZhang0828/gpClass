package com.zhy.pattern.proxyPattern.dynamicproxy.gpJdkProxy;

import com.zhy.pattern.proxyPattern.staticProxy.Person;

import java.lang.reflect.Method;

/**
 * @ClassName: GPMeipo
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/11 9:56
 * @Version: 1.0
 **/
public class GPMeipo implements GPInvocationHandler {

    private Object target;

    public Object getInstance(Person object){
        this.target = object;

        Class<?> clazz = target.getClass();

        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(this.target,args);
        after();
        return null;
    }

    private void before() {
        System.out.println("我是媒婆,我要给找一个对象,现在已经拿到你的需求了");
        System.out.println("开始物色");
    }

    private void after() {
        System.out.println("如果合适的话就结婚吧");
    }


}
