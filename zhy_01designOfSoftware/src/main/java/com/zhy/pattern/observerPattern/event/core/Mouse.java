package com.zhy.pattern.observerPattern.event.core;

/**
 * @ClassName: Mouse
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/12 14:13
 * @Version: 1.0
 **/
public class Mouse extends EventLisenter {

    public void click(){
        System.out.println("调用单击");
        this.trigger(MouseEventType.ON_CLICK);
    }

    public void doubleClick(){
        System.out.println("调用双击");
        this.trigger(MouseEventType.ON_DOUBLE_CLICK);
    }

    public void up(){
        System.out.println("调用弹起");
        this.trigger(MouseEventType.ON_UP);
    }

    public void down(){
        System.out.println("调用按下");
        this.trigger(MouseEventType.ON_DOWN);
    }

    public void move(){
        System.out.println("调用移动");
        this.trigger(MouseEventType.ON_MOVE);
    }

    public void wheel(){
        System.out.println("调用滚动");
        this.trigger(MouseEventType.ON_WHEEL);
    }

    public void over(){
        System.out.println("调用悬停");
        this.trigger(MouseEventType.ON_OVER);
    }

    public void focus(){
        System.out.println("调用聚焦");
        this.trigger(MouseEventType.ON_FOCUS);
    }

    public void blur(){
        System.out.println("调用失焦");
        this.trigger(MouseEventType.ON_BLUR);
    }


}
