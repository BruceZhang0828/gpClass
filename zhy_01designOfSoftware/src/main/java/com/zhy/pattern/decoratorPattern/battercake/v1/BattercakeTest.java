package com.zhy.pattern.decoratorPattern.battercake.v1;

/**
 * @ClassName: BattercakeTest
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/11 15:45
 * @Version: 1.0
 **/
public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake  = new Battercake();
        System.out.println(battercake.getMsg()+",总价格是"+battercake.getPrice());
        Battercake battercakeWithOneEgg = new BattercakeWithOneEgg();
        System.out.println(battercakeWithOneEgg.getMsg()+",总价格是"+battercakeWithOneEgg.getPrice());
        Battercake battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getMsg()+",总价格是"+battercakeWithEggAndSausage.getPrice());
    }
}
