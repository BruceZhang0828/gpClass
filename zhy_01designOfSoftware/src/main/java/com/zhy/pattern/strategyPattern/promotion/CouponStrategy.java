package com.zhy.pattern.strategyPattern.promotion;

/**
 * @ClassName: CouponStrategy
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/28 16:12
 * @Version: 1.0
 **/
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠劵,课程的价格直接减优惠劵的面值");
    }
}
