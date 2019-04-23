package com.zhy.pattern.singletonPattern.threadLocalSingleton;

import com.zhy.pattern.singletonPattern.lazySimpleSingleton.ExectorThread;

/**
 * @ClassName: ThreadLocalSingletonTest
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/23 23:18
 * @Version: 1.0
 **/
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());


        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());

        t1.start();
        t2.start();

        System.out.println("End");
    }
}
