package org.codance;

/**
 * @author zhaoxg
 * @date 2021/7/8 17:06
 * 说明：
 * 优点：解决了懒汉式线程不安全的问题 ②缺点：线程阻塞，影响性能。
 */
public class SingletonLazySafety {

    private static SingletonLazySafety singletonLazySafety;

    private SingletonLazySafety() {}

    public static synchronized SingletonLazySafety getSingletonLazySafety() {
        if (singletonLazySafety == null) {
            singletonLazySafety = new SingletonLazySafety();
        }
        return singletonLazySafety;
    }
}
