package org.codance.java.stategy.example;

import java.math.BigDecimal;

/**
 * @author zhaoxg
 * @date 2021/5/17 16:07
 */
public class Context<T> {
    private CouponDiscount<T> couponDiscount;

    public Context(CouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }
}
