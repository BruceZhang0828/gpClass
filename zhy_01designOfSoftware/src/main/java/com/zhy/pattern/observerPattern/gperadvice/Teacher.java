package com.zhy.pattern.observerPattern.gperadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: Teacher
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/12 10:47
 * @Version: 1.0
 **/
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Gper gper = (Gper) o;
        Question question = (Question)arg;
        System.out.println("-------------------------");
        System.out.println(name+"老师,你好"+"您收到一个来自"+gper.getName()
                +"的问题"+"\n"
                +question.getContent()+"\n;提问者是:"+question.getUserName());

    }
}
