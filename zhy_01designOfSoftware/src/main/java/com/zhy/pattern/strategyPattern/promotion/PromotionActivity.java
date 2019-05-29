package com.zhy.pattern.strategyPattern.promotion;

/**
 * @ClassName: PromotionActivity
 * @Description: 优惠活动
 * @auther: zhy
 * @Date: 2019/5/28 16:17
 * @Version: 1.0
 **/
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }

    public void execte(){
        promotionStrategy.doPromotion();
    }
}
