package com.zhy.pattern.observerPattern.event.core;

import java.lang.reflect.Method;

/**
 * @ClassName: Event
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/12 11:20
 * @Version: 1.0
 **/
public class Event {
    //事件源,事件是由谁发起来的
    private Object source;
    //事件触发之后,要通知谁
    private Object target;
    //事件触发之后,要做什么动作,回调
    private Method callback;
    //事件名称,触发的是什么事件
    private String trigger;
    //事件触发的时间
    private long time;

    public Event(Object target,Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }
    public Event setTime(long time) {
        this.time = time;
        return this;
    }
    public Object getSource() {
        return source;
    }
    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }
    public long getTime() {
        return time;
    }
    public Object getTarget() {
        return target;
    }
    public Method getCallback() {
        return callback;
    }

    @Override
    public String toString() {
        return "Event{" + "\n" +
                "\tsource=" + source.getClass() + ",\n" +
                "\ttarget=" + target.getClass() + ",\n" +
                "\tcallback=" + callback + ",\n" +
                "\ttrigger='" + trigger + "',\n" +
                "\ttime=" + time + "'\n" +
                '}';
    }
}
