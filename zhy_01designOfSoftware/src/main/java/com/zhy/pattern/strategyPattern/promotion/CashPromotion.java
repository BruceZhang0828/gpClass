package com.zhy.pattern.strategyPattern.promotion;

/**
 * @ClassName: CashPromotion
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/28 16:07
 * @Version: 1.0
 **/
public class CashPromotion implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现优惠,返回的现金存入到支付宝账号");
    }
}
