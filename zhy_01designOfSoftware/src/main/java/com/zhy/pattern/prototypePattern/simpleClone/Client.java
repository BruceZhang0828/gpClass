package com.zhy.pattern.prototypePattern.simpleClone;

/**
 * @ClassName: Client
 * @Description: 创建Client对象
 * @auther: zhy
 * @Date: 2019/4/24 11:00
 * @Version: 1.0
 **/
public class Client {

    private Prototype prototype;

    public Client(Prototype prototype){
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype concretePrototype){
            return (Prototype) concretePrototype.clone();
    }
}
