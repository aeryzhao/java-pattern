package org.codance.java.simple;

/**
 * @author zhaoxg
 * @date 2021/5/13 11:12
 */
public abstract class Operation {
    public double numberA;
    public double numberB;

    /**
     * 运算行为
     * @return 计算结果
     */
    public abstract double calculate();

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
