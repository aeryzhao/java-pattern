package org.codance.example;

import java.math.BigDecimal;

/**
 * 折扣
 * @author zhaoxg
 * @date 2021/5/17 16:06
 */
public class ZKCoupoonDiscount implements CouponDiscount<Double>{
    /**
     * 折扣
     * 折扣 * sku
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.multiply(new BigDecimal(couponInfo)).setScale(2, BigDecimal.ROUND_HALF_DOWN);
        if (discountAmount.compareTo(BigDecimal.ZERO) <= 0) {
            return BigDecimal.ZERO;
        }
        return discountAmount;
    }
}
