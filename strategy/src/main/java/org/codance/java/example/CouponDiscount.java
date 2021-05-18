package org.codance.java.example;

import java.math.BigDecimal;

/**
 * @author zhaoxg
 * @date 2021/5/17 15:53
 */
public interface CouponDiscount<T> {
    /**
     * 优惠券金额计算
     * @param couponInfo 折扣信息：直减、满减、折扣、N元购
     * @param skuPrice 商品价格
     * @return 优惠后的价格
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
