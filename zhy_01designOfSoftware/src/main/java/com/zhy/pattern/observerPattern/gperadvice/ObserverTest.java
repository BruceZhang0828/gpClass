package com.zhy.pattern.observerPattern.gperadvice;

/**
 * @ClassName: ObserverTest
 * @Description: 观察者模式 示例
 * @auther: zhy
 * @Date: 2019/6/12 10:51
 * @Version: 1.0
 **/
public class ObserverTest {
    public static void main(String[] args) {
        Gper gper = Gper.getInstance();
        Teacher teacher = new Teacher("tom");

        gper.addObserver(teacher);

        Question question = new Question();
        question.setContent("先有鸡还是先有蛋");
        question.setUserName("贾克斯");

        gper.publishQuestion(question);

    }
}
