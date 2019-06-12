package com.zhy.pattern.observerPattern.gperadvice_guava;

import com.google.common.eventbus.EventBus;
import com.zhy.pattern.observerPattern.gperadvice.Question;

/**
 * @ClassName: GperAdviceTest
 * @Description: 提醒有guava 实现
 * @auther: zhy
 * @Date: 2019/6/12 14:59
 * @Version: 1.0
 **/
public class GperAdviceTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();

        Teacher teacher = new Teacher("tom");
        eventBus.register(teacher);

        Question question = new Question();
        question.setUserName("小明明");
        question.setContent("先有鸡还是先有蛋");
        eventBus.post(question);
    }
}
