package org.codance.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaoxg
 * @date 2021/5/17 16:48
 */
public class CouponPattern {
    public static void main(String[] args) {
        // 直减测试
        Context<Double> zj = new Context<>(new ZJCouponDiscount());
        BigDecimal zjResult = zj.discountAmount(20D, new BigDecimal("100"));
        System.out.println("100满减20后：" + zjResult);
        // 满减测试
        Context<Map<String, String>> mj = new Context<>(new MJCouponDiscount());
        HashMap<String, String> couponInfo = new HashMap<>();
        couponInfo.put("reach", "300");
        couponInfo.put("reduce", "50");
        BigDecimal mjResult = mj.discountAmount(couponInfo, new BigDecimal("340"));
        System.out.println("满300减50，购买340后应付金额：" + mjResult);
        // 折扣测试
        Context<Double> zk = new Context<>(new ZKCoupoonDiscount());
        BigDecimal zkResult = zk.discountAmount(0.6D, new BigDecimal("200"));
        System.out.println("200打六折：" + zkResult);
        // N元购测试
        Context<Double> nyg = new Context<>(new NYGCouponDiscount());
        BigDecimal nygResult = nyg.discountAmount(9.9D, new BigDecimal("29"));
        System.out.println("全场9.9：" + nygResult);
    }
}
