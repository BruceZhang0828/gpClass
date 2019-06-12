package com.zhy.pattern.observerPattern.event.core;

/**
 * @ClassName: MouseEventTest
 * @Description: 测试代码
 * @auther: zhy
 * @Date: 2019/6/12 14:25
 * @Version: 1.0
 **/
public class MouseEventTest {

    public static void main(String[] args) {

        try {
            MouseEventCallback callback = new MouseEventCallback();

            //注册事件
            Mouse mouse = new Mouse();
            mouse.addLisenter(MouseEventType.ON_CLICK,callback);
            mouse.addLisenter(MouseEventType.ON_MOVE,callback);
            mouse.addLisenter(MouseEventType.ON_WHEEL,callback);
            mouse.addLisenter(MouseEventType.ON_OVER,callback);

            //调用方法
            mouse.click();

            //失去焦点
            mouse.blur();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
