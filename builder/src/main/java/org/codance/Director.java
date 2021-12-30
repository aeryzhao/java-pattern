package org.codance;

/**
 * @author zhaoxg
 * @date 2021/12/30 17:17
 */
public class Director {
    public void construct(Builder builder) {
        builder.builderPartA();
        builder.builderPartB();
        builder.builderPartC();
    }
}
