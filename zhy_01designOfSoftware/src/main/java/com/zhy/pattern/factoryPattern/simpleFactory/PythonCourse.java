package com.zhy.pattern.factoryPattern.simpleFactory;

/**
 * @ClassName: PythonClass
 * @Description: py课程
 * @auther: zhy
 * @Date: 2019/4/19 17:58
 * @Version: 1.0
 **/
public class PythonCourse implements ICourse {
    public void record() {
        System.out.println("录制python视频");
    }
}
