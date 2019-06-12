package com.zhy.pattern.observerPattern.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @ClassName: GuavaEvent
 * @Description: 创建监听事件
 * @auther: zhy
 * @Date: 2019/6/12 14:49
 * @Version: 1.0
 **/
public class GuavaEvent {

    @Subscribe
    public void subcribe(String str) {
        //业务逻辑
        System.out.println("执行subcribe 方法,传入的参数是"+str);
    }
}
