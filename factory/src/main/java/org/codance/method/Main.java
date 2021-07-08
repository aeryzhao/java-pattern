package org.codance.method;

/**
 * @author zhaoxg
 * @date 2021/7/8 15:58
 */
public class Main {
    public static void main(String[] args) {
        Factory appleFactory = new AppleFactory();
        Factory huaweiFactory = new HuaweiFactory();

        Phone apple = appleFactory.getPhone();
        Phone huawei = huaweiFactory.getPhone();

        System.out.println(apple);
        System.out.println(huawei);

        apple.produce();
        huawei.produce();
    }
}
