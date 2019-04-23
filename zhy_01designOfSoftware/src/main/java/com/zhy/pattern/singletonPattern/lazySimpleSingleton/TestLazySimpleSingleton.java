package com.zhy.pattern.singletonPattern.lazySimpleSingleton;

import java.lang.reflect.Constructor;

/**
 * @ClassName: TestLazySimpleSingleton
 * @Description: 懒汉式
 * @auther: zhy
 * @Date: 2019/4/22 22:33
 * @Version: 1.0
 **/
public class TestLazySimpleSingleton {
    public static void main(String[] args) {

        /*Thread thread1 = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());

        thread1.start();
        thread2.start();

        System.out.println("End");*/

        //反射破坏单列
        try {
            Class<LazyInnerClassSingleton> lazyInnerClassSingletonClass = LazyInnerClassSingleton.class;
            Constructor<LazyInnerClassSingleton> declaredConstructor = lazyInnerClassSingletonClass.getDeclaredConstructor(null);
            //强制访问  强吻,不愿意也要去吻
            declaredConstructor.setAccessible(true);
            LazyInnerClassSingleton lazyInnerClassSingleton1 = declaredConstructor.newInstance();
            //调用两次构造方法 相当于new了两次
            LazyInnerClassSingleton lazyInnerClassSingleton2 = declaredConstructor.newInstance();
            System.out.println(lazyInnerClassSingleton1==lazyInnerClassSingleton2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
