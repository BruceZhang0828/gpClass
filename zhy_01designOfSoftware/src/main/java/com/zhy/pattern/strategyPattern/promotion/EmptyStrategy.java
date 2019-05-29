package com.zhy.pattern.strategyPattern.promotion;

/**
 * @ClassName: EmptyStrategy
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/28 16:14
 * @Version: 1.0
 **/
public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("当前无优惠活动");
    }
}
