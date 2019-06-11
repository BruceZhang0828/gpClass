package com.zhy.pattern.decoratorPattern.battercake.v1;

/**
 * @ClassName: BattercakeWithEggAndSausage
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/11 15:42
 * @Version: 1.0
 **/
public class BattercakeWithEggAndSausage extends BattercakeWithOneEgg{
    @Override
    public String getMsg() {
        return super.getMsg()+"再加一个肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
}
