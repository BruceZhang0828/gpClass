package com.zhy.pattern.proxyPattern.dynamicproxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName: CglibMeipo
 * @Description: cglib动态代理
 * @auther: zhy
 * @Date: 2019/5/13 15:28
 * @Version: 1.0
 **/
public class CglibMeipo implements MethodInterceptor {
    /**
     * @Author zhy
     * @Description
     * @Date 17:41 2019/5/18
     * @Param [clazz]
     * @return java.lang.Object
    **/
    public Object getInstance(Class<?> clazz) throws Exception{
        //相当于代理的工具类
        Enhancer enhancer = new Enhancer();
        //要把那个设置为即将生成的新类父类
        enhancer.setSuperclass(clazz);
        //
        enhancer.setCallback(this);
        //
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //业务增强
        before();
        Object obj = methodProxy.invokeSuper(o, objects);//生成子类 需要调用父类的方法
        after();
        return obj;
    }
    /**
     * @Author zhy
     * @Description 业务增强方法-前奏
     * @Date 17:45 2019/5/18
     * @Param []
     * @return void
    **/
    private void before() {
        System.out.println("我是媒婆:我要给你开始找对象了,现在已经拿到你的需求了");
        System.out.println("开始物色");
    }

    /**
     * @Author zhy
     * @Description 业务增强方法-后续
     * @Date 17:45 2019/5/18
     * @Param []
     * @return void
    **/
    private void after() {
        System.out.println("如果合适的话 就准备结婚吧");
    }


}
