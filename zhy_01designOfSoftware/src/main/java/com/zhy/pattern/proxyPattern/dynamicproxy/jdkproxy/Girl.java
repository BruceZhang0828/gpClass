package com.zhy.pattern.proxyPattern.dynamicproxy.jdkproxy;

import com.zhy.pattern.proxyPattern.staticProxy.Person;

/**
 * @ClassName: Girl
 * @Description:
 * @auther: zhy
 * @Date: 2019/4/28 23:15
 * @Version: 1.0
 **/
public class Girl implements Person {

    @Override
    public void findLove(){
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有六块腹肌");
    }
}
