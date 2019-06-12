package com.zhy.pattern.observerPattern.gperadvice_guava;

import com.google.common.eventbus.Subscribe;
import com.zhy.pattern.observerPattern.gperadvice.Gper;
import com.zhy.pattern.observerPattern.gperadvice.Question;

/**
 * @ClassName: Teacher
 * @Description:
 * @auther: zhy
 * @Date: 2019/6/12 14:57
 * @Version: 1.0
 **/
public class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void getMsg(Question question){
        System.out.println("-------------------------");
        System.out.println(name+"老师,你好"+"您收到一个"
                +"问题"+"\n"
                +question.getContent()+"\n;提问者是:"+question.getUserName());
    }
}
