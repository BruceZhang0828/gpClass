package com.zhy.pattern.singletonPattern.threadLocalSingleton;

/**
 * @ClassName: ThreadLocalSingleton
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/4/23 23:14
 * @Version: 1.0
 **/
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }


}
