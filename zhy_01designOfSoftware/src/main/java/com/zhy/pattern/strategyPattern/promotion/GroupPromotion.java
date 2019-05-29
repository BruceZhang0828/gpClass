package com.zhy.pattern.strategyPattern.promotion;

/**
 * @ClassName: GroupPromotion
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/28 16:05
 * @Version: 1.0
 **/
public class GroupPromotion implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("组团人数达到20人,每成员可享受团购价");
    }
}
