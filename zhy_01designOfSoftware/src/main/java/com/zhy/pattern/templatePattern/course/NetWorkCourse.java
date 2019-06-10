package com.zhy.pattern.templatePattern.course;

/**
 * 模板会有一个或者多个未实现的方法,
 * 而且这几个未实现的方法有固定的执行循环
 */
public abstract class NetWorkCourse {
    protected final void createCourse(){
        //1.发布预习资料
        this.postPreResource();
        //2.制作ppt
        this.createPPT();
        //3.在线直播
        this.liveVideo();
        //4.提交课件 课堂笔记
        this.postNote();
        //5.提交源码
        this.postSource();
        //6.布置作业,有些课是没有作业的,
        if (needHomeWork()) {
            checkHomeWork();
        }
    }

    abstract void checkHomeWork();

    protected boolean needHomeWork(){
        return false;
    }

    final void postSource(){
        System.out.println("提交源码");
    }

    final void postNote(){
        System.out.println("提交课件和课堂笔记");
    }

    final void liveVideo(){
        System.out.println("直播课程");
    }

    final void createPPT(){
        System.out.println("创建备课ppt");
    }

    final void postPreResource(){
        System.out.println("分发预备资料");
    }
}
