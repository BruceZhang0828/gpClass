package com.zhy.pattern.decoratorPattern.battercake.v2;

/**
 * @ClassName: EggDecorator
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/11 16:09
 * @Version: 1.0
 **/
public class EggDecorator extends BattercakeDecorator {

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSometing() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"加了1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+1;
    }
}
