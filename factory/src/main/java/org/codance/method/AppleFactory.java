package org.codance.method;

/**
 * @author zhaoxg
 * @date 2021/7/8 15:57
 */
public class AppleFactory implements Factory{
    @Override
    public Phone getPhone() {
        return new ApplePhone();
    }
}
