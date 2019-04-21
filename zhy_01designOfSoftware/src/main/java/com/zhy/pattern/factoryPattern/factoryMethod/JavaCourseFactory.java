package com.zhy.pattern.factoryPattern.factoryMethod;

import com.zhy.pattern.factoryPattern.simpleFactory.ICourse;
import com.zhy.pattern.factoryPattern.simpleFactory.JavaCourse;

/**
 * @ClassName: JavaCourseFactory
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/21 20:09
 * @Version: 1.0
 **/
public class JavaCourseFactory implements ICourseFactory {
    public ICourse creat() {
        return new JavaCourse();
    }
}
