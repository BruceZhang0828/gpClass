package com.zhy.pattern.templatePattern.course;

public class BigDataCourse extends NetWorkCourse {
    private boolean needHomeWorkFalg = false;

    public BigDataCourse(boolean needHomeWorkFalg) {
        this.needHomeWorkFalg = needHomeWorkFalg;
    }

    @Override
    void checkHomeWork() {
        System.out.println("检查大数据课后作业");
    }

    @Override
    protected boolean needHomeWork() {
        return this.needHomeWorkFalg;
    }
}
