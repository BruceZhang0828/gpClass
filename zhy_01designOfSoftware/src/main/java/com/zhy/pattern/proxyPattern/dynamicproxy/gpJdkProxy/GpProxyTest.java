package com.zhy.pattern.proxyPattern.dynamicproxy.gpJdkProxy;

import com.zhy.pattern.proxyPattern.dynamicproxy.jdkproxy.Girl;
import com.zhy.pattern.proxyPattern.staticProxy.Person;

/**
 * @ClassName: GpProxyTest
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/11 10:13
 * @Version: 1.0
 **/
public class GpProxyTest {
    public static void main(String[] args) {
        Person obj = (Person) new GPMeipo().getInstance(new Girl());
        System.out.println(obj.getClass());
        obj.findLove();
    }
}
