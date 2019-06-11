package com.zhy.pattern.decoratorPattern.battercake.v1;

/**
 * @ClassName: BattercakeWithOneEgg
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/11 15:41
 * @Version: 1.0
 **/
public class BattercakeWithOneEgg extends Battercake {
    @Override
    public String getMsg() {
        return super.getMsg() + "加一个蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }
}
