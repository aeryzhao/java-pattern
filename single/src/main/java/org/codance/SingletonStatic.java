package org.codance;

/**
 * 饿汉式方式二
 * @author zhaoxg
 * @date 2021/7/8 16:56
 *
 * 说明：
 * 优点：一般使用static和final修饰变量（具体作用已经在代码里描述了），只在类加载时才会初始化，以后都不会，线程绝对安全，无锁，效率高。
 * 缺点：类加载的时候就初始化，不管用不用，都占用空间，会消耗一定的性能(当然很小很小，几乎可以忽略不计，所以这种模式在很多场合十分常用而且十分简单)
 *
 * 注：这里有两个小知识点：
 * a.如果是final非static成员，必须在构造器、代码块、或者直接定义赋值
 * b.如果是final static 成员变量，必须直接赋值 或者在静态代码块中赋值
 */
public class SingletonStatic {
    private static final SingletonStatic singletonStatic;
    static {
        singletonStatic = new SingletonStatic();
    }

    private SingletonStatic() {}

    public static SingletonStatic getSingletonStatic() {
        return singletonStatic;
    }
}
