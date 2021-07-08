package org.codance;

/**
 * @author zhaoxg
 * @date 2021/7/8 17:01
 * 说明：
 * 优点：在外部需要使用的时候才进行实例化，不使用的时候不会占用空间。
 *
 * 缺点：线程不安全。看上去，这段代码没什么明显问题，但它不是线程安全的.
 * 假设当前有N个线程同时调用getInstance（）方法，由于当前还没有对象生成，所以一部分同时都进入if语句new Singleton(),那么就会由多个线程创建多个多个user对象。
 */
public class SingletonLazy {

    private static SingletonLazy singletonLazy = null;

    private SingletonLazy(){}

    public static SingletonLazy getSingletonLazy() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
