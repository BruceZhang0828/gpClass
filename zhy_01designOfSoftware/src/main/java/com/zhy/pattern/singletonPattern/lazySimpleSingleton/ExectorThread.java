package com.zhy.pattern.singletonPattern.lazySimpleSingleton;

/**
 * @ClassName: ExectorThread
 * @Description: 多线程测试类
 * @auther: zhy
 * @Date: 2019/4/22 21:47
 * @Version: 1.0
 **/
public class ExectorThread implements Runnable {
    public void run() {
        LazySimpleSingleton lazy = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+lazy);
    }
}
