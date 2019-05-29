package com.zhy.pattern.strategyPattern.payMethod;

/**
 * @ClassName: AliPay
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/28 17:57
 * @Version: 1.0
 **/
public class AliPay extends Payment{
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
