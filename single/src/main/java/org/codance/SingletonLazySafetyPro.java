package org.codance;

/**
 * @author zhaoxg
 * @date 2021/7/8 17:19
 */
public class SingletonLazySafetyPro {

    private volatile static SingletonLazySafetyPro singleton;

    private SingletonLazySafetyPro() {}

    public static SingletonLazySafetyPro getSingleton() {
        if (singleton == null) {
            synchronized (SingletonLazySafetyPro.class) {
                if (singleton == null) {
                    singleton = new SingletonLazySafetyPro();
                }
            }
        }
        return singleton;
    }
}
