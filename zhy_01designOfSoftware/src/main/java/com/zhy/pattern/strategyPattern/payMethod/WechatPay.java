package com.zhy.pattern.strategyPattern.payMethod;

/**
 * @ClassName: WechatPay
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/28 17:59
 * @Version: 1.0
 **/
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 256;
    }
}
