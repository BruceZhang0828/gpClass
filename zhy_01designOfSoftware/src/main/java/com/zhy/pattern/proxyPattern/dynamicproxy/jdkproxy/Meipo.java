package com.zhy.pattern.proxyPattern.dynamicproxy.jdkproxy;

import com.zhy.pattern.proxyPattern.staticProxy.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: Meipo
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/28 23:17
 * @Version: 1.0
 **/
public class Meipo implements InvocationHandler {

    private Person target;

    public Object getInstance(Person person){
        //Proxy类重新生成一个新类，同时新的类要实现被代理类所有实现的所有接口。
        this.target = person;
        Class<? extends Person> clazz = person.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态生成Java代码，把新业务逻辑方法由一定的逻辑代码去调用（在代码中体现）。
        before();
        Annotation[] annotations = method.getAnnotations();
        System.out.println(annotations);
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }


    private void before(){
        System.out.println("Im a Meipo. now,I got your need");
        System.out.println("Starting looking for a girl");
    }


    private void after(){
        System.out.println("如果合适的话 就准备开始办事吧");
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String format = sdf.format(new Date());
        System.out.println(format);
    }
}
