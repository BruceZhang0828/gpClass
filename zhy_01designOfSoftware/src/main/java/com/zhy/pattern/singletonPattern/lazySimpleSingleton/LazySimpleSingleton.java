package com.zhy.pattern.singletonPattern.lazySimpleSingleton;

/**
 * @ClassName: LazySimpleSingleton
 * @Description: 懒汉式 单例模式
 * @auther: zhy
 * @Date: 2019/4/22 21:15
 * @Version: 1.0
 **/
public class LazySimpleSingleton {

    private LazySimpleSingleton(){}
    //静态块 公共内存区域
    private  static  LazySimpleSingleton lazy;

    public synchronized static LazySimpleSingleton getInstance(){
        if (lazy==null){
            synchronized (LazySimpleSingleton.class){
                if (lazy==null){
                    lazy = new LazySimpleSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazy指向刚分配的内存地址
                }
            }
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

    /*public synchronized static LazySimpleSingleton getInstance(){
        if (lazy==null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }*/

    /*public  static LazySimpleSingleton getInstance(){
        if (lazy==null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }*/
}
