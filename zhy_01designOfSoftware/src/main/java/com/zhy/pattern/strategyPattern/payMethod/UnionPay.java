package com.zhy.pattern.strategyPattern.payMethod;

/**
 * @ClassName: UnionPay
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/28 18:00
 * @Version: 1.0
 **/
public class UnionPay extends Payment{
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 120;
    }
}
