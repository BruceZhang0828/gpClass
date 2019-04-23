package com.zhy.pattern.singletonPattern.seriableSingleton;

import java.io.Serializable;

/**
 * @ClassName: SeriableSingleton
 * @Description: 序列化破坏单例
 * @auther: zhy
 * @Date: 2019/4/23 12:14
 * @Version: 1.0
 **/
public class SeriableSingleton implements Serializable {
    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而换一个IO流,写入到其他地方(可以是磁盘,网络IO)
    //内存中状态给永久保存下来

    //反序列化
    //指已经持久化的字节码内容,转化为IO流
    //在转换过程中会重新创建对象 new

    private final static SeriableSingleton INSTANCE = new SeriableSingleton();

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }

}
