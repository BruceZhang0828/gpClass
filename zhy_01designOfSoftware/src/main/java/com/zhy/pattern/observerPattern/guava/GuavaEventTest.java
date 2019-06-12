package com.zhy.pattern.observerPattern.guava;

import com.google.common.eventbus.EventBus;

/**
 * @ClassName: GuavaEventTest
 * @Description: 测试
 * @auther: zhy
 * @Date: 2019/6/12 14:50
 * @Version: 1.0
 **/
public class GuavaEventTest {

    public static void main(String[] args) {

        EventBus eventBus = new EventBus();

        GuavaEvent guavaEvent = new GuavaEvent();

        eventBus.register(guavaEvent);

        eventBus.post("jack");

    }
}
