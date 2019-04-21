package com.zhy.pattern.factoryPattern.factoryMethod;

import com.zhy.pattern.factoryPattern.simpleFactory.ICourse;

/**
 * @ClassName: FactoryMethodTest
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/21 20:13
 * @Version: 1.0
 **/
public class FactoryMethodTest {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse javaCourse = javaCourseFactory.creat();
        javaCourse.record();
    }
}
