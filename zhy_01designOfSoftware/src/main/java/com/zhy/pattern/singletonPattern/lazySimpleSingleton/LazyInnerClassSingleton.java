package com.zhy.pattern.singletonPattern.lazySimpleSingleton;

/**
 * @ClassName: LazyInnerClassSingleton
 * @Description: 静态内部类 单例模式 安全 高效实现方式
 * @auther: zhy
 * @Date: 2019/4/22 22:53
 * @Version: 1.0
 **/
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        if (LazyHoder.LAZY!=null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        return  LazyHoder.LAZY;
    }


    public static class LazyHoder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
