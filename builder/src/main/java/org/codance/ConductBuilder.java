package org.codance;

/**
 * @author zhaoxg
 * @date 2021/12/30 17:12
 */
public class ConductBuilder implements Builder{
    Produce produce = new Produce();

    @Override
    public void builderPartA() {
        produce.addPart("构建AAA");
    }

    @Override
    public void builderPartB() {
        produce.addPart("构建BBB");
    }

    @Override
    public void builderPartC() {
        produce.addPart("构建CCC");
    }

    @Override
    public Produce getProduce() {
        return produce;
    }
}
