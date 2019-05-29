package com.zhy.pattern.strategyPattern.payMethod;

/**
 * @ClassName: PayStrategyTest
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/28 18:22
 * @Version: 1.0
 **/
public class PayStrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1","20180528",345.2);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
