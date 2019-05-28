package com.zhy.pattern.proxyPattern.dynamicproxy.jdkproxy;

import com.zhy.pattern.proxyPattern.staticProxy.DynamicDataSourceEntry;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: OrderServiceDynamicProxy
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/5 10:10
 * @Version: 1.0
 **/
public class OrderServiceDynamicProxy implements InvocationHandler {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object obj = method.invoke(target, args);
        return obj;
    }

    private void before(Object target) {
        try{
            System.out.println("Proxy before method.");
            Long time = (Long) target.getClass().getMethod("getCreatTime").invoke(target);
            Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
            System.out.println("jdk动态代理自动分配到[DB_"+dbRouter+"] 数据源处理数据");
            DynamicDataSourceEntry.set(dbRouter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void after(){
        System.out.println("Proxy after method.");
    }
}
