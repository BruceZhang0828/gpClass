package com.zhy.pattern.templatePattern.course;

import java.util.AbstractList;

public class NetCourseTest {
    public static void main(String[] args) {
        System.out.println("--- java架构师课程 ----");
        NetWorkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("----大数据课程---");
        NetWorkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }
}
