package org.codance.method;

/**
 * @author zhaoxg
 * @date 2021/7/8 15:56
 */
public class HuaweiPhone implements Phone {
    @Override
    public void produce() {
        System.out.println("生产华为手机");
    }
}
