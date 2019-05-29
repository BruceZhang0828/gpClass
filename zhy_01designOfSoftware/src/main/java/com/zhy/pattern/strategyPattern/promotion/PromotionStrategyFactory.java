package com.zhy.pattern.strategyPattern.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: PromotionStrategyFactory
 * @Description: 结合单例模式和工厂模式创建促销活动类
 * @auther: zhy
 * @Date: 2019/5/28 16:54
 * @Version: 1.0
 **/
public class PromotionStrategyFactory {
    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP  = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON,new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASH,new CashPromotion());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY,new GroupPromotion());
    }

    private static final PromotionStrategy NON_PROMOTION = new EmptyStrategy();

    private PromotionStrategyFactory(){}
    /**
     *根据promotionkey获取相关的对象
    **/
    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy==null?NON_PROMOTION:promotionStrategy;
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASH = "CASH";
        String GROUPBUY = "GROUPBUY";
    }
}
