package com.zhy.pattern.decoratorPattern.battercake.v2;

/**
 * @ClassName: SausageDecorator
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/11 16:10
 * @Version: 1.0
 **/
public class SausageDecorator extends BattercakeDecorator{
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSometing() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"加了一根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+2;
    }
}
