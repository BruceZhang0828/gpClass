package com.zhy.pattern.factoryPattern.simpleFactory;

/**
 * @ClassName: SimpleFactoryTest
 * @Description: 简单工程测试类
 * @auther: zhy
 * @Date: 2019/4/19 17:35
 * @Version: 1.0
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        //ICourse java = courseFactory.create("java");
        //java.record();
        //ICourse javaCourse = courseFactory.createCourse("com.zhy.pattern.factoryPattern.simpleFactory.JavaCourse1");
        //javaCourse.record();
        ICourse byClazz = courseFactory.createByClazz(JavaCourse.class);
        byClazz.record();
    }

}
