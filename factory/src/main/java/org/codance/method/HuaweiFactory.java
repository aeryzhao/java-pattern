package org.codance.method;

/**
 * @author zhaoxg
 * @date 2021/7/8 15:58
 */
public class HuaweiFactory implements Factory {
    @Override
    public Phone getPhone() {
        return new HuaweiPhone();
    }
}
