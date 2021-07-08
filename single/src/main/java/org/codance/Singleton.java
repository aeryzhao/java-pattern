package org.codance;

/**
 * 饿汉式
 * @author zhaoxg
 * @date 2021/7/8 16:54
 */
public class Singleton {
    /**
     * static：
     * ①表示共享变量，语意符合
     * ②使得该变量能在getInstance()静态方法中使用
     * final:
     * ①final修饰的变量值不会改变即常量，语意也符合，当然不加final也是可以的
     * ②保证修饰的变量必须在类加载完成时就已经进行赋值。
     * final修饰的变量，前面一般加static
     */
    private static final Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getSingleton() {
        return singleton;
    }
}
