package org.codance;

/**
 * @author zhaoxg
 * @date 2021/12/30 16:40
 */
public class BuilderPattern {
    public static void main(String[] args) {
        Director director = new Director();
        ConductBuilder conductBuilder = new ConductBuilder();
        director.construct(conductBuilder);
        Produce produce = conductBuilder.getProduce();
        produce.show();
    }
}
