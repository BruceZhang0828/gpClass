package com.zhy.pattern.decoratorPattern.battercake.v2;

/**
 * @ClassName: Basebattercake
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/11 16:04
 * @Version: 1.0
 **/
public class Basebattercake extends Battercake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
