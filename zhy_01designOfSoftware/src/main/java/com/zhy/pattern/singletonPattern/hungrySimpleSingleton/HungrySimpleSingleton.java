package com.zhy.pattern.singletonPattern.hungrySimpleSingleton;

/**
 * @ClassName: LazySimpleSingleton
 * @Description: 饿汉式 单例模式
 * @auther: zhy
 * @Date: 2019/4/22 20:59
 * @Version: 1.0
 **/
public class HungrySimpleSingleton {
    private static final HungrySimpleSingleton LAZY_SIMPLE_SINGLETON = new HungrySimpleSingleton();


    public static HungrySimpleSingleton getInstance(){
        return LAZY_SIMPLE_SINGLETON;
    }
}
