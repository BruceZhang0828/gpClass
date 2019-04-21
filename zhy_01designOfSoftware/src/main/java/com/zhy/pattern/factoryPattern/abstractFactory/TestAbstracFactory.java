package com.zhy.pattern.factoryPattern.abstractFactory;

import com.zhy.pattern.factoryPattern.simpleFactory.ICourse;

/**
 * @ClassName: TestAbstracFactory
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/21 23:00
 * @Version: 1.0
 **/
public class TestAbstracFactory {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse course = javaCourseFactory.createCourse();
        course.record();
    }
}
