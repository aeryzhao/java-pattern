package org.codance.java.stategy.example;

import java.math.BigDecimal;

/**
 * 直减
 * @author zhaoxg
 * @date 2021/5/17 16:05
 */
public class ZJCouponDiscount implements CouponDiscount<Double>{
    /**
     * 直减
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));
        if (discountAmount.compareTo(BigDecimal.ZERO) <= 0) {
            return BigDecimal.ZERO;
        }
        return discountAmount;
    }
}
