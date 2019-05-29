package com.zhy.pattern.strategyPattern.payMethod;

/**
 * @ClassName: JdPay
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/28 17:58
 * @Version: 1.0
 **/
public class JdPay extends Payment{
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
