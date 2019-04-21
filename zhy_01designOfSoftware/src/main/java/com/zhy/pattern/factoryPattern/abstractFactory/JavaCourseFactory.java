package com.zhy.pattern.factoryPattern.abstractFactory;

import com.zhy.pattern.factoryPattern.simpleFactory.ICourse;
import com.zhy.pattern.factoryPattern.simpleFactory.JavaCourse;

/**
 * @ClassName: JavaCourseFactory
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/21 22:58
 * @Version: 1.0
 **/
public class JavaCourseFactory implements AbstractFactory {
    public ICourse createCourse() {
        return new JavaCourse();
    }

    public INote createNote() {
        return new JavaNote();
    }

    public ISource createSourse() {
        return new JavaSourse();
    }
}
