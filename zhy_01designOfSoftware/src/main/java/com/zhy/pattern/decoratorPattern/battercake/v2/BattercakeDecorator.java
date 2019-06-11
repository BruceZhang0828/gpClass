package com.zhy.pattern.decoratorPattern.battercake.v2;

/**
 * @ClassName: BattercakeDecorator
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/11 16:06
 * @Version: 1.0
 **/
public abstract class BattercakeDecorator extends Basebattercake {
    private  Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected abstract void doSometing();


    @Override
    protected String getMsg() {
        return battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return battercake.getPrice();
    }
}
