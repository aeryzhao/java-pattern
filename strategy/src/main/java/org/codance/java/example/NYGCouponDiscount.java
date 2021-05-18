package org.codance.java.example;

import java.math.BigDecimal;

/**
 * @author zhaoxg
 * @date 2021/5/17 16:07
 */
public class NYGCouponDiscount implements CouponDiscount<Double>{
    /**
     * N元购
     * 无论原价多少都固定金额购买
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo).setScale(2, BigDecimal.ROUND_DOWN);
    }
}
