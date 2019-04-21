package com.zhy.pattern.factoryPattern.factoryMethod;

import com.zhy.pattern.factoryPattern.simpleFactory.ICourse;
import com.zhy.pattern.factoryPattern.simpleFactory.PythonCourse;

/**
 * @ClassName: PythonCourseFactory
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/21 20:12
 * @Version: 1.0
 **/
public class PythonCourseFactory implements ICourseFactory {
    public ICourse creat() {
        return new PythonCourse();
    }
}
