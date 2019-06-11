package com.zhy.pattern.decoratorPattern.battercake.v2;

/**
 * @ClassName: BattercakeTest
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/11 16:14
 * @Version: 1.0
 **/
public class BattercakeTest {

    public static void main(String[] args) {
        Battercake battercake;
        //买一个煎饼
        battercake = new Basebattercake();
        //加一个鸡蛋
        battercake = new EggDecorator(battercake);
        //再加一个鸡蛋
        battercake = new EggDecorator(battercake);
        //再加一个香肠
        battercake = new SausageDecorator(battercake);

        //和静态代理的最大的区别就是职责不同
        //静态代理不一定要满足is-a的关系
        //静态代理会做功能增强,同一个职责变的不一样

        //装饰器更多要考虑扩展
        System.out.println(battercake.getMsg()+",总价是:"+battercake.getPrice());
    }
}
