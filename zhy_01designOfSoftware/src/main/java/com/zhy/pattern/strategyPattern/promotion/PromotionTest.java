package com.zhy.pattern.strategyPattern.promotion;

import com.sun.deploy.util.StringUtils;

/**
 * @ClassName: PromotionTest
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/28 16:19
 * @Version: 1.0
 **/
public class PromotionTest {
    public static void main(String[] args) {
        /*PromotionActivity jd618 = new PromotionActivity(new CashPromotion());
        PromotionActivity duble11 = new PromotionActivity(new CouponStrategy());
        jd618.execte();
        duble11.execte();*/

        //升级版本
        /*PromotionActivity promotionActivity = null;
        String promotionKey = "COUPON";

        if ("COUPON".equals(promotionKey)) {
            promotionActivity = new PromotionActivity(new CouponStrategy());
        }else if ("CASHBACK".equals(promotionKey)) {
            promotionActivity = new PromotionActivity(new CashPromotion());
        }else {
            promotionActivity = new PromotionActivity(new EmptyStrategy());
        }

        promotionActivity.execte();*/

        //再次升级
        String promotionKey =  "GROUPBUY";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execte();

    }
}
