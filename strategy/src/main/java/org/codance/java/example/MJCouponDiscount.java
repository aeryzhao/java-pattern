package org.codance.java.example;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 满减
 * @author zhaoxg
 * @date 2021/5/17 16:05
 */
public class MJCouponDiscount implements CouponDiscount<Map<String, String>>{
    /**
     * 满减计算
     * 判断满reach减少reduce，否则不减
     */
    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {
        String reach = couponInfo.get("reach");
        String reduce = couponInfo.get("reduce");
        if (skuPrice.compareTo(new BigDecimal(reach)) <0) {
            return skuPrice;
        }
        return skuPrice.subtract(new BigDecimal(reduce));
    }
}
