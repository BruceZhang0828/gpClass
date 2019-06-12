package com.zhy.pattern.observerPattern.gperadvice;

import java.util.Observable;

/**
 * @ClassName: Gper
 * @Description: jdk提供的一种观察者的实现方式，被观察者
 * @auther: zhy
 * @Date: 2019/6/12 10:41
 * @Version: 1.0
 **/
public class Gper extends Observable {
    private String name = "Gper 生态圈";
    private static Gper gper = null;

    private Gper() {
    }

    public static Gper getInstance(){
        if (null == gper) {
            gper = new Gper();
        }

        return gper;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName()+"在"+this.name+"上提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}

