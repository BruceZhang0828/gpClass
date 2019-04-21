package com.zhy.pattern.factoryPattern.simpleFactory;

/**
 * @ClassName: JavaCourse
 * @Description: java课程
 * @auther: zhy
 * @Date: 2019/4/19 17:34
 * @Version: 1.0
 **/
public class JavaCourse implements ICourse {
    public void record() {
        System.out.println("这在录制java课程");
    }
}
